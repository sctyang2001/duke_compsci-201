import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ReplaceAll {
    
    public static void main(String[] args) {

        String regexp = StdIn.readLine();
        String str = StdIn.readLine();
        String input = StdIn.readLine();
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(input);

        // Complete the JPA code here, see README on course website for problem description and instructions.
        String exput = input;
        while (matcher.find()){
            String matched = matcher.group();
            exput = lucia(exput, matched ,str);

        }

        StdOut.println(exput);
    }
    public static String lucia(String bigstr, String lookFor, String replaceWith){
        int first = bigstr.indexOf(lookFor);
        int finale = first + lookFor.length();
        String b4 = bigstr.substring(0,first);
        String aft = bigstr.substring(finale,bigstr.length());
        return b4 + replaceWith + aft;
    }
}
