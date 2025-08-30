class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode e=new ListNode();
        ListNode o=new ListNode();
        if(head==null || head.next==null) return head;
        ListNode e1=e;
        ListNode o1=o;
        while(head!=null){
                o1.next=new ListNode(head.val);
                o1=o1.next;
                if(head.next!=null){
                    e1.next=new ListNode(head.next.val);
                    e1=e1.next;
                }
           if(head.next!=null) head=head.next.next;
           else break;
        }
        if(o==o1) return e.next;
        o1.next=e.next;
        return o.next;
    }
}