public class Permutation
{
    

    public static void main(String[] args)
    {
        int n  = Integer.parseInt(args[0]); 
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        // Create an char [] for permutation use
        char[] arr = new char[n];
        for (int i=0;i<n;i++) arr[i] = alphabet.charAt(i);

        perm(arr, 0);
        
    }

    public static void perm(char[] arr, int start_pos){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (start_pos == arr.length - 1) {System.out.println(String.valueOf(arr));}
        else{
            for (int i = start_pos; i <= arr.length - 1; i++){
                Permutation.Swap(arr, start_pos, i);
                perm(arr, start_pos+1);
                Permutation.Swap(arr, start_pos, i);
            }
        }



    }
    public static void Swap(char[] arr, int i, int j){
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return;           
    }
}
