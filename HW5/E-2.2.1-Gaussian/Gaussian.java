public class Gaussian
{
    public static void main(String[] args)
    {
        // don't change this
        double a = StdIn.readDouble();
        double b = StdIn.readDouble();
        double c = StdIn.readDouble();
        StdOut.println(pdf(a, b, c));
        StdOut.println(cdf(a, b, c));
    }

    public static double pdf(double x)
    {
        return Math.exp(-x * x / 2) / Math.sqrt(2 * Math.PI);
    }
    
    public static double cdf(double z)
    {
        if (z < -8.0) return 0.0;
        if (z > 8.0) return 1.0;
        double sum = 0.0;
        double term = z;
        for (int i = 3; sum != sum + term; i += 2)
        {
            sum = sum + term;
            term = term * z * z / i;
        }
        return 0.5 + pdf(z) * sum;
    }

    // Exercise 2.2.1 Gaussian
    // implements the three-argument pdf and cdf below
    
    public static double pdf(double x, double mu, double sigma)
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        return pdf((x - mu) / sigma) / sigma;

    }
    
    public static double cdf(double z, double mu, double sigma)
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        return cdf((z - mu) / sigma);

    }

}