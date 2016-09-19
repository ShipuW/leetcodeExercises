/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode i = head;
        ListNode j = head;
        while(j.next!=null){
            if(j.val != j.next.val){
                i = j;
            }
        }
        i = j;
        return head;
    }
}