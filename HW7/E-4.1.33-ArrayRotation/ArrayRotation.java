

public class ArrayRotation
{
    public static void main(String[] args) {

        // Read commmad line arguments
        int k = Integer.parseInt(args[0]);
        
        // Read array from stdin as an integer array
        int [] a = StdIn.readAllInts();
        
        rotate(a, k);
        
        for (int i=0;i<a.length;i++)
            System.out.print( a[i]+ ((i==a.length-1)?"\n":" " ));
    }
    
    // Rotate the content of a[] to the left for k positions
    public static void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public static void rotate(int[] a, int k) {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int c = 0;
        while (c<a.length/2)
        {
            swap(a, c, (a.length-1-c));
            c++;
        }
        
        int i = a.length-k;
        int last = a.length-1;
        while (i<=(a.length-k+a.length-1)/2)
        {
            swap(a,i,last);
            i++;
            last--;
        }

        int first = 0;
        int p = a.length-k-1;
        while (first<=(a.length-k-1)/2)
        {

            swap(a,first,p);
            first++;
            p--;
        }
    }
}