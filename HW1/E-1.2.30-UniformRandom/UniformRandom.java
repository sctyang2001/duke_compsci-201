import java.util.Random;

public class UniformRandom
{
    public static void main(String[] args)
    {
        // Exercise 1.2.30 UniformRandom
        // generate random number and print average, min and max
        
        // Get the random seed from command line options or default to 0
        int rand_seed = 0;
        if (args.length>0) rand_seed = Integer.parseInt(args[0]);

        // Initialize a random generator with a seed, to generate a
        // deterministic random sequence given the same seed.
        Random r = new Random(rand_seed);

        // Generate 3 random numbers: Instead of using Math.random(),
        // here we use r.nextDouble() to generate 3 random dobule
        // value.
        double a = r.nextDouble(), b = r.nextDouble(), c = r.nextDouble();
        
        
        // Now, compute Average, Min, Max of a, b, and c
        double Avg = (a + b + c)/3;
        double Min = a;
        if (Min > b) Min = b;
        if (Min > c) Min = c;
        double Max = a;
        if (Max < b) Max = b;
        if (Max < c) Max = c;
        
        System.out.println("Average: " + Avg);
        System.out.println("Min: " + Min);
        System.out.println("Max: " + Max);
        // Complete the JPA code here, see README on course website for problem description and instructions.





        return;
    }
}