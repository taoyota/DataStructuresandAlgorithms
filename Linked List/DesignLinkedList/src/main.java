public class main {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.print();
        System.out.println();
        myLinkedList.addAtTail(3);
        myLinkedList.print();
        System.out.println();
        myLinkedList.addAtIndex(1, 2);
        myLinkedList.print();
        System.out.println();
        myLinkedList.deleteAtIndex(1);
        myLinkedList.print();
        System.out.println();
        int val = myLinkedList.get(1);
        System.out.println(val);
    }
}
