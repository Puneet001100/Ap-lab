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
        ListNode dummy = new ListNode(-101);
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;
        while (current != null) {
            boolean isDuplicate = false;
            while (current.next != null && current.next.val == current.val) {
                current = current.next;
                isDuplicate = true;
            }
            if (isDuplicate) prev.next = current.next;
            else prev = prev.next;
            current = current.next;
        }
        return dummy.next;
    }
}