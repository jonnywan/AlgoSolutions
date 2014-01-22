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
