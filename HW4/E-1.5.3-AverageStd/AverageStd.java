import java.util.*;

public class AverageStd {

    public static void main(String[] args) {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        double[] arr = new double[10000];
        double n = 0.0;
        double sum = 0.0;
        for (int i=0; i<10000; i++){
            if (!StdIn.isEmpty()) {
                arr[i] = StdIn.readDouble(); 
                sum = sum + arr[i];
                n++;
            }
            else {break;}
        }
        double avg = sum/n;
        double sumAvg = 0.0;
        for (int i=0; i<(int)n; i++) {
            sumAvg = sumAvg + Math.pow(arr[i] - avg, 2);
        }
        double stdDiv = Math.sqrt(sumAvg/(n-1));
        StdOut.println("Average is " + avg);
        StdOut.println("Standard Deviation is " + stdDiv);
    }

}