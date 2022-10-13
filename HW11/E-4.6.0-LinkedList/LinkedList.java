import java.util.*; 
import java.util.Stack; 

public class LinkedList<Item extends Comparable> 
{
    //-------------------------------------------------------
    // Instance varaibles
    //-------------------------------------------------------
    // Complete the JPA code here, see README on course website for problem description and instructions.

    private Node first = null;
    private int N = 0;
    // private final Item item;

    
    //-------------------------------------------------------
    // Private class
    //-------------------------------------------------------

    // Complete the JPA code here, see README on course website for problem description and instructions.

    private class Node
    {
        private Item item;
        private Node next;
        private Node(Item item, Node next){
            this.item = item;
            this.next = next;
        }
    }

    //-------------------------------------------------------
    // Constructor
    //-------------------------------------------------------
    // Complete the JPA code here, see README on course website for problem description and instructions.




    //-------------------------------------------------------
    // Add element to the head of the list
    //-------------------------------------------------------
    public void add( Item item ) {
        // Complete the JPA code here, see README on course website for problem description and instructions.

        Node firstLink = new Node(item, first);
        first = firstLink;
        N++;
    }
    //-------------------------------------------------------
    // Remove the first element
    //-------------------------------------------------------
    public void remove() {
        // Complete the JPA code here, see README on course website for problem description and instructions.

        first = first.next;
        N--;
    }    

    // //-------------------------------------------------------
    // // Count: count number of elements in the list
    // //-------------------------------------------------------
    public int size(){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        return N;

    }
    // //-------------------------------------------------------
    // // is empty
    // //-------------------------------------------------------
    public boolean isEmpty(){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (first.item == null) return true;
        else return false;

    }
    // //-------------------------------------------------------
    // // Count: count
    // //-------------------------------------------------------
    public int count() {
        // int N = count1();
        assert ( count1() == N);
        assert ( count2() == N);
        return N;
    }
    // //-------------------------------------------------------
    // // Count: iterative implementation
    // //-------------------------------------------------------
    public int count1 (){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        // int count = 0;
        int eN = 0;
        if (first == null) return 0;
        else{
            for (Node i = new Node(first.item, first.next); i != null; i = i.next)
                ++eN;
        }
        return eN;

    }
    // //-------------------------------------------------------
    // // Count: method2 
    // //-------------------------------------------------------
    public int count2 (){
        return count_r(first);
    }

    // //-------------------------------------------------------
    // // Recursive implementation of count
    // //-------------------------------------------------------
    public  int count_r(Node  node){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        int count = 0;
        Node temp = new Node(node.item,node.next);
        if (temp.next == null) return 0;
        else {
            temp=temp.next;
            count_r(temp);
            count++;
        }

        return (count+1);
    }
    
    // //-------------------------------------------------------
    // // Return the max element value
    // //-------------------------------------------------------
    public Item maxItem () {
        Node r = maxNode1(first);
        Node s = maxNode2(first);
        if (r!=null) assert (r.item .equals(s.item));
        assert (r == s);
        if (r==null) return null;
        return r.item;
    }
    
    // //-------------------------------------------------------
    // // Return the node with the max element value: iterative implementation
    // //-------------------------------------------------------
    public Node maxNode1(Node node){
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (node == null) return null;
        Item maxItem = node.item;
        Node maxNode = node;
        for (Node i = new Node(node.item, node.next); i != null; i = i.next)
            if (i.item.compareTo(maxItem) > 0) 
                {
                    maxNode = i;
                    maxItem = i.item;
                }
        return maxNode;

    }
    // //-------------------------------------------------------
    // // Return the node with the max element value: method2
    // //-------------------------------------------------------
    public Node maxNode2(Node  node){
        return maxNode_r(node);
    }

    // //-------------------------------------------------------
    // // Return the node with the max element value: recursive implementation
    // //-------------------------------------------------------
    public Node maxNode_r(Node  node){
        // do not change the original node

        // stop condition
        if (node.next == null) return node;
        else{
            Node max = maxNode_r(node.next); // reduce to the last pair
            if (max.item.compareTo(node.item) < 0) return node;
                else return max;
            } 
        }

