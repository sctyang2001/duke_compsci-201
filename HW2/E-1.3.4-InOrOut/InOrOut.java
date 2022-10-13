public class InOrOut {
    public static void main(String[] args) {
        // This is from textbook exercise 1.3.4
        // Task: you have two command line arguments (double), print true if both of them are
        // strictly in the range (0,1), print false otherwise

        // Complete the JPA code here, see README on course website for problem description and instructions.
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[0]);
        if (a > 0 && a < 1 && b > 0 && b < 1) System.out.println("true");
        else System.out.println("false");


    }
}