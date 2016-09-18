/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.Hashtable;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
        ListNode p = head;
        table.put(p.val, true);
        while(p.next != null ){
            if(table.containsKey(p.next.val)){
                p.next = p.next.next;//not move p ****
            }else{
                table.put(p.next.val, true);
                p = p.next;
            }
            
        }
        return head;
    }
}