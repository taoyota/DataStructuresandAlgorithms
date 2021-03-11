public class MyLinkedList {

    public class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    private Node getNode(int index) {
        Node n = new Node(0, head);
        while (index-- >= 0) {
            n = n.next;
        }

        return n;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        return getNode(index).val;
    }

    public void addAtHead(int val) {
        head = new Node(val, this.head);
        if (size++ == 0) {
            tail = head;
        }
    }

    public void addAtTail(int val) {
        Node n = new Node(val);
        if (size++ == 0)
            head = tail = n;
        else
            tail = tail.next = n;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node prev = getNode(index - 1);
        prev.next = new Node(val, prev.next);
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > size - 1) return;
        Node prev = getNode(index - 1);
        prev.next = prev.next.next;
        if (index == 0) {
            head = prev.next;
        }
        if (index == size - 1) {
            tail = prev;
        }
        size--;
    }

    public void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
    }
}
