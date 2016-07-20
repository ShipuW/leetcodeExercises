/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode leader=head;
        ListNode target=head;
        if (leader.next == null)
			return null;
		while (n != 0) {
			leader = leader.next;
			n--;
		}
		if (leader == null)
			return head.next;
        // for(int i = 0; i <= n; i++){
        //     leader = leader.next;
        //     if (leader == null) return null;
        // }
        while(leader.next != null){
            leader = leader.next;
            target = target.next;
        }
        target.next = target.next.next;
        //target = target.next;
        return head;
    }
    
}