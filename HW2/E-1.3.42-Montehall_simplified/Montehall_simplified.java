import java.text.DecimalFormat;
import java.util.Random;
public class Montehall_simplified {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int switchWins = 0; int stayWins = 0;
        float percentage1, percentage2;
        DecimalFormat df = new DecimalFormat("##.##");// for formating percentage to 2 decimal places
        
        int seed = Integer.parseInt(args[0]);
        Random generator=new Random(seed);
        
        // Note: use generate.nextDouble() to generate a random number
        // between 0 and 1.
        
        // Complete the JPA code here, see README on course website for problem description and instructions.
        for(int plays = 0; plays < n; plays++ )
        {
			int[] doors = {0,0,0};//0 is a goat, 1 is a car
			doors[0] = 1;//put a winner in a random door
			int choice = generator.nextInt(3); //pick a door, any door
			int shown; //the shown door
			do{
				shown = generator.nextInt(3);
			//don't show the winner or the choice
			}while(doors[shown] == 1 || shown == choice);
 
			stayWins += doors[choice];//if you won by staying, count it
 
			//the switched (last remaining) door is (3 - choice - shown), because 0+1+2=3
			switchWins += doors[3 - choice - shown];
        }
        percentage1 = (float) 100 * stayWins / n;
        percentage2 = (float) 100 * switchWins / n;

        System.out.println("Sucess rate of no switch: " + df.format(percentage1) + "%");
        System.out.println("Sucess rate of switching gate: " + df.format(percentage2) + "%");
        
    }
}