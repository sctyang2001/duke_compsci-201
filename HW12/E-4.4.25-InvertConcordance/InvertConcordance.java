public class InvertConcordance
{
    public static void main(String[] args)
    {
        // Exercise 4.4.25 InvertConcordance
        // invert concordance
        int n = Integer.parseInt(args[0]);
        ST<Integer, String> table = new ST<Integer, String>();
        // Complete the JPA code here, see README on course website for problem description and instructions.

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            String[] remaining = StdIn.readLine().split(" ");
            for (String each: remaining){
                if(!each.strip().isEmpty()){
                    String stripper = each.strip();
                    int stripperInt;
                    stripperInt = Integer.parseInt(stripper);
                    table.put(stripperInt, word);
                    }
            }
        }

        for (int i = 0; i <= n; i++)
        {
            if (table.get(i) != null)
                System.out.print(table.get(i)+" ");
        }
        return;
    }
}
