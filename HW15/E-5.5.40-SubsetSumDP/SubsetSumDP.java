import java.util.ArrayList;

public class SubsetSumDP {

    public static void main(String[] args) 
    {
        int sum = StdIn.readInt();
        int []arr = StdIn.readAllInts();
        
        boolean found = false;
        
        // Complete the JPA code here, see README on course website for problem description and instructions.
        
        int n = arr.length;
        if (isSubsetSum(arr, n, sum) == true)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
    
    static boolean isSubsetSum(int set[],int n, int sum)
    {
        boolean subset[][] = new boolean[sum + 1][n + 1];
        for (int i = 0; i <= n; i++)
            subset[0][i] = true;

        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;
        for (int i = 1; i <= sum; i++) 
        {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= set[j - 1])
                    subset[i][j] = subset[i][j] || subset[i - set[j - 1]][j - 1];
            }
        }
        return subset[sum][n];
    }
}