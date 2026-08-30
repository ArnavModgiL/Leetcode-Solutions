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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode current = head;
        ListNode tail = null;
        int length = 0;
        while(current != null){
            length++;
            if(current.next == null){
                tail = current;
            }
            current = current.next;
        }

        k = k % length;
        if(k == 0){
            return head;
        }
        tail.next = head;
        ListNode newTail = head;
        for(int i = 0; i < length - k - 1; i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}