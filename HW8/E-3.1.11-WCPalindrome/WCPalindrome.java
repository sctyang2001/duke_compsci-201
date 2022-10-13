import java.util.Arrays;
public class WCPalindrome
{
    public static void main(String[] args){
        // Exercise 3.1.11 WCPalindrome
        // Do not change this part
        System.out.println(isWatsonCrickPalindrome(args[0]));
        return;
    }

    public static boolean isWatsonCrickPalindrome(String sequence){
    // Complete the JPA code here, see README on course website for problem description and instructions.
        if (!isValidDNA(sequence)) {return false;}
        String reversed = Reverse(sequence);
        String compleRever = Complement(reversed);
        if (compleRever.equals(sequence)) {return true;}
        else {return false;}
    }

    public static boolean isValidDNA(String dna){
        for (int i=0; i < dna.length(); i++){
            if (!(dna.charAt(i)=='A')&&!(dna.charAt(i)=='T')&&!(dna.charAt(i)=='C')&&!(dna.charAt(i)=='G')) 
            {return false;}
        }
        return true;
    }


    public static String Reverse(String str)
    {
        char[] strArr = new char[str.length()];
        for (int i=0; i<str.length(); i++){
            strArr[i]=str.charAt(str.length()-1-i);
        }
        String reverse = new String(strArr);
        return reverse;
    }

    public static String Complement(String s){
    // Complete the JPA code here, see README on course website for problem description and instructions.
        s=s.replaceAll("T", "a");
        s=s.replaceAll("C", "g");
        s=s.replaceAll("G", "c");
        s=s.replaceAll("A", "t");
        return s.toUpperCase();
    }

}