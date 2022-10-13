import java.util.*;

// import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Xor;

public class NodeMethods {
    
    //----------------------------------------------------------------------
    // Helper function: read in a tree structure represented as a
    // sequence of numbers
    //
    // This is a way to construct a binary tree using an sequence of
    // integer numbers, You can think of a[i] is the parent for a[i*2]
    // and a[i*2+1].
    // ----------------------------------------------------------------------
    private static Node readTree()
    {
        // This might be the most confusting part, but it is an input
        // method to read in the tree structure from a sequence of
        // integers. A value arr[i]==-1 indicates that is null
        // pointer, otherwise, it is Node(arr[i]) and potentially have
        // a path from root if none of is ancestors has value of -1
        // (aka. is null)
        
        int n = StdIn.readInt(); 
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; ++i)
            arr[i] = StdIn.readInt();
        Node[] nodes = new Node[n + 1];
        for (int i = n; i >= 1; --i)
            nodes[i] = (arr[i] == -1 ? null : new Node(arr[i],
                                                       i * 2 <= n ? nodes[i * 2] : null,
                                                       i * 2 + 1 <= n ? nodes[i * 2 + 1] : null));
        return nodes[1];
    }

    //----------------------------------------------------------------------
    // Test client
    //----------------------------------------------------------------------
    public static void main(String[] args)
    {
        // Exercise 4.4.33 NodeMethods
        // DON'T change this 
        Node r1 = readTree(), r2 = readTree();
        StdOut.printf("%20s  %5d %5d\n", "size" , size(r1) , size(r2));
        StdOut.printf("%20s %5d %5d\n" , "leaves", leaves(r1) , leaves(r2));
        StdOut.printf("%20s %5d %5d\n" ,"total" , total(r1) , total(r2));
        StdOut.printf("%20s %5b %5b\n", "heapOrdered" , heapOrdered(r1) ,  heapOrdered(r2));
        StdOut.printf("%20s %5b %5b\n" , "isomorphic" , isomorphic(r1, r2) , isomorphic(r2, r1));
        StdOut.printf("%20s %5b %5b\n", "eq" , eq(r1, r2) , eq(r2, r1));
        StdOut.print("levelOrder(r1):\n   ");
        for (int i : levelOrder(r1)) StdOut.print(i + " "); StdOut.println();
        StdOut.print("levelOrder(r2):\n   ");
        for (int i : levelOrder(r2)) StdOut.print(i + " "); StdOut.println();
    }

    //----------------------------------------------------------------------
    // Instace variables
    //----------------------------------------------------------------------
    private static class Node
    {
        public int value;
        public Node left, right;
        
        // constructor
        public Node(int v, Node l, Node r)
        {
            // Complete the JPA code here, see README on course website for problem description and instructions.

            value = v;
            left = l;
            right = r;

        }
    }
    private static int size(Node root) // number of nodes with both link null
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (root == null) return 0;
        // if (root.left != null) return size(root.left) + 1;//??
        // if (root.right != null) return size(root.right) + 1;
        // else return (1 + size(root.left)+size(root.right));
        else return size(root.left) + 1 + size(root.right);

    }

    private static int leaves(Node root) // number of nodes with both link null
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        else return leaves(root.left) + leaves(root.right);

    }
    private static int total(Node root) // sum of values
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (root == null) return 0;
        else return root.value + total(root.left) + total(root.right);
    }
    private static boolean heapOrdered(Node root) // heap ordered?
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (root == null) return true;
        else return (heapOrdered(root.left) && heapOrdered(root.right)
        && (root.left==null? true : root.value>root.left.value) 
        && (root.right==null? true : root.value>root.right.value));

    }
    private static boolean isomorphic(Node a, Node b) // isomorphic?
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.

        if ((a == null) ^ (b == null)) return false;
        if (a == null && b == null) return true;
        else return 
        isomorphic(a.left, b.left)
        &&
        isomorphic(a.right, b.right);

    }
    private static boolean eq(Node a, Node b) // equal?
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (!isomorphic(a, b)) return false;
        
        if (a == null && b == null) return true;
        else return (a.value == b.value && eq(a.left,b.left) && eq(a.right,b.right));

    }
    private static Iterable<Integer> levelOrder(Node root) // level order (aka breadth search)
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.

        Queue<Node> q = new Queue<Node>();
        Queue<Integer> output = new Queue<Integer>();

        if (root == null) return output;
        else q.enqueue(root);

        while (!q.isEmpty()){
            Node x = q.dequeue();
            output.enqueue(x.value);
            if (x.left != null) q.enqueue(x.left);
            if (x.right != null) q.enqueue(x.right);
        }
        return output;

    }
}
