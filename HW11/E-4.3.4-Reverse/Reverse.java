import java.util.*;

public class Reverse
{
    public static void main(String[] args)
    {
        // Exercise 4.3.4 Reverse
        // read strings from input and print them in reverse order
        
        // Complete the JPA code here, see README on course website for problem description and instructions.
        Queue<String> q = new Queue<String>();
        while (!StdIn.isEmpty())
            q.enqueue(StdIn.readString());
        int N = q.size();
        String[] words = new String[N];
        for (int i = N-1; i >= 0; i--){
            words[i] = q.dequeue();
        }
        for (int i = 0; i < words.length; i++)
            StdOut.println(words[i]);
    }
}
