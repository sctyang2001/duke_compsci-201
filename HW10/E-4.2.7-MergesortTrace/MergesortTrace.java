public class MergesortTrace {

    private static String[] aux;

    public static void merge(String[] a, int lo, int mid, int hi)
    {
        int i = lo, j = mid, w = hi;
        for (int k = lo; k < hi; k++)
        {
            if      (i == mid) aux[k] = a[j++];
            else if (j == hi)  aux[k] = a[i++];
            else if (a[j].compareTo(a[i]) < 0) aux[k] = a[j++];
            else                               aux[k] = a[i++];
        }
        for (int k = 0; k < aux.length; k++) {StdOut.print(aux[k]+" ");}
        StdOut.println();
        int spaceLength = aux[lo].toString().length();
        String space = "";
        for (int n = 0; n < spaceLength; n++) {space += " ";}
        for (int k = lo; k < hi; k++) a[k] = aux[k];
        for (int k = 0; k < aux.length; k++) aux[k] = space;
    }

    public static void sort(String[] a)
    {
       aux = new String[a.length];  // Allocate just once!
       for (int k = 0; k < aux.length; k++) aux[k] = " ";
       sort(a, 0, a.length);
    }

    public static void sort(String[] a, int lo, int hi)
    {  // Sort a[lo, hi).
        int N = hi - lo;
        if (N <= 1) return;
        int mid = lo + N/2;
        sort(a, lo, mid);
        sort(a, mid, hi);
        merge(a, lo, mid, hi);
    }

    public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        for (int k = 0; k < a.length; k++) {StdOut.print(a[k]+" ");}
        StdOut.println();
        sort(a);
    }
}
