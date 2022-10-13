public class ImproveNo2Slash
{
    public static void main(String[] args)
    {
        // Exercise 4.1.30 ImproveNo2Slash
        String name= StdIn.readString() ;


        // Complete the JPA code here, see README on course website for problem description and instructions.
        int n = name.length();
        String output = "";
        // int i = 1;
        char [] c = name.toCharArray();  
        // while ((i < n) && ())
        // {

        //     if ((c[i-1] == '/') && (c[i] == '/'))
        //     {
        //         for(int j = i+1; j < n; j++)
        //             c[j-1] = c[j];
        //             n--;
        //     }
        // else i++;
        // }
            // int k = 0, p = 0;
        for (int i = 1; i < c.length ; i++) {
            while((c[i-1]=='/') && (c[i-1+1]=='/'))
            {
                i++;
                if(i>=c.length) break;
            }
        //     if ((c[j-1]=='/')&&(c[(j-1)+(k+1)]=='/')) 
        // {
        //     k++;
        //     System.out.println("The "+(j-1)+"th character and the "+j+"th character are both / ");
        // }
        //     else{
                output += c[i-1];

        //     }
        
        }
        if (c[c.length-1]!='/')output += c[c.length-1];


        StdOut.println(output);

        // code-end

        return;
    }
}