    // //-------------------------------------------------------
    // // Find if an element exists
    // //-------------------------------------------------------
    public boolean find (Item item) {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        Node i = first;
        boolean check = false;
        while (i != null){
            if (i.item.equals(item)){
                check = true;
                break;
            }
            i=i.next;
        }
        return check;
    }
    // //-------------------------------------------------------
    // // Delete the ith element using recursion
    // //-------------------------------------------------------
    public void deleteKth ( int k) {
        if (k>=N) return ;
        first = deleteKth_r(first, k);
        N--;
    }
    // //-------------------------------------------------------
    // // Delete the ith element using iterative method
    // //-------------------------------------------------------
    public void deleteKth_iter ( int k) {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        Node node = first;
        // if k = 0 
        if (k == 0){
            first = node.next;
            return;
        }
        // if k != 0
        // Find the previous node of the node to be deleted 
        for (int i=0; node!=null && i<k-1; i++) 
            node = node.next; 
  
        // If position is more than number of nodes 
        if (node == null || node.next == null) 
            return; 
  
        // we have found the previous node of the node to be delete, then delete it  
        node.next = node.next.next; 

    }
    // //-------------------------------------------------------
    // // Delete the ith element using recursion
    // //-------------------------------------------------------
    public Node deleteKth_r(Node node, int k) {
        if (k == 0) {
            Node save = node;
            node = node.next;
            return save;
        }

        if (k == 1){
            if (node.next != null){
                node.next = node.next.next;
                return node;
            }
            else return node;
        }
        else  {
            Node i = node;
            deleteKth_r(i.next, k-1);
            return node;
        }

    }

    
    // //-------------------------------------------------------
    // // Return the head of the list
    // //-------------------------------------------------------
    public Item head() {
        // Complete the JPA code here, see README on course website for problem description and instructions.

        return first.item;

    }
    
    // //-------------------------------------------------------
    // // Print the list items from first to last, separated by one space
    // //-------------------------------------------------------
    public void show() {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (first == null) return;

        for (Node i = new Node(first.item, first.next); i != null; i = i.next)
            StdOut.print(i.item+" ");
        StdOut.println();
    }

    // //-------------------------------------------------------
    // // Print the content of the stack, separated by one space (hint: use Stack's iterator())
    // //-------------------------------------------------------
    public static void PrintStack(Stack<Integer> stack) {
        // Complete the JPA code here, see README on course website for problem description and instructions.

        Iterator values = stack.iterator(); 
        while (values.hasNext()) { 
            System.out.print(values.next()+" "); }
        StdOut.println();

    }

    //-------------------------------------------------------
    // Test client
    //-------------------------------------------------------
    public static void main( String [] args ) {
        Stack<Integer> stack = new Stack<Integer>();
        LinkedList<Integer> lst = new LinkedList<Integer> ();
        while (!StdIn.isEmpty()){
            String a = StdIn.readString();
            try { 
                if (a.equals("add"))  {
                    lst.add(stack.pop());
                }
                else if ( a.equals("remove") ) lst.remove();
                else if ( a.equals("size") ) StdOut.println("size: " + lst.size());
                else if ( a.equals("count") ) StdOut.println("count: " + lst.count());
                else if ( a.equals("deleteKth") ) {
                    int kth = stack.pop();
                    lst.deleteKth(kth);
                    StdOut.println("deleteKth k=" + kth );
                }
                else if ( a.equals("deleteKth_iter") ) {
                    int kth = stack.pop();
                    lst.deleteKth_iter(kth);
                    StdOut.println("deleteKth_iter k=" + kth );
                }
                else if ( a.equals("head") ) StdOut.println("head: " + lst.head());                
                else if ( a.equals("find") ) StdOut.println("find: " + lst.find(stack.pop()));
                else if (a.equals("show") )  {
                    StdOut.print("show: ");
                    lst.show();
                } else if ( a.equals("max") )  StdOut.println("max: " + lst.maxItem());               
                else if(a.equals("stack"))   {
                    StdOut.print("stack: " );
                    PrintStack(stack);
                } 
                else {
                    stack.push(Integer.parseInt(a));
                } 
            } catch (RuntimeException e) {
                StdOut.println("Exception: " + e);
            } 
        }
    }
}

