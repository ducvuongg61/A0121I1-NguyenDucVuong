package b11_DSA_stack_queue.thuchanh.Queue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }

    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.enqueue(12);
        myLinkedListQueue.enqueue(11);
        myLinkedListQueue.enqueue(10);
        myLinkedListQueue.enqueue(20);
        myLinkedListQueue.enqueue(30);
        myLinkedListQueue.enqueue(40);
        myLinkedListQueue.enqueue(50);

        System.out.println("Dequeue item is : " + myLinkedListQueue.dequeue().key);
        System.out.println("Dequeue item is : " + myLinkedListQueue.dequeue().key);


    }
}
