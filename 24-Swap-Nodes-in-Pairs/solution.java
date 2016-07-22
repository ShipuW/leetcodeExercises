/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
			return head;
        ListNode p = head;
        //head change with next is a special case, so we deal with it first
		ListNode t = p.next;
		p.next = t.next;
		t.next = p;
		head = t;
        while (p.next != null && p.next.next != null){
            // if(p.next.next != null){
            //     ListNode temp = p.next.next;
            //     p.next.next = p;
            //     p.next = temp;
            //     p = p.next;
            // }else{
            //     p.next.next = p; 
            //     p.next = null;
            // }
            swapNode(p, p.next, p.next.next);
			p = p.next.next;
        }
        
        return head;
    }
    public void swapNode(ListNode cur, ListNode next1, ListNode next2) {
		cur.next = next2;
		next1.next = next2.next;
		next2.next = next1;
	}
}