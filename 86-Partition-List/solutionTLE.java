/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null)return head;
        ListNode res1 = new ListNode(0);
        ListNode r1 = res1;
        ListNode res2 = new ListNode(0);
        ListNode r2 = res2;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val < x){
                res1.next=temp;
                res1=res1.next;
                
            }else{
                res2.next=temp;
                res2=res2.next;
                
            }
            temp=temp.next;
        }
        res1.next = r2.next;
        return r1.next;
    }
}