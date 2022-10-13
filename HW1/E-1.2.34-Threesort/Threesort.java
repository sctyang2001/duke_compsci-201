public class Threesort
{
    public static void main(String[] args)
    {
        // Exercise 1.2.34 Threesort
        // sort three numbers
        
        // Read the three numbers from command line 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int min    = Math.min(a, Math.min(b, c));
        int max    = Math.max(a, Math.max(b, c));
        int median = a + b + c - min - max;

        // print stats

        System.out.println(min + " " + median + " " + max);




        return;
    }
}