/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode turtle = head; // turtle point towards head of linkedlist ...
        ListNode rabbit = head; // point towards head of linkedlist...

        while(rabbit != null && rabbit.next != null){

            turtle = turtle.next; // turtle ko one step bdhoo...
            rabbit = rabbit.next.next; // rabbit ko two step bdhoo...
// Agar turtle aur rabbit same node ko point kar rahe hain, toh cycle mil gayi.
            if(turtle == rabbit){
                return true;
            }
        }
        return false;
    }
}