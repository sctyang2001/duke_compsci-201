public class OrderCheck
{
    public static void main(String[] args)
    {
        // Exercise 1.2.28 OrderCheck
        // check if the three arguments are strictly ascending or descending 

        // Complete the JPA code here, see README on course website for problem description and instructions.
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        boolean N = (a < b && b < c ) || (a > b && b > c);
        System.out.println(N);

        return;
    }
}