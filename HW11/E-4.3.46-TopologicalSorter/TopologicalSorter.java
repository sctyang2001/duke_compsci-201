public class TopologicalSorter
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        // Exercise 4.3.46 TopologicalSorter
        // do topological sort
        
        int n = StdIn.readInt(); // this is the max of all integers
        int[] inDegree = new int[n];

        boolean [] seen = new boolean[n];

        // Complete the JPA code here, see README on course website for problem description and instructions.
        java.util.Queue<Integer>[] follows = new java.util.Queue[n];
        Queue<Integer> queue = new Queue<Integer>(); //WHAT IS THIS QUEUE FOR
        
        for (int i = 0; i < n; ++i) follows[i] = new java.util.LinkedList<Integer>();

        while (!StdIn.isEmpty())
        {
            int value = StdIn.readInt();
            seen[value] = true;
            int secondary = StdIn.readInt();
            seen[secondary] = true;
            follows[value].add(secondary);
            inDegree[secondary]++;

        }

        for (int i = 0; i < n; i++)
            if ((inDegree[i] == 0) && (seen[i])) queue.enqueue(i);

        while (!queue.isEmpty())
        {
            int num = queue.dequeue();
            System.out.print(num + " ");
            while (!follows[num].isEmpty())
            {
                int nextNum = follows[num].remove();
                inDegree[nextNum]--;
                if (inDegree[nextNum] == 0) queue.enqueue(nextNum);
            }
        }
        
        return;
    }
}
