public class ComplementWatsonCrick
{
    public static void main(String[] args) {
        // Exercise 3.1.10 ComplementWatsonCrick
        // TODO: your own description
        
        String s = StdIn.readString();
            
        System.out.println( Complement(s));
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