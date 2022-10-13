public class nHellos {
    public static void main(String[] args) {

        // Complete the JPA code here, see README on course website for problem description and instructions.
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++)
        {
            if ((i % 100 - 10) > 0 && (i % 100 - 10)< 10)
            {
                System.out.println(i + "th" + " hello");
            }
            else
            {
                if (i % 10 == 1) System.out.println(i + "st" + " hello");
                else if (i % 10 == 2) System.out.println(i + "nd" + " hello");
                else if (i % 10 == 3) System.out.println(i + "rd" + " hello");
                else System.out.println(i + "th" + " hello");
            }
            
        }

    }
}
