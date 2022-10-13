
public class TenPerLine {

    public static void main(String[] args) {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int n = 0;
        int[] arr = new int[10000];
        for (int i=0; i<10000; i++){
            arr[i] = StdIn.readInt(); 
            n++;
            if (arr[i] == -1) {break;}
        }
        int row = n / 10 + 1;
        int col = 10;
        int lastCol = n % 10;
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (arr[i*10+j] == -1) {break;}
                StdOut.printf("%2d ", arr[i*10+j]);
                if (j == 9) {StdOut.println("");}
            }
        }


    }

}