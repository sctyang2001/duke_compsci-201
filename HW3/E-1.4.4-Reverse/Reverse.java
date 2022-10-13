import java.util.Arrays;

public class Reverse
{
    public static void main(String[] args)
    {
        
        int n = args.length;
        
        String[] arr = new String[n];
        
        // initialize: copy the args into String[] arr
        for (int i = 0; i < n; i++){
            arr[i] = args[i];
        }

        // Reverse the values in arr.
        // Complete the JPA code here, see README on course website for problem description and instructions.

        for (int j = 0; j <= (n-1)/2 ; j++){
            String t = arr[j];
            arr[j] = arr[(n-1)-j];
            arr[(n-1)-j] = t;
        }


        
        // Print out the array elements
        for (int i=0;i < arr.length; i++) {
            System.out.print(arr[i] + ' ');
        }
        System.out.println();
        return;
    }
}