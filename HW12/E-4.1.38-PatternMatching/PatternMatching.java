public class PatternMatching {
    //-----------------------------------------------
    // Instance Variable
    //-----------------------------------------------
    private int[][] pixels;
    
    //-----------------------------------------------
    // Constructor
    //-----------------------------------------------
    public PatternMatching(int [][] pixels) {
        this.pixels = pixels;
    }
    
    //-----------------------------------------------
    // Method
    //-----------------------------------------------
    public static void print2d(int [][] a){
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a.length; j++){
                System.out.print(a[i][j]+ " " );
            }
            System.out.println();
        }
    }
    public String matchPattern() { 
        
        int startColIndex = 0;
        int startRowIndex = 0;
        int largestSquareLength = 0;

        // Complete the JPA code here, see README on course website for problem description and instructions.

        int n = pixels.length;
        int[][] s = new int[n][n];

        /* copying  the last row and column */
        for (int i = 0; i < n; i++){
            s[n-1][i] = pixels[n-1][i];
        }

        for (int ii = 0; ii < n; ii++){
            s[ii][n-1] = pixels[ii][n-1];
        }

        /* computing the fking sum */
        for (int ro = n-2; ro >=0; ro--)
            for (int co = n-2; co>=0; co--){
                if (pixels[ro][co] == 1) s[ro][co] = Math.min(s[ro+1][co],Math.min(s[ro+1][co+1],s[ro][co+1])) +1;
                else s[ro][co] = 0;
            }
        
        
        /* loop thru the s[][] to find the largest value */
        for (int ro = 0; ro < n; ro++)
            for (int co = 0; co < n; co++){
                if (s[ro][co] > largestSquareLength){
                    largestSquareLength = s[ro][co];
                    startRowIndex = ro;
                    startColIndex = co;
                } 

            }
        
        // Don't touch the rest of the code
        return "The largest black pixel squares have side length: " +  largestSquareLength
            + "\n And the most top-left of them begins at index coordinate: " + "(" + startRowIndex + ", " + startColIndex + ")";
    }

    //-----------------------------------------------
    // Test client 
    //-----------------------------------------------
    public static void main(String[] args) {
        
        int [] raw = StdIn.readAllInts();
        int n = (int)Math.sqrt(raw.length);
        int [][] A = new int [n][n];

        // Convert 1D array in a square matrix
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j ++) {
                A [i][j] = raw[i*n+j];
            }
        }
        
        // Create the object
        PatternMatching p = new PatternMatching(A);

        // Evaluate
        System.out.println (p.matchPattern());
        return;
    }
}
