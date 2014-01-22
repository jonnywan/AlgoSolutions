/*
 * Given a linked list, reverse the nodes of a linked list k at a time and return 
 * its modified list.

 * If the number of nodes is not a multiple of k then left-out nodes in the end 
 * should remain as it is.

 * You may not alter the values in the nodes, only nodes itself may be changed.

 * Only constant memory is allowed.

 * For example,
 * Given this linked list: 1->2->3->4->5

 * For k = 2, you should return: 2->1->4->3->5

 * For k = 3, you should return: 3->2->1->4->5
 * 
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        ListNode cur1 = head;
        ListNode cur2 = head.next;
        int cnt = 1;
        while(cnt < k && cur2 != null) {
            cur1 = cur1.next;
            cur2 = cur2.next;
            cnt++;
        }
        if(cnt < k)
            return head;
        cur1.next = null;
        head = reverse(head);
        cur1 = head;
        while(cur1.next != null) {
            cur1 = cur1.next;
        }
        cur1.next = reverseKGroup(cur2, k);
        return head;
    }

    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode p = head.next;
        head.next = null;
        while(p != null) {
            ListNode q = p.next;
            p.next = head;
            head = p;
            p = q;
        }
        return head;
    }
}
