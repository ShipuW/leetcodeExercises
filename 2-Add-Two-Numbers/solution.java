/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode t1=l1,t2=l2,tr = result;

        int carry = 0;
        //int sum = 0; //use sum -> time limit excceed  ???
        while (t1 != null || t2 != null || carry != 0){
            if (t1 != null){
                carry += t1.val;
                t1 = t1.next;
                
            }
            
            if (t2 != null){
                carry += t2.val;
                t2 = t2.next;
                
            }
            //sum += carry;
            tr.next = new ListNode(carry%10);
            tr = tr.next;
            carry /= 10;
        
        }
        return result.next;
    }
}