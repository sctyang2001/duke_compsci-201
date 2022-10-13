public class TerrainAnalysis {
    public static void main(String[] args) {

        // Complete the JPA code here, see README on course website for problem description and instructions.

        int row = StdIn.readInt(); 
        int col = StdIn.readInt(); 
        Double[][] terrain = new Double[row][col];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                terrain[i][j] = StdIn.readDouble(); 
            }
        }
        int numPeak = 0;
        for (int i=1; i<row-1; i++){
            for (int j=1; j<col-1; j++){
                if ((terrain[i][j] > terrain[i-1][j]) && (terrain[i][j] > terrain[i+1][j]) && (terrain[i][j] > terrain[i][j-1]) && (terrain[i][j] > terrain[i][j+1])) {numPeak++;}
            }
        }
        StdOut.println("Number of peaks: " + numPeak);


    }
}