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
        if(head == null || head.next == null || k == 0){ // aghr head = 0 yha fir head kie aaghe element nhi hai ya fir joo k hai voo zero hai soo .
            return head;
        }
        int length = 0; // length variable bniye.
        ListNode current = head; // current node bniye use head ki or point out kr diya okie!
        ListNode tail = null; // current tail node bniye use null ki equal kr diya ji.

        while(current != null){ // jbh tkh current null kiye equal nhi hota 
            length++; // length increase krdoo ++ 
            if(current.next == null){
                tail = current; // aghr current ke aagye null hai to tail ko current bndoo okie
            }
            current = current.next; // current pointer ko current.next pointer pr move krdoo
        }
        k = k % length; 
        if(k == 0){
            return head;
        }
        tail.next = head; // list ko basically rotate kr diya hmne!
        ListNode newTail = head; // new Tail bniye joo ki head sai start hogyi. . .
        for(int i = 0; i < length - k - 1; i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next; // ikh new head bniye joo ki new tail ki aggye sai start ooo.
        newTail.next = null; // new tail koo null ki equal kr dye.


        return newHead; // new head ko last mai return krdiye;
    }
}