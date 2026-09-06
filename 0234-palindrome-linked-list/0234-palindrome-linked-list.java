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
    public boolean isPalindrome(ListNode head) {
    // Logic for this : Find Middle -> Reverse Second half -> Compare List -> return True/False

    // Middle Find Krne ki liye!

    ListNode first = head;
    ListNode second = head;

    while(second != null && second.next != null){
        first = first.next;
        second = second.next.next;
    }

    // Reverse Second half. . .

    ListNode current = first;
    ListNode last = null;

    while(current != null){
        ListNode temp = current.next;
        current.next = last;
        last = current;
        current = temp;
    }

    // Compare krne liye. . .

    ListNode left = head;
    ListNode right = last;

    while(right != null){
        if(left.val != right.val){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
    }
}