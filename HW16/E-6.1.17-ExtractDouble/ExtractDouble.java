import java.math.BigInteger;

public class ExtractDouble
{
    public static void main(String[] args)
    {

        // Complete the JPA code here, see README on course website for problem description and instructions.
        double x = Double.parseDouble(args[0]);
        long bits = Double.doubleToLongBits(x);
        long signBit = (bits >> 63) & 0x0000000000000001;
        long exponentBits = (bits >> 52) & 0x00000000000007FF;
        long fractionBits = (bits >> 0) & 0x000FFFFFFFFFFFFFL;//0x000FFFFFFFFFFFFF
        long exponent = exponentBits - 1023;
        double fraction = 1.0 * fractionBits / (1L << 52);
        double mantissa = 1.0 + fraction;
        if (signBit == 1) StdOut.println("Sign: -");
        else StdOut.println("Sign: +");
        StdOut.println("Exponent: " + exponent);
        StdOut.println("Mantissa: " + mantissa);

    }
}