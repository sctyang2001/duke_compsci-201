public class ArrayIO
{
    // it doesn't make sense to instantiate this class
    private ArrayIO() { }

    // Exercise 2.2.11 ArrayIO
    // implement the 12 functions below

    /**
     * Reads a 1D array of doubles from standard input and returns it.
     *
     * @return the 1D array of doubles
     */
    public static double[] readDouble1D()
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int n = StdIn.readInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = StdIn.readDouble();
        }
        return arr;

    }

    /**
     * Prints an array of doubles to standard output.
     *
     * @param a the 1D array of doubles
     */
    public static void print(double[] a) {
        
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int x = a.length;
            StdOut.println(x);
        for (int i=0;i<a.length;i++)
        StdOut.print(a[i] + (i == x - 1 ? "\n" : " "));



    }

        
    /**
     * Reads a 2D array of doubles from standard input and returns it.
     *
     * @return the 2D array of doubles
     */
    public static double[][] readDouble2D() {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int row = StdIn.readInt(), col = StdIn.readInt();
        double[][] arr = new double[row][col];
        for (int i = 0; i < row; i++) 
            for (int j=0;j<col;j++)
                arr[i][j] = StdIn.readDouble();
        
        return arr;
    }

    /**
     * Prints the 2D array of doubles to standard output.
     *
     * @param a the 2D array of doubles
     */
    public static void print(double[][] a) {
        
        int m = a.length;
        int n = a[0].length;
        StdOut.println(m + " " + n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                StdOut.print(a[i][j] + (j == n - 1 ? "\n" : " "));
            }
        }

    }


    /**
     * Reads a 1D array of integers from standard input and returns it.
     *
     * @return the 1D array of integers
     */
    public static int[] readInteger1D() {

        int n = StdIn.readInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdIn.readInt();
        }
        return a;

    }

    /**
     * Prints an array of integers to standard output.
     *
     * @param a the 1D array of integers
     */
    public static void print(int[] a) {

        int n = a.length;
        StdOut.println(n);
        for (int i = 0; i < n; i++) {
            StdOut.print(a[i] + (i == n - 1 ? "\n" : " "));
        }

    }

        
    /**
     * Reads a 2D array of integers from standard input and returns it.
     *
     * @return the 2D array of integers
     */
    public static int[][] readInteger2D() {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int ro = StdIn.readInt(), co = StdIn.readInt();
        int[][] a = new int[ro][co];
        for (int i = 0; i < ro; i++) 
            for (int j=0;j<co;j++)
                a[i][j] = StdIn.readInt();
        
        return a;
    }

    /**
     * Print a 2D array of integers to standard output.
     *
     * @param a the 2D array of integers
     */
    public static void print(int[][] a) {

        int m = a.length;
        int n = a[0].length;
        StdOut.println(m + " " + n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                StdOut.print(a[i][j] + (j == n - 1 ? "\n" : " "));
            }
        }

    }


    /**
     * Reads a 1D array of booleans from standard input and returns it.
     *
     * @return the 1D array of booleans
     */
    public static boolean[] readBoolean1D() {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int n = StdIn.readInt();
        boolean[] a = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdIn.readBoolean();
        }
        return a;
    }

    /**
     * Prints a 1D array of booleans to standard output.
     *
     * @param a the 1D array of booleans
     */
    public static void print(boolean[] a) {
        // Complete the JPA code here, see README on course website for problem description and instructions.

        int n = a.length;
        StdOut.println(n);
        for (int i = 0; i < n; i++) {
            StdOut.print(a[i] + (i == n - 1 ? "\n" : " "));
        }
    }

    /**
     * Reads a 2D array of booleans from standard input and returns it.
     *
     * @return the 2D array of booleans
     */
    public static boolean[][] readBoolean2D() {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int ro = StdIn.readInt(), co = StdIn.readInt();
        boolean[][] a = new boolean[ro][co];
        for (int i = 0; i < ro; i++) 
            for (int j=0;j<co;j++)
                a[i][j] = StdIn.readBoolean();
        
        return a;
    }

    /**
     * Prints a 2D array of booleans to standard output.
     *
     * @param a the 2D array of booleans
     */
    public static void print(boolean[][] a) {
        // Complete the JPA code here, see README on course website for problem description and instructions.

        int m = a.length;
        int n = a[0].length;
        StdOut.println(m + " " + n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                StdOut.print(a[i][j] + (j == n - 1 ? "\n" : " "));
            }
        }

    }


    // main function, don't change
    public static void main(String[] args)
    {
        // read and print an array of doubles
        double[] a = ArrayIO.readDouble1D();
        ArrayIO.print(a);
        StdOut.println();

        // read and print a matrix of doubles
        double[][] b = ArrayIO.readDouble2D();
        ArrayIO.print(b);
        StdOut.println();

        // read and print an array of ints
        int[] c = ArrayIO.readInteger1D();
        ArrayIO.print(c);
        StdOut.println();

        // read and print a matrix of ints
        int[][] d = ArrayIO.readInteger2D();
        ArrayIO.print(d);
        StdOut.println();

        // read and print a matrix of booleans
        boolean[] e = ArrayIO.readBoolean1D();
        ArrayIO.print(e);
        StdOut.println();

        // read and print a matrix of booleans
        boolean[][] f = ArrayIO.readBoolean2D();
        ArrayIO.print(f);
        StdOut.println();
    }
}