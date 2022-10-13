// public class GeoHarmMean {
//     public static void main(String[] args) {

//         // Complete the JPA code here, see README on course website for problem description and instructions.
//         double product = 1.0;
//         double sumDiv = 0.0;
//         int n = 0;
//         while (!StdIn.isEmpty()){
//             double a = StdIn.readDouble();
//             sumDiv = sumDiv + (1.0/a);
//             product = product * a;
//             n++;
//             // StdOut.println(sumDiv + " " + product + " " + n);
//         }
//         double GM = Math.pow (product, 1.0/n);
//         // double GM = Math.pow (Math.E, (1/n)*Math.log(product));
//         double HM = n/sumDiv;
//         StdOut.printf("%.7f \n", GM);
//         StdOut.printf("%.7f \n", HM);

//     }
// }

public class GeoHarmMean {
    public static void main(String[] args) {

        // Complete the JPA code here, see README on course website for problem description and instructions.

        double sumLn = 0;
        double sumRec = 0;
        int n = 0;
        double[] x = new double[10000];
        while (!StdIn.isEmpty())
        {
            x[n] = StdIn.readDouble();
            sumLn += Math.log(x[n]);
            sumRec += 1.0/x[n];
            n++;
        }
        double geo = Math.pow(Math.E, sumLn/n);
        double har = n/sumRec;
        StdOut.printf("%.7f \n",geo);
        StdOut.printf("%.7f \n",har);
    }
}