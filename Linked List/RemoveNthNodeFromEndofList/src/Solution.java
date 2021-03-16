public class Solution {

    public int getLength(ListNode head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        int length = getLength(head);
        int prevIndex = length - n;

        while (prevIndex > 0) {
            prevIndex--;
            prev = prev.next;
        }

        prev.next = prev.next.next;
        return dummy.next;
    }
}
