public class PrimeSieve
{
    public static void main(String[] args) { 

        //Problem Description:Write a program that takes an integer
        //command-line argument n and computes the number of primes
        //less than or equal to n.

        // Complete the JPA code here, see README on course website for problem description and instructions.

        int n = Integer.parseInt(args[0]);
      boolean[] isPrime = new boolean[n+1];
      for (int i = 2; i <= n; i++)
         isPrime[i] = true;

      for (int i = 2; i <= n/i; i++)
      {  if (isPrime[i])
         {  // Mark multiples of i as nonprime.
            for (int j = i; j <= n/i; j++)
               isPrime[i * j] = false;
         }
      }

      // Count the primes.
      int primes = 0;
      for (int i = 2; i <= n; i++)
         if (isPrime[i]) primes++;
      System.out.println(primes);


    }
}