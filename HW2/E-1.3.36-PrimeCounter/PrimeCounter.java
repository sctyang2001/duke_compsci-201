public class PrimeCounter 
{
    // task: Write a program PrimeCounter that takes an integer
    // command-line argument n and finds all primes less than or equal to
    // n.
    
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        // Complete the JPA code here, see README on course website for problem description and instructions.
        for (int num = 2; num <= n; num++)
        {
        boolean prime = true;   
            for (int i = 2; i < num; i++)
            {
                while (num % i == 0) {prime = false; break;}
            }
        if (prime == true) System.out.println(num); 
        }
    }
}