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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> s=new HashSet<>();
        for(int ele:nums) s.add(ele);
        while(head!=null && s.contains(head.val)) head=head.next;
        if(head==null) return null;
        ListNode temp=head;
        while(temp.next!=null){
            if(s.contains(temp.next.val)) temp.next=temp.next.next;
            else temp=temp.next;
        }
        return head;
    }
}
