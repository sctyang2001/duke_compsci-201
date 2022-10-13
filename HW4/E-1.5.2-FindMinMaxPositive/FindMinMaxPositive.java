public class FindMinMaxPositive {
    public static void main(String[] args) {
        
        // Complete the JPA code here, see README on course website for problem description and instructions.
        StdOut.println();
        int max = 0;
        int min = 1000;
        while (!StdIn.isEmpty()){
            int n = StdIn.readInt();
            while (n<=0) {
                StdOut.println("Please enter a positive integer");
                if (!StdIn.isEmpty()) {n = StdIn.readInt();}
                else {
                    n = max;
                    break;
                }
            }
            if (n > max) max = n;
            if (n < min) min = n;
        }

        StdOut.println("maximum = " + max+ ", " + "minimum = " + min);
        
    }
}