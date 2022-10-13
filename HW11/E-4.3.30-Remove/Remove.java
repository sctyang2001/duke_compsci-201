public class Remove
{
    public static void main(String[] args)
    {
        // DON'T change this.
        int n = StdIn.readInt(), k = StdIn.readInt();
        String str = StdIn.readString();
        LinkNode head, q;
        head = q = new LinkNode(str, null);
        for (int i = 1; i < n; ++i)
            {
                String a = StdIn.readString();
                q.next = new LinkNode(a, null);
                q = q.next;
            }
        for (q = head; q != null; q = q.next)            StdOut.print(q.value + " ");
        StdOut.println();
        q = head;
        for (int i = 1; i <= k; ++i) q = q.next;
        
        LinkNode head2 = remove(head, q.value);
        
        for (LinkNode r = head2; r != null; r = r.next)
            StdOut.print(r.value + " ");
        StdOut.println();
    }

    private static class LinkNode
    {
        public String value;
        public LinkNode next;
        public LinkNode(String v, LinkNode n)
        {
            value = v; next = n;
        }
    }

    public static LinkNode remove(LinkNode head, String key)
    {
        // Complete the JPA code here, see README on course website for problem description and instructions.
        while ((head.value.equals(key))){
            if (head.next != null)
            head = head.next;
            else{
                LinkNode error = new LinkNode("", null);
                return error;
            }
        }
        
        LinkNode saveHead = head;
        while ((head != null) && (head.next != null)){
                while ((head.next != null) && (head.next.value.equals(key))){
                    head.next = head.next.next;
                }
                head = head.next;
            }
        return saveHead;
    }
}
