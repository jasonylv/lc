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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode d = dummy;
        
        while (head!=null) {
            if ( head.next!=null && head.val == head.next.val )
            {
                int val = head.val;
                while ( head!=null && head.val == val )
                    head = head.next;
                continue;
            }
            d.next = head;
            d = d.next;
            head = head.next;
        }
        d.next = head;
               
        return dummy.next;
    }
}