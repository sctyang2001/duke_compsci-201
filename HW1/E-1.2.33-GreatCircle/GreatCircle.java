public class GreatCircle {
    public static void main(String[] args) {
        double distance ;

        // Compute distance

        // Complete the JPA code here, see README on course website for problem description and instructions.

        double X1 = Math.toRadians(Double.parseDouble(args[0]));
        double Y1 = Math.toRadians(Double.parseDouble(args[1]));
        double X2 = Math.toRadians(Double.parseDouble(args[2]));
        double Y2 = Math.toRadians(Double.parseDouble(args[3]));
        distance = 60 * Math.toDegrees(Math.acos(Math.sin(X1) * Math.sin(X2) + Math.cos(X1) * Math.cos(X2) * Math.cos(Y1 - Y2)));

        
        System.out.println(distance + " nautical miles");
    }
}
