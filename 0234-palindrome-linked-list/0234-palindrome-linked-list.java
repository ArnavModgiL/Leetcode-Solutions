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

        if(head == null || head.next == null){ // BASE CASE...
            return true;
        } 
        // FIRSTLY FIND MIDDLE FOR THIS :
        ListNode first = head; // Pointing toward head...
        ListNode second = head; // Pointing toward head...

        while(second != null && second.next != null){
            first = first.next; // first ko ikh position aaghe move kro...
            second = second.next.next; // second ko 2 nodes aage move kar do.
        }

        // REVERSE KRNI MIDDLE OF LINKEDLIST :

        ListNode current = first; // current point toward head or first. . .
        ListNode last = null; // last point toward null...

        while(current != null){
            ListNode temp = current.next;
            current.next = last;
            last = current;
            current = temp;
        }

        // COMPARE KRNA ABH :

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