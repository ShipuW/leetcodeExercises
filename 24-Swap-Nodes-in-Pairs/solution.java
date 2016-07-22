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
			if (head == null)
				return null;
			if (head.next == null)
				return head;
			ListNode cur = head;
			//head change with next is a special case, so we deal with it first
			ListNode temp = cur.next;
			cur.next = temp.next;
			temp.next = cur;
			head = temp;
			// handle other cases
			while (cur.next != null && cur.next.next != null) {
				swapNode(cur, cur.next, cur.next.next);
				cur = cur.next.next;
			}
			return head;
		}

		public void swapNode(ListNode cur, ListNode next1, ListNode next2) {
			cur.next = next2;
			next1.next = next2.next;
			next2.next = next1;
		}
}