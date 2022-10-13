public class Newton {

    // task: use newtons method to find the kth root of n

    public static void main(String[] args) {

        // Raed n,k from command line
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        
        
        // initial_guess
        double initial_guess = Math.random() * 100; // initial value

        // smaller epsilon, denotes more accuracy
        double epsilon = 0.00001;

        // keep the result here
        double kth_root_of_n = initial_guess - initial_guess * ( 1 - n * Math.pow(initial_guess, -k)) / k;

        // Complete the JPA code here, see README on course website for problem description and instructions.
        while(Math.abs(kth_root_of_n - initial_guess) > epsilon)
        {
            initial_guess = kth_root_of_n;
            kth_root_of_n = initial_guess - initial_guess * ( 1 - n * Math.pow(initial_guess, -k)) / k;
        }
        
        
        // Don't touch from here
        System.out.printf("%.5f\n", kth_root_of_n);
        

    }
}