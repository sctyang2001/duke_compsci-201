import java.util.*;

public class MultipleWordSearch
{
    public static void main(String[] args)
    {
        //--------------------------------------------
        // Read input stream
        //--------------------------------------------
        String[] input = StdIn.readAllStrings();

        
        //--------------------------------------------
        // the smallest match-inteval
        //--------------------------------------------
        int cur_min = -1;
        int cur_max = input.length;

        //--------------------------------------------
        // Create and initialize the kmap 
        //--------------------------------------------
        ST<String, Integer> kmap = new ST<String, Integer> ();
        for (int i=0;i<args.length; i++)  kmap.put(args[i] , -1);
        
        // Complete the JPA code here, see README on course website for problem description and instructions.

        for (int i = 0; i < input.length; i++){
            for (int iv=0;iv<args.length; iv++)  kmap.put(args[iv] , -1);
            
                if (kmap.contains(input[i])){

                    int currentPosition = i;

                    int y = kmap.get(input[i]);
                    y++;
                    kmap.put(input[i], y);

                    for (int ii = i; ii < input.length; ii++){
                        if (kmap.contains(input[ii])){
                            kmap.put(input[ii],(1+kmap.get(input[ii])));
                        }

                        boolean complete = true;
                        for (int iii=0;iii<args.length; iii++) 
                            if (kmap.get(args[iii])<0){
                                complete=false;
                                break;
                            }
                        
                        if (complete){
                            int length = ii-i;
                            if (length < cur_max-cur_min){
                                cur_min = currentPosition;
                                cur_max = ii;
                            }
                        }
                    }

                }
        }

        //--------------------------------------------
        // Don't touch after this line
        //--------------------------------------------
        if ( cur_min != -1 ){
            for(int i=cur_min; i< cur_max+1; i++){
                System.out.print(input[i] + " " ) ;
            }
            System.out.println();
        }
        return;
        
    }
}
