public class LongestPlateau
{
    public static void main(String[] args){
        // Exercise 1.4.23 LongestPlateau
        // Complete the JPA code here, see README on course website for problem description and instructions.

        int[] terrain = new int[args.length + 1];

        for (int n = 0; n < args.length; n++) {
            terrain[n]=Integer.parseInt(args[n]);
        }
        terrain[args.length] = -999999999;
        int max_len = 0;
        int max_pos = -1;
        int curr_len = 1;
        int curr_pos = 0;
        boolean inAPlateau = true;
        for (int i = 0; i < terrain.length; i++){
            if (inAPlateau && (i>0)){
                if (terrain[i]==terrain[i-1]) {curr_len++;}
                if (terrain[i-1]>terrain[i]){
                    if(curr_len>max_len){
                        max_len=curr_len;
                        max_pos=curr_pos;
                    } 
                    inAPlateau=false;
                    curr_len=1;
                }
                if (terrain[i-1]<terrain[i]){
                    curr_len = 1;
                    curr_pos = i;
                }
            }
            else {
                if ((i>0) && (terrain[i-1]<terrain[i])){
                    inAPlateau = true;
                    curr_len = 1;
                    curr_pos = i;
                }
            }
        }
        System.out.println(max_len);
        System.out.println(max_pos);
        return;
    }
}
