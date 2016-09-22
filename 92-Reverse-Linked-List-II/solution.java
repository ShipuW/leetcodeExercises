/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 /* 比如反转b->c->d：a->b->c->d->e => a->d->c->b->e
 * 三个variable
 * prevM：指向反转部分的前一个元素。
 * prev：指向已经反转成功的最后一个元素，反转前的第一个元素prevM.next，不需要改动。
 * curr：指向要插入prevM后面的那个元素。
 * 算法：每次拿出右边的新元素，往prevM后面插，最后curr==不需要反转的section的第一个节点时退出
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        /*if(head==null)return head;
        if(m==n)return head;
        int p = 1;
        
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode temp = res;
        while(p<m){
            temp = temp.next;
            p++;
        }
        ListNode tempEnd = temp;
        temp = temp.next;
        ListNode preNode = temp;
        temp = temp.next;
        p++;
        ListNode nextNode = new ListNode(0);
        while(p<n){
            nextNode = temp.next;
            temp.next = preNode;
            preNode = temp;
            temp = nextNode;
            p++;
        }
        ListNode tmp = tempEnd.next;
        tempEnd.next = temp;
        tmp.next = temp.next;
        return res.next;
    }*/
    ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prevM = dummy, prev = dummy, curr = dummy;
		for (int i = 1; i <= n; i++) {
			if (i < m) {
				prevM = prevM.next;
			} else if (i == m) {
				prev = prevM.next;
				curr = prev.next;
			} else {
				prev.next = curr.next;
				curr.next = prevM.next;
				prevM.next = curr;
				curr = prev.next;
			}
		}
		return dummy.next;
	}
}