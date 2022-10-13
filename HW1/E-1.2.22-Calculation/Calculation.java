public class Calculation
{
    public static void main(String[] args)
    {
        // Exercise 1.2.22 
        // Complete the JPA code here, see README on course website for problem description and instructions.
        double X0 = Double.parseDouble(args[0]);
        double V0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.80665;
        double C = X0 + (V0 * t) - ((g * t * t) / 2);
        System.out.println(C);

        return;
    }
}
