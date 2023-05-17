package TestLearn.queue;

public class Queue {
    int arr[];
    int front,rear;
    int capacity;

    Queue(){
        arr=new int[10];
        front=-1;
        rear=-1;
        capacity=10;
    }
    Queue(int size){
        arr=new int[size];
        front=-1;
        rear=-1;
        capacity=size;
    }

    public Boolean isFull(){
        if(front==0 && rear==capacity-1){
            return true;
        }
        return false;
    }

    public Boolean isEmpty(){
        return front==-1;
    }

    public void enQueue(int x){
        if(isFull()){
            System.out.println("Queue is full. Unable to insert::"+x);
            return;
        }
        if(front==-1){
            front=front+1;
        }
        rear++;
        arr[rear]=x;
        System.out.println("Inserted::"+x);
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }
        int x=arr[front];
        if(front>=rear){
            front=rear=-1;
        }else{
            front++;
        }
        return x;
    }

    public void printQueue(){
        System.out.println("Printing queue");
        for(int i=0;i<capacity-1;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}
