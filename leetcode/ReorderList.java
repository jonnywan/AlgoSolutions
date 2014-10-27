/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class ReorderList {
    //Time Limit Exceeded.
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return;
        ListNode subList = head.next;
        ListNode cur1 = head, cur2 = head.next;
        while(cur2.next != null) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        head.next = cur2;
        cur1.next = null;
        reorderList(subList);
        head = head.next;
        head.next = subList;
    }

/**************************** added 20141028 *********************************/
    // Cannot AC, some bugs to be fixed.

    public void reverseList(ListNode head) {
        if (head == null || head.next == null)
            return;
        ListNode prev = head;
        ListNode cur = prev.next;
        while (cur != null) {
            prev.next = cur.next;
            cur.next = head;
            head = cur;
            cur = prev.next;
        }
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return;
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        ListNode lastHalf = null;
        cur = head;
        for (int i = 0; i < len / 2; i++) {
            cur = cur.next;
        }
        lastHalf = cur.next;
        cur.next = null;
        reverseList(lastHalf);
        cur = head;
        ListNode cur1 = head.next;
        ListNode cur2 = lastHalf;
        for (int i = 1; i < len; i++) {
            if (i % 2 == 1) {
                cur.next = cur2;
                cur2 = cur2.next;
                cur = cur.next;
            } else {
                cur.next = cur1;
                cur1 = cur1.next;
                cur = cur.next;
            }
        }
    }

}
