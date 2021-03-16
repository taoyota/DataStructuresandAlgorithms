public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 1;
        ListNode cur = head;
        ListNode pos = cur;

        while (cur.next != null) {
            size++;
            cur = cur.next;

            if (size > n + 1) {
                pos = pos.next;
            }
        }

        if (size == n) {
            return head.next;
        }
        pos.next = pos.next.next;
        return head;
    }
}
