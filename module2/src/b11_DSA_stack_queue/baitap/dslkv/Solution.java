package b11_DSA_stack_queue.baitap.dslkv;

public class Solution {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println("Queue : ");
        queue.displayQueue();

        System.out.println("Dequeue : " + queue.dequeue());

        System.out.println("Queue after dequeue : ");
        queue.displayQueue();


    }
}
