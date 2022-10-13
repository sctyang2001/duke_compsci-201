public class LocalMinimum {
    // Textbook 4.2.37

    public static int localMinima_r(int[] arr, int low, int high){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (arr.length < 2) return -1;
        else {
            for (int i = 1; i<arr.length-1; i++){
                if (arr[i]<arr[i+1] && arr[i-1]>arr[i]) return i;
            }
            if (arr[0]<arr[1]) return 0;
            if (arr[arr.length-2]>arr[arr.length-1]) return (arr.length-2);
            return -1;
        }
    }

    public static void sort(int[] a)
    {
        System.out.println();
        int[] aux = new int[a.length];
        sort(a, aux, 0, a.length);
    }
    
    private static void sort(int[] a, int[] aux, int lo, int hi)
    {
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
        for (int k = lo; k < hi; k++){
            a[k] = aux[k];
        }
    } 

    public static void main(String[] args) {
        int arr[] = StdIn.readAllInts();
        int n = arr.length;
        System.out.println(localMinima_r(arr, 0, n));
    }

}