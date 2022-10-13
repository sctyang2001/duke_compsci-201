import java.util.*;

public class Birthday
{
    public static void main(String[] args)
    {
        
        int n_tests = Integer.parseInt(args[0]);
        Random gen = new Random(n_tests);
        int totalCounter =0;
        
        // Reminder : use (int) (gen.nextDouble() * 365) to generate a
        // random day instead of Math.random()
        
        // Complete the JPA code here, see README on course website for problem description and instructions.

        for (int i = 0; i < n_tests; i++){
            Boolean duplicate[] = new Boolean[365];
            int birthday = (int)(gen.nextDouble() * 365);
            int counter = 0;
            for (int j = 0; j < duplicate.length; j++) {duplicate[j] = false;}
            while (!duplicate[birthday]){
                duplicate[birthday] = true;
                birthday =(int)(gen.nextDouble() * 365);
                counter++;
            }
            // System.out.println(counter);
            totalCounter = counter + totalCounter;
        }
    System.out.println(1.0 * totalCounter / n_tests);
    return;
    }
}