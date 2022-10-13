import java.util.*;

public class IntegerProperty
{
    public static void main(String[] args)
    {
        // don't change this 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(isPrime(a));
        System.out.println(isPrime(b));
        System.out.println(isRelativePrime(a, b));
        for (int f : factor(a)) System.out.print(f + " "); System.out.println();
        for (int f : factor(b)) System.out.print(f + " "); System.out.println();
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
        System.out.println(phi(a));
        System.out.println(phi(b));
    }

    // Exercise 2.2.23 IntegerProperty
    // create the functions below: isPrime(), isRelativePrime(), factor(), gcd(), lcm(), phi()
    
    public static boolean isPrime(int x) // is prime?
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        boolean isPrime = true;
        for (long j=2; j<=x/j; j++)
            if (x%j==0) {isPrime=false;}
        return isPrime;
    }

    public static boolean isRelativePrime(int a, int b) // is relative prime?
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        boolean isRP=false;
        int min, max;
        if (a<b) {min=a; max=b;}
        else {min=b; max=a;}
        for (long factor = 2; factor<=min/factor; factor++){//factor the minimum
            if (min%factor==0) 
                if (max%factor==0)
                    isRP=true;
        }
        return (gcd(a,b)==1);
    }

    public static int[] factor(int x) // get all factors
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int[] temp = new int[(int)Math.sqrt(x)+100];
        int[] checklist = new int[(int)Math.sqrt(x)];
        int j=0;
        int valueOfX = x;
        for (int factor = 2; factor<=x; factor++){
            while (x%factor==0){
                if (j>0){
                    if (temp[j-1]!=factor){
                        // checklist[factor-1] = 1;
                        x/=factor;
                        // System.out.println("factoring: one of the factors is "+ factor);
                        temp[j]=factor; j++;
                    }
                    else {x/=factor;}
                }
                else{
                    temp[j]=factor; j++;
                    x/=factor;
                }
            }
        }
        x = valueOfX;
        int counter = 0;
        for (int jj = 0; jj<Math.sqrt(x)-1; jj++)
            if (temp[jj]!=0) {counter++;}
        int[] factors = new int[counter];


        int l=0;
        for (int k=0; k<temp.length;k++)
        {
            if (temp[k]!=0) 
            {
                factors[l] = temp[k];
                l++;
            }
        }

        return factors;



    }
    public static int gcd(int a, int b) // greatest common divisor
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int gcd = 1;
        int min, max;
        if (a<b) {min=a; max=b;}
        else {min=b; max=a;}
        for (int i = 1; i<=min; i++){
            if ((min%i==0)&&(max%i==0)) gcd = i;
        }
        return gcd;
    }

    public static int lcm(int a, int b) // least common multiplier
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int lcm = a/gcd(a,b)*b;
        return lcm;
    }

    public static int phi(int x) // Euler's totient function
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int res = x;
        for (int i = 2; i <= x; ++i)
            if (x % i == 0){
                res = res / i * (i - 1);
                while (x % i == 0) {x /= i;}
            }
        return res;
    }

}