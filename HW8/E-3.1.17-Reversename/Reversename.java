public class Reversename
{
    public static void main(String[] args)    {
        // Exercise 3.1.17 Reversename
        
        String a = args[0];
        

        System.out.println(reverseName(a));

        return;
    }
    public static String reverseName(String sequence) {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int L = sequence.split("\\.").length;
        String[] arrayOfSubsequences = new String[L];
        for (int i=0; i<L; i++){
            arrayOfSubsequences[i] = sequence.split("\\.")[L-1-i];
        }
        String reverseName = new String();
        for (int i = 0; i < L; i++){
            reverseName=reverseName+arrayOfSubsequences[i]+".";
        }
        String output = reverseName.substring(0,reverseName.length()-1);
        return output;
    }
}
