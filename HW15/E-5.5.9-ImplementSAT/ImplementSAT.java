public class ImplementSAT{

    private boolean[] inSubset;
    private final String[] clauses;
    private final int n;

    public ImplementSAT(String[] clauses)
    {
        this.clauses = clauses;
        n = clauses[0].length();
        inSubset = new boolean[n]; 
        while (next()){
            if(check(clauses, inSubset))
                return;
        }
    }

    private boolean next()
    {
        int i = n-1;
        while (inSubset[i])
        {
            inSubset[i--] = false;
            if (i == -1) return false; 
        }
        inSubset[i] = true;
        return true;
    }


    public static boolean check(String[] clauses, boolean[] inSubset)
    {
        boolean product = true;
        for (int i = 0; i < clauses.length; i++) 
        {
            boolean sum = false;
            for (int j = 0; j < inSubset.length; j++) {
                if (clauses[i].charAt(j) == '+') sum = sum || inSubset[j];
                if (clauses[i].charAt(j) == '-') sum = sum || !inSubset[j];
            }
            product = product && sum;
        }
       return product;
    }

    public String toString()
    {
        String solverString = new String("");

        // Complete the JPA code here, see README on course website for problem description and instructions.
        for(int i = 0; i < n; i++)
        {
            char x;
            if (inSubset[i] == true)
            {
                x = '1';
            }
            else
            {
                x = '0';
            }
            solverString += x;
        }
        return solverString;
    }

    public static void main(String[] args)
    {
        String filename = args[0];
        In in = new In(filename);
        String[] clauses = in.readAllStrings();
        ImplementSAT solver = new ImplementSAT(clauses);
        StdOut.println(solver);
    }
}