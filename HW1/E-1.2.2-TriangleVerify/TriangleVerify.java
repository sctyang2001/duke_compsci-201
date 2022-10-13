public class TriangleVerify
{
    public static void main(String[] args)
    {
        // Exercise 1.2.2 on textbook
        // read a theta angle from command line argument, and output the value of cos(theta)^2 + sin(theta)^2
        
        double theta = Double.parseDouble(args[0]);
        double A = (Math.sin(theta))*(Math.sin(theta)) + (Math.cos(theta))*(Math.cos(theta));
        System.out.println(A);
        // Complete the JPA code here, see README on course website for problem description and instructions.

        return;
    }
}
