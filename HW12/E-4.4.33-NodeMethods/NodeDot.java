import java.util.*;

// utility class to generate DOT-lang graph of your binary tree
public class NodeDot
{
    private static class Node
    {
        public int index;
        public int value;
        public Node left, right;
        public Node(int i, int v, Node l, Node r)
        {
            index = i;
            value = v;
            left = l;
            right = r;
        }
    }
    private static Node readTree()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; ++i)
            arr[i] = sc.nextInt();
        Node[] nodes = new Node[n + 1];
        for (int i = n; i >= 1; --i)
            nodes[i] = (arr[i] == -1 ? null : new Node(i, arr[i],
                    i * 2 <= n ? nodes[i * 2] : null,
                    i * 2 + 1 <= n ? nodes[i * 2 + 1] : null));
        sc.close();
        return nodes[1];
    }
    private static String getNode(Node root)
    {
        if (root == null) return "";
        return "\tn" + root.index + " [label=\"" + root.value + "\"]\n" + getNode(root.left) + getNode(root.right);
    }
    private static String getEdge(Node root)
    {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        if (root.left != null) sb.append("\tn" + root.index + " -> n" + root.left.index + ";\n");
        if (root.right != null) sb.append("\tn" + root.index + " -> n" + root.right.index + ";\n");
        sb.append(getEdge(root.left));
        sb.append(getEdge(root.right));
        return sb.toString();
    }
    public static void main(String[] args)
    {
        Node root = readTree();
        String nodes = getNode(root), edges = getEdge(root);
        System.out.println("digraph G {\n\trankdir = \"TB\"\n" + nodes + edges + "}");
    }
}
