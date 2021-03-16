public class Solution {

    public int getLength(ListNode head) {
        int length = 1;
        ListNode next = head.next;

        while (next != null) {
            next = next.next;
            length++;
        }

        return length;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        int indexLong = Math.abs(lengthA - lengthB);

        for (int i = 0; i < indexLong; i++) {
            if (lengthA > lengthB)
                headA = headA.next;
            else
                headB = headB.next;
        }

        while (headA != headB) {
            if (headA.next == null || headB.next == null) {
                return null;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}
