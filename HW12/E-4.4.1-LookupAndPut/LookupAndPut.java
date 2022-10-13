import java.util.*;

public class LookupAndPut
{
    public static void main(String[] args)
    {
        // Exercise 4.4.1 LookupAndPut
        ST<String, String> map = new ST<String, String>();
        while (!StdIn.isEmpty())
        {
            String query = StdIn.readString();
            if (query.equals("+"))
            {
                String str1 = StdIn.readString();
                String str2 = StdIn.readString();
                
                map.put(str1, str2);
            }
            else{
                System.out.println(map.get(query));
                
            }
        }
        return;
    }
}
