public class Collatz
{
   	// Exercise 2.3.29 Collatz
    // Complete the JPA code here, see README on course website for problem description and instructions.
    
    // Followed Professor Jiang's and Baron's idea for this question.
    public static long collatz(long n, long[] memo)
    {
        if ((n<memo.length)&&(memo[(int)n]!=0)) {return memo[(int)n];}
        if (n == 1) {return 1;}
        if (n % 2 == 0) {
            if ((n<memo.length)&&(memo[(int)n]==0)) {memo[(int)n] = 1+collatz(n/2, memo);}
            return (1+collatz(n/2, memo));
        }
        else {
            if ((n<memo.length)&&(memo[(int)n]==0)) {memo[(int)n] = 1+collatz(3*n+1, memo);}
            return (1+collatz(3*n+1, memo));
        }
    }
    public static void main(String[] args)
    {
        long n = Long.parseLong(args[0]);
        long[] memo = new long[20000000];//creating memo
        long maxFunctionValue = 0, max = 0;
        for (long i = 1; i <= n; i++){
            if (memo[(int)i]==0) {memo[(int)i] = collatz(i, memo);}
            if (memo[(int)i] > maxFunctionValue){
                max = i;
                maxFunctionValue = memo[(int)i];
            }
        }
        System.out.println(max);
    }

}