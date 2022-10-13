public class HamDistance
{
   // Complete the JPA code here, see README on course website for problem description and instructions.
    public static void main(String[] args)
    {
        int k = Integer.parseInt(args[0]);
        String str = args[1];
        char[] arr = str.toCharArray();
        hamdist(arr, k, 0); 
    }
   
    public static void flip(char[] arr, int n)
    {
        if (arr[n]=='0') {arr[n]='1';}
        else {arr[n]='0';}
    }

    public static void hamdist(char[] arr, int k, int start_pos)
    {
        if ((k!=0) && (start_pos<=arr.length-1)){
            hamdist(arr, k, start_pos+1); 
            flip(arr, start_pos);
            hamdist(arr, k-1, start_pos+1);
            flip(arr, start_pos);
        }
        else {System.out.println(arr);}
    }
}