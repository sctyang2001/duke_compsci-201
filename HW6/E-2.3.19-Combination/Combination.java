public class Combination
{
    public static char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static void main(String[] args)
    {
        // Guaranteed n <=26 
        int n = Integer.parseInt(args[0]);
        boolean[] choice = new boolean[n];

        // Hint 1 : choice of the each letter in a particular combination
        // can be a true/false on the choice array

        // Hint 2 : The 'start' position is to increment towards
        // choice.length, and at each step, it chooses to include
        // letter[i] or not letter[i] by setting choice[i] to true or
        // fasle.

        combination_r(choice, 0);
    }
        
    public static void combination_r(boolean [] choice, int start_pos){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (start_pos <= choice.length-1){
            choice[start_pos] = true;
            combination_r(choice, start_pos+1);
            choice[start_pos] = false;
            combination_r(choice, start_pos+1);
        }
        else{
            for (int j = 0; j < choice.length; j++){
                if (choice[j]) {System.out.print(letters[j]);}
                }
        System.out.print(" ");
        }

    }
}