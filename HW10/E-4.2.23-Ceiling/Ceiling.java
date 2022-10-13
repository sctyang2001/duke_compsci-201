public class Ceiling {
    
    static int ceilSearch(int arr[], int low, int high , int target){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (arr[arr.length-1]<target) {
            return -1;
        }
        else{
            if (high-low == 1) {
                if (high == arr.length) high--;
                if (arr[high] - target < target-arr[low]) return arr[high];
                else return arr[low];
            }
            int mid = low + (high-low)/2;
            if (target>=arr[mid]) {
                return ceilSearch(arr, mid, high, target);
            }
            else {
                return ceilSearch(arr, low ,mid, target);
            }
        }
    } 
    public static void main(String[] args) {
        
        int[] arr = StdIn.readAllInts();
        int target =Integer.parseInt(args[0]);
        int low=0;
        int high=arr.length;
        int r = ceilSearch(arr, low, high, target);
        if (r!=-1) 
            System.out.println(r);
        else System.out.println("no ceiling");
    }
}