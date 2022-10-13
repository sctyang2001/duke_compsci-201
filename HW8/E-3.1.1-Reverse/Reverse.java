public class Reverse
{
    public static void main(String[] args)
    {
        // Exercise 3.1.1 Reverse
        // Do not change this part
        System.out.println(Reverse(args[0]));

        return;
    }
    // Implement a static Reverse method that returns a String. The
    // returned String is the reverse of its argument

    // Complete the JPA code here, see README on course website for problem description and instructions.

    public static String Reverse(String str)
    {
        char[] arr = new char[str.length()];
        for (int i=0; i<str.length(); i++){
        // Implement a static Reverse method that returns a String. The
        // returned String is the reverse of its argument

        // Complete the JPA code here, see README on course website for problem description and instructions.
            arr[i]=str.charAt(str.length()-1-i);
        }
        String reverse = new String(arr);
        return reverse;
    }
}