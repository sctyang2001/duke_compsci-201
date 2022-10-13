import java.util.Arrays;

public class Scale {
    // textbook 2.1.16
    
    public static double max(double[] arr){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        double max = 0.0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max) {max=arr[i];}
        }
        return max;

    }
    public static double min(double[] arr){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        double min = 9999999.0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min) {min=arr[i];}
        }
        return min;


    }
    public static void scale(double[] arr){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        double maxV = Scale.max(arr);
        double minV = Scale.min(arr);
        double delta = maxV - minV;

        for (int i=0; i<arr.length; i++){
            arr[i] = (arr[i] - minV) / delta;
        }
    }

    public static void main(String[] args) {
        // Do not change this part
        double[] arr=StdIn.readAllDoubles();
        scale(arr);
        System.out.println(Arrays.toString(arr));
    }
}