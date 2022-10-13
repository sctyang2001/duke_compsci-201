// Exercise 4.3.36 GeneralDeque
// implement a general deque using linked list

import java.util.*;

public class GeneralDeque<Item> implements Iterable<Item>
{

    //----------------------------------------------
    // Test Client : Don't touch
    //----------------------------------------------
    public static void main(String[] args)
    {
        // don't change this 

        GeneralDeque<Integer> gd = new GeneralDeque<Integer>();
        Stack<String> stack = new Stack<String> () ;
        while (!StdIn.isEmpty()){
            String op = StdIn.readString();
            if (op.equals("empty"))
                StdOut.println("empty: " + gd.isEmpty());
            else if (op.equals("size"))
                StdOut.println("size: " + gd.size());
            else if (op.equals("push")){ 
                try { 
                    gd.push(Integer.parseInt(stack.pop()));
                } catch (RuntimeException e) {StdOut.println("Exception(push): " + e);}
                
            } else if (op.equals("enqueue")) { 
                try { 
                    gd.enqueue(Integer.parseInt(stack.pop()));
                } catch (RuntimeException e) {StdOut.println("Exception(enqueue): " + e);}
            } else if (op.equals("pop"))
            {
                try {StdOut.println("pop: " + gd.pop());}
                catch (RuntimeException e) {StdOut.println("Exception(pop): " + e);}
            }
            else if (op.equals("dequeue"))
            {
                try {StdOut.println("dequeue: " +  gd.dequeue());}
                catch (RuntimeException e) {StdOut.println("Exception(dequeue): " + e);}
            }
            else if (op.equals("peek"))
            {
                try {StdOut.println("peek: " + gd.peek());}
                catch (RuntimeException e) {StdOut.println("Exception(peek): " + e);}
            }
            else if (op.equals("top"))
            {
                try {StdOut.println("top:" + gd.top());}
                catch (RuntimeException e) {StdOut.println("Exception(top): " + e);}
            }
            else if (op.equals("show")){
                StdOut.print("show: [ ");
                for (int ele : gd) StdOut.print(ele + " ");
                StdOut.println("]");
            } else {
                stack.push(op);
            }  
        }
        StdOut.print("exit: [ ");
        for (int ele : gd) StdOut.print(ele + " ");
        StdOut.println("]");

    }

    //----------------------------------------------
    //  Double Linked List representation as a private class
    //----------------------------------------------
    private class ListNode
    {
        //----------------------------------------------
        // Instance Variable
        //----------------------------------------------
        // Complete the JPA code here, see README on course website for problem description and instructions.

        private Item item = null;
        private ListNode previous;
        private ListNode next;

        //----------------------------------------------
        // Instance Variable
        //----------------------------------------------
        public ListNode(Item i, ListNode p, ListNode n)//I guess p stands for previous and n stands for next
        {
            // Complete the JPA code here, see README on course website for problem description and instructions.

            i = item;
            p = previous;
            n = next;

        }
        
    }
    
    //----------------------------------------------
    // Instance Variable
    //----------------------------------------------
    // Complete the JPA code here, see README on course website for problem description and instructions.

    Item item = null;
    ListNode last = null;
    ListNode first = null;
    int len = 0;


    //----------------------------------------------
    // Constructor
    //----------------------------------------------

    public GeneralDeque() {

    }
    
    //----------------------------------------------
    // Method
    //----------------------------------------------
    public boolean isEmpty()
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.

        if (first==null) return true;
        else return false;

    }

    public int size()
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.

            return len;

    }

    public void push(Item i)
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        ListNode newFirst;
        newFirst = new ListNode(i,null,first);

        ListNode saveOld = first;
        first = newFirst;
        first.item = i;
        first.next = saveOld;

        if (saveOld != null) saveOld.previous = first;

        len++;

        if (len == 1) last = first ;
    }

    public void enqueue(Item i)
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        ListNode newLast = new ListNode(i, last, null);

        ListNode saveOld = last;

        last = newLast;
        last.item = i;
        last.previous=saveOld;

        if (saveOld != null ) saveOld.next  = last;

        len++;
        if (len == 1) first = last;

    }

    public Item pop()
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (first == null || (first.item == null) || this.isEmpty())
            throw new RuntimeException("get/delete method called on empty deque");
        Item thing = first.item;
        if (first.next != null){
            first = first.next;
            first.previous = null;
        }
        else {

            first.item = null;
            if (first.previous != null) first.previous = null;
            first = null;
            last = null;
        }
        len--;
        return thing;
    }

    public Item dequeue()
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (last == null || last.item == null|| this.isEmpty())
            throw new RuntimeException("get/delete method called on empty deque");
        Item saveLast = last.item;
        if (last.previous != null){
             last = last.previous;
             last.next = null;
            }
        else {
            last.item = null;
            if (last.next != null) last.next = null;
            last = null;
            first = null;
        }
        len--;
        return saveLast;
    }

    public Item peek()
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        if (first == null || first.item == null)
            throw new RuntimeException("get/delete method called on empty deque");
        return first.item;

    }

    public Item top()
    {
        // example code to throw an exception
        if (last == null || last.item == null)
            throw new RuntimeException("get/delete method called on empty deque");
        // Complete the JPA code here, see README on course website for problem description and instructions.

        return last.item;

    }

    // deque iterator
    private class DIter implements Iterator<Item>
    {
        
        //----------------------------------------------
        // Instance Variable
        //----------------------------------------------
        // Complete the JPA code here, see README on course website for problem description and instructions.

        private ListNode current = first;

        //----------------------------------------------
        // Constructor
        //----------------------------------------------
        public DIter() {
            // Complete the JPA code here, see README on course website for problem description and instructions.
        }
        //----------------------------------------------
        // Method
        //----------------------------------------------
        public boolean hasNext() {
            // Complete the JPA code here, see README on course website for problem description and instructions.

            return (current != null);

        }
        public Item next()
        {
            // Complete the JPA code here, see README on course website for problem description and instructions.
            if (current.item == null) return null;
            Item item = current.item;
            if (item  != null)
                {
                    current = current.next;
                    return item;
                }
            else return null;
        }
    }

    public Iterator<Item> iterator()
    {
        
        return new DIter();
        
    }

}
