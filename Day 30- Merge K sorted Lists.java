/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->{
            return a.val-b.val;
        });
        for(ListNode l:lists) {
            if(l!=null) pq.add(l);
        }
        ListNode dummy=new ListNode();
        ListNode tail=dummy;
        while(!pq.isEmpty()){
            ListNode n=pq.remove();
            tail.next=new ListNode(n.val);
            tail=tail.next;
            if(n.next!=null) pq.add(n.next);
        }
        return dummy.next;
    }
}