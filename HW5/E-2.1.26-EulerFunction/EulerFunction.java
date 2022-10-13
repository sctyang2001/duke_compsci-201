public class EulerFunction{
    // Complete the JPA code here, see README on course website for problem description and instructions.
  
    public static int euler(int n)
    {
        int valueOfN = n;
        int fi = 1;
        int numOfPrimes = 0;
        int[][] factorsAndExponents = new int[2][99999999];
        for (int i=2 ; i <= n ; i++)
        {
            int exponent=0;
            boolean isPrime = true;
            for (int ii=2; ii<i; ii++)
                {
                    if (i%ii==0) isPrime=false;
                }
                
            if (isPrime)
            {
                numOfPrimes++;
                while (n%i==0)
                {
                    ++exponent;
                    n = n/i;
                }
                n = valueOfN;
                // System.out.println(i+" is a prime");
                factorsAndExponents[0][i-2] = i;
                factorsAndExponents[1][i-2] = exponent;
                // System.out.println(factorsAndExponents[1][i-2]);
            }

        }
        // System.out.println(numOfPrimes);

        for (int i = 0; i<n ; i++)
        {
            int p = factorsAndExponents[0][i];
            int k = factorsAndExponents[1][i];
            if (k!=0)
            {
            // System.out.println("p="+p+" k="+k);
            fi = fi * (p - 1) * (int)Math.pow(p, (k-1));
            // System.out.println(fi+" at "+i+" phi= "+fi);
            }
        }
        
        //generate nums less than n.
        //divide n by nums. See how many loops it takes to make n%num != 0. Value of n could change during this. (n=n/num)
        //find the prime factors and tbeir exponents, and arrange them into a 2-D array
        //calculate (primeFactor-1)*Math.pow(primeFactor,exponent)
        return fi;
    }

    public static void main(String[] args) {
        // Do not change this
        int n=Integer.parseInt(args[0]);
        System.out.println(euler(n));
    }
    
}