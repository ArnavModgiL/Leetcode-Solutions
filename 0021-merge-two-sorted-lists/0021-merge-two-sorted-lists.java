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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // temporary node banata hai jisme starting value 0 hoti hai, taaki merged linked list ko easily build kar sakein.
        ListNode newAnswer = new ListNode(0);
        ListNode curr = newAnswer;
        // curr ko newAnswer node par point karwa raha hai, taaki hum merged list ko curr ke through build kar sakein.

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1; // Current merged list ke end mein list1 ka current node attach karta hai.
                list1 = list1.next; // list1 pointer ko uske next node par move karta hai.
            }
            else {
                curr.next = list2;
                list2 = list2.next; // list2 pointer ko uske next node par move karta hai.
            }
            curr = curr.next; // current ko uske next node per move krdoo .
        }

        if(list1 != null){
            curr.next = list1; // Current merged list ke end mein list1 ka current node attach karta hai.
        } else {
            curr.next = list2; // current merged list ke end mein list2 ka current node attach karta hai.
        }
        return newAnswer.next; // actually dummy node koo skip krke merged list return karta hai...
    }
}