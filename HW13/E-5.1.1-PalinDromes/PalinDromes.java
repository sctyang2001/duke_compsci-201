import java.util.*;

public class PalinDromes
{
    public static void main(String[] args){
        String arg = args[0];
        if (isPalinDrome(arg)){
            StdOut.println(arg+" is a palindrome");
        }
        else{
            StdOut.println(arg+" is not a palindrome");
        }
    }

    private static boolean isPalinDrome(String s){
        // Complete the JPA code here, see README on course website for problem description and instructions.

        int len = s.length();
        for (int i = 0; i < s.length(); i++){
            char head = s.charAt(i), tail = s.charAt(len-1-i);
            if (Character.valueOf(head).compareTo(Character.valueOf(tail)) != 0 ) return false;
        }
        return true;

    }
}