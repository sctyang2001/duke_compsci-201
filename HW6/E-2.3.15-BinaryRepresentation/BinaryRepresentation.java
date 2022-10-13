public class BinaryRepresentation
{
    // Complete the JPA code here, see README on course website for problem description and instructions.
    public static long ConvertToBinary(int n){
        // 
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (n == 0) {return 0;}
        else {return (n % 2 + 10 * ConvertToBinary(n / 2));}
    }
    public static void main(String[] args)
    {
        // Do not change this part
        int n = Integer.parseInt(args[0]);
        System.out.println(ConvertToBinary(n));
    }
}
