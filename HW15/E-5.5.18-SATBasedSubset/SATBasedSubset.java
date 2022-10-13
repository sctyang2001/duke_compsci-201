public class SATBasedSubset{

    private int sum;
    private int[] arr;
    private boolean[] inSubset;
    private final int n;

    public SATBasedSubset(int sum, int[] arr)
    {
        this.sum = sum;
        this.arr = arr;
        n = arr.length;
        inSubset = new boolean[n]; 
        while (next()){
            if(check(sum, inSubset, arr))
                return;
                
        }
    }

    private boolean next()
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int i = n-1;
        while (inSubset[i])
        {
            inSubset[i--] = false;
            if (i == -1) 
            {
                return false;
            }
        }
        inSubset[i] = true;
        return true;
    }


    public static boolean check(int sum, boolean[] inSubset, int []arr)
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int m = arr.length;
        int sum1 = 0;
        boolean a = false;
        for (int i = 0; i < m; i++){
            if (inSubset[i]){
                sum1 += arr[i];
            }
        }
        if (sum1 == sum){
            a = true;
        }
        return a;
    }

    public String toString()
    {
        String solverString = new String("");
        // Complete the JPA code here, see README on course website for problem description and instructions.
        
        for(int i = 0; i < n; i++){
            int x;
            if (inSubset[i] == true){
                x = 1;
            }
            else{
                x = 0;
            }
            solverString += x;
        }
        int count = 0;
        for (int k = 0; k < solverString.length(); k++){
            int ad = 0;
            if (solverString.charAt(k) != '0'){
                ad = 1;
            }
            count = count + ad;
        }
        if (count == 0){
            solverString = "No solution found";
        }
        return solverString;
    }

    public static void main(String[] args){
        // String filename = args[0];
        int sum = StdIn.readInt();
        int []arr = StdIn.readAllInts();
        SATBasedSubset solver = new SATBasedSubset(sum, arr);
        StdOut.println(solver);
    }
}