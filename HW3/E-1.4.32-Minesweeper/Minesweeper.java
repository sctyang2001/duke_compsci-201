public class Minesweeper
{
    public static void main(String[] args)
    {
        // Exercise 1.4.32 Minesweeper


        int n = Integer.parseInt(args[0]), m = Integer.parseInt(args[1]);

        // mineField[i][j]==true if there is a mine at slot (i,j)
        boolean[][] mineField = new boolean[n][m];
        
        // value is used to compute 
        int[][] value = new int[n][m];
        
        // The following code is given to read a mine-field
        // specification. See problem description for further
        // informaiton
        
        //---------------------------------------
        //  "mineField"
        //---------------------------------------
        // We use a 2D array to represent the mine field:
        //    1. mineField[i][i] == true if there is a mine in slot (i,j)
        //    2. mineField[i][i] == false if there is a no mine in slot (i,j)
        
        //-------------------------------------------------------------
        // The following code is given (don't modify) to read in the
        // specification of a mine field
        // -------------------------------------------------------------
        // See problem description for the form of the mine-field
        // specification
        for (int i = 0; i < n; ++i)
        for (int j = 0; j < m; ++j)
        {
            char ch = ' ';
            while (ch == ' ' || ch == '\n') ch = StdIn.readChar();
            if (ch == '*') mineField[i][j] = true;
            else mineField[i][j] = false;
        }
        
        // Fill in the code to compute the 2D-array 'value' 
        // Complete the JPA code here, see README on course website for problem description and instructions.
        
        System.out.println();
            for (int row = 0; row < n; row++)
                for (int col = 0; col < m; col++){
                    int num = 0;
                    for (int i = -1; i < 2; i++){
                        for (int j = -1; j < 2; j++){
                            if ((col+j<0) || (row+i<0) || (row+i>n-1) || (col+j>m-1));
                            else if (mineField[row+i][col+j]) {num++;}
                        }
                    }
                    if (mineField[row][col]) {num = num - 1;}
                    value[row][col] = num;
                }



        //-----------------------------------------------
        // The following code print the content of 'value' 
        //-----------------------------------------------
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
            {
                StdOut.print(value[i][j]);
                if (j == m - 1) StdOut.println();
                else StdOut.print(" ");
            }
        

        return;
    }
}