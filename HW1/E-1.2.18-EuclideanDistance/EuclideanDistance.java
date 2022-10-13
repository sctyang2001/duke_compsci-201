import javax.crypto.interfaces.DHKey;

public class EuclideanDistance
{
    public static void main(String[] args)
    {
        // Exercise 1.2.18 on textbook
        // compute the Euclidean distance from (0, 0) to (x, y)
        // where x and y takes from command line
        // Complete the JPA code here, see README on course website for problem description and instructions.

        int X = Integer.parseInt(args[0]);
        int Y = Integer.parseInt(args[1]);
        double D = Math.sqrt(X * X + Y * Y);
        System.out.println(D);

        return;
    }
}
