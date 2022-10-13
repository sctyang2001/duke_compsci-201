public class SubsetSum
{
    public static void main(String[] args)
    {
        // Exercise 4.1.31 SubsetSum

        int [] a = StdIn.readAllInts();
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int n = a.length;
        boolean[]  choice = new boolean[n];
        combination_r( choice, 0, a);
        
}
        
public static void combination_r(boolean [] choice, int start, int[] a){
        if (start<=choice.length-1){
            choice[start] = false;
            combination_r(choice, start+1, a);
            choice[start] = true;
            combination_r(choice, start+1, a);
            choice[start] = false;
        }
        else{
            int sum = 0;
            for (int i = 0; i < choice.length; i++)
                    if (choice[i])  sum+=a[i];
            if (sum==0) {
                for (int j=0; j<choice.length; j++){
                    if (choice[j]) System.out.print(a[j]+" ");
                }
                System.out.println();
            }
        }

    }
        
}