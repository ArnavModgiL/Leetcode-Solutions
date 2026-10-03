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
    public ListNode detectCycle(ListNode head) {
        ListNode turtle = head; // turtle point toward the head ...
        ListNode rabbit = head; // point toward the head . . .!

        while(rabbit != null && rabbit.next != null){
            turtle = turtle.next;
            rabbit = rabbit.next.next;

            if(turtle == rabbit){
                ListNode newPointer = head;


                while(newPointer != rabbit){
                    newPointer = newPointer.next;
                    rabbit = rabbit.next;
                }
                return newPointer;
            }
        }
        return null;
    }
}