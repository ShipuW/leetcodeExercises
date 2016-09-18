/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null)
			return head;
        //if k > list length ****
        int len = getLength(head);
		k %= len;
		if (k == 0)
			return head;
        
        ListNode pre = head;
        ListNode cur = head;
        for(int i = 0; i < k; i++){
            pre = pre.next;
        }
        while(pre.next != null){
            pre=pre.next;
            cur=cur.next;
        }
        ListNode res = cur.next;
        cur.next = null;
        pre.next = head;
        return res;
    }
    public int getLength(ListNode head) {
		int len = 0;
		while (head != null) {
			head = head.next;
			len++;
		}
		return len;
	}
    
}