public class ComplexRoot
{
    public static void main(String[] args)
    {
        // Exercise 3.2.17 ComplexRoot
        // calculate the root of ax^2 + bx + c == 0

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        // Complete the JPA code here, see README on course website for problem description and instructions.

        if ((a==0)&&(b==0)&&(c==0)) System.out.println("Infinite number of roots"); 
        else {
                if ((a==0)&&(b!=0)) System.out.println(-c/b);
                else {
                        if((a==0)&&(b==0)&&(c!=0)) System.out.println("No root");
                        else {
                            if ((b*b-4*a*c)>0.0) {
                                Complex rootA = new Complex(-b/(2*a)+Math.sqrt(b*b-4*a*c)/(2*a),0);
                                Complex rootB = new Complex(-b/(2*a)-Math.sqrt(b*b-4*a*c)/(2*a),0);

                                if (a>0) {
                                    System.out.println(rootB.toString());
                                    System.out.println(rootA.toString());
                                }
                                else {
                                    System.out.println(rootA.toString());
                                    System.out.println(rootB.toString());
                                }
                            }
                            else {
                                if ((b*b-4*a*c)==0.0) {
                                    Complex root = new Complex(-b/(2*a),0);
                                    System.out.println(root.toString());
                                }
                                else{
                                    if ((b*b-4*a*c)<0.0) {
                                        Complex rootB = new Complex(-b/(2*a),-Math.sqrt(4*a*c-b*b)/(2*a));
                                        Complex rootA = new Complex(-b/(2*a), Math.sqrt(4*a*c-b*b)/(2*a));
                                        // System.out.println(rootB.toString());
                                        // System.out.println(rootA.toString());
                                        // double erootA = rootA.im(), erootB = rootB.im();
                                        if (a>0) {
                                            System.out.println(rootB.toString());
                                            System.out.println(rootA.toString());
                                        }
                                        else {
                                            System.out.println(rootA.toString());
                                            System.out.println(rootB.toString());
                                        }
                                    }
                                }
                            }
                        }
                    }
            }
        return;
    }
}