public class LCS_R
{
    public static void main(String[] args)  {
        String a = args[0];
        String b = args[1];

        String ret = LCS_r(a,b);
        System.out.println(ret);
    }
    
    public static String maximum(String i, String j)
    {
        if (i.length() > j.length()) return i;
        else return j;
    }

    public static String LCS_r(String x, 
                               String y) {

        // Complete the JPA code here, see README on course website for problem description and instructions.
        int Lx = x.length();
        int Ly = y.length();
        if ((x.isEmpty())||(y.isEmpty())) {return "";}
        if (x.charAt(Lx-1) == (y.charAt(Ly-1))){
            return LCS_r(x.substring(0, Lx-1), y.substring(0, Ly-1)) + x.substring(Lx-1);
        }
        else {return maximum(LCS_r(x.substring(0, Lx-1), y), LCS_r(x, y.substring(0, Ly-1)));}
    }
}