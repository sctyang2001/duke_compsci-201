public class sigmoid {
    
    public static double sigmoid(double a){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        double sig = 1.0/(1.0+Math.pow(Math.E, -a));
        return sig;
    }

    public static void main(String[] args) {
        double a=Double.parseDouble(args[0]);
        System.out.println(sigmoid(a));
    }

}