package TestLearn.queue;

public class Client {
    public static void main(String[] args) {
        Queue q= new Queue(3);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.printQueue();

        System.out.println("Deleting from queue::"+q.deQueue());

    }
}
