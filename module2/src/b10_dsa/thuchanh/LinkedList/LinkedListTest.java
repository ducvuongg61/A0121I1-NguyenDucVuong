package b10_dsa.thuchanh.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        System.out.println("TESTING");
        LinkedList list = new LinkedList(10);
        list.addFirst(11);
        list.addFirst(12);
        list.addFirst(13);

        list.add(4,9);
        list.add(4,8);
        list.printList();
    }
}
