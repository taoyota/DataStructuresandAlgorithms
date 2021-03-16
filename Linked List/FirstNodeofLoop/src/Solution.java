public class Solution {
    public ListNode findMeetPoint(ListNode head) {
        if (head == null)
            return null;

        ListNode slow = head;
        ListNode fast = slow;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return slow;
            }
        }

        return null;
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = findMeetPoint(head);

        while (slow != fast) {
            if (fast == null)
                return null;

            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
