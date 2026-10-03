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
        ListNode turtle = head;
        ListNode rabbit = head;

        while(rabbit != null && rabbit.next != null){
            turtle = turtle.next;
            rabbit = rabbit.next.next;

            if(turtle == rabbit){
                ListNode newPointer = head; // newPointer bniye joo head ko point out kregya!

                // Jab tak newPointer aur rabbit same node par nahi aaye hain, loop chalao.
                while(newPointer != rabbit){
                    newPointer = newPointer.next;
                    rabbit = rabbit.next;
                } 
                // newPointer aur rabbit same node par milte hain, aur wahi cycle ka starting node hota hai.
                return newPointer;
            }
        }
        return null; 
    }
}