/*
 *Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

 * You must do this in-place without altering the nodes' values.

 * For example,
 * Given {1,2,3,4}, reorder it to {1,4,2,3}.
 */
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

/**************************** added 20141028 *********************************/
    // Cannot AC, some bugs to be fixed.

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode cur = prev.next;
        while (cur != null) {
            prev.next = cur.next;
            cur.next = head;
            head = cur;
            cur = prev.next;
        }
        return head;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return;
        int len = 0;
        ListNode cur1 = head;
        ListNode cur2 = head;
        while (cur2 != null) {
            
        }




        ListNode cur1 = head;
        ListNode cur2 = lastHalf;
        while (cur1 != null || cur2 != null) {
            cur.next = cur2;
            cur2 = cur2.next;
            cur = cur.next;
            cur.next = cur1;
            cur1 = cur1.next;
            cur = cur.next;
        }
    } 

}
