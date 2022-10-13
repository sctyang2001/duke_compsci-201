public class Signum
{
    public static int signum (int n)
    {
        if (n>0) {return 1;}
        else if (n==0) {return 0;}
        else {return -1;}

    }
    // Complete the JPA code here, see README on course website for problem description and instructions.





    public static void main(String[] args)
    {
        // Do not change this part
        int n =Integer.parseInt(args[0]);
        System.out.println(signum(n));

    }
}