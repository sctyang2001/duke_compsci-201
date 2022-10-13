import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CountMatches {
    public static void main(String[] args) { 
        int count = 0;
        String regexp = StdIn.readLine();
        String input = StdIn.readLine();
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(input);
        // Complete the JPA code here, see README on course website for problem description and instructions.

        while (matcher.find()) count++;

        StdOut.println(count);
    }
    
}
