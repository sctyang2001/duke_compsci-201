import java.util.Arrays;

public class MergeSort {

    //---------------------------------------------------
    // Top level mergeSort routine
    //---------------------------------------------------
    public void mergeSort(int[] a) 
    {
        int len = 1;
        while (len < a.length) {
            // Complete the JPA code here, see README on course website for problem description and instructions.
            for (int i = 0; i < a.length; i = i + 2*len)
                merge(a, i, len); 
            len *= 2;           // the size of sub-region doubles 
        }
    }

    //---------------------------------------------------
    // Merge two already sorted regions: a[i:i+len] and a[i+len:a+len*2]
    //---------------------------------------------------
    public void merge(int[] a, int i, int len) // a is the array, i is the starting position, and len is the subarray
    {
        if (i + len > a.length) return;
        int j = i + len; // j is starting point for the right hand side
        int sizeOfSub = Math.min(len * 2, a.length-i);
        int m = i;


        int[] aux = new int[sizeOfSub];
        //sorting loop to fill in the aux array
        for (int k = 0; k < sizeOfSub; k++)
        {
            if (i == m + len) aux[k] = a[j++];
            else if ((j == m +len*2)||(j>=a.length)) aux[k] = a[i++];
                 else if (a[j] < a[i]) aux[k] = a[j++];
                      else aux[k] = a[i++];
        }

        for (int k=0; k<sizeOfSub; k++) a[m + k] = aux[k];
    }

    //---------------------------------------------------
    // Test Client : Don't modify anything below this line. 
    //---------------------------------------------------
    public static void main(String args[]) {
        MergeSort mer = new MergeSort();
        int[] arr = StdIn.readAllInts();
        System.out.println("OriginalArray:" + Arrays.toString(arr));
        mer.mergeSort(arr);
        System.out.println("SortedArray:" + Arrays.toString(arr));
    }
    
}
