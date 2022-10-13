import java.util.Arrays;
public class ClosestPair {
    
    static int [] findclosestPair(int[] a) 
    {
        
        // Hint: call Java's sorting routine, check out Arrays.sort
        
        // Complete the JPA code here, see README on course website for problem description and instructions.
        
        sort(a);
        int minDiff = 999999999, pair1 = 0, pair2 = 0;
        for (int i = 1; i < a.length; i++)
            {
                if ((a[i]-a[i-1]) < minDiff) 
                    {
                        minDiff = a[i]-a[i-1];
                        pair1=a[i-1];
                        pair2=a[i];
                    }
            }
            int [] pair = new int[2];
                pair[0]=pair1;
                pair[1] = pair2;
            return pair;
    }
    
    //---------------------------------------------------
    // Test Client : Don't modify anything below this line. 
    //---------------------------------------------------
    
    public static void sort(int[] a)
    {
        // for (int i = 0; i< a.length; i++)
        // System.out.print(a[i]+" ");
        System.out.println();
        int[] aux = new int[a.length];
        sort(a, aux, 0, a.length);
    }
    
    private static void sort(int[] a, int[] aux, int lo, int hi)
    { // Sort a[lo, hi).
        if (hi - lo <= 1) return;
        int mid = lo + (hi-lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid, hi);
        int i = lo, j = mid;
        for (int k = lo; k < hi; k++){
            if (i == mid) aux[k] = a[j++];
            else if (j == hi) aux[k] = a[i++];
            else if (a[j] < (a[i])) aux[k] = a[j++];
            else aux[k] = a[i++];
        }
        for (int k = lo; k < hi; k++)
        a[k] = aux[k];
        
    }
    public static void main(String[] args) {
        int[] arr = StdIn.readAllInts();
        int [] found_pair = findclosestPair(arr);
        System.out.println( found_pair[0] + " " + found_pair[1]);
    }
}