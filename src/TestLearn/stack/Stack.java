package TestLearn.stack;

public class Stack {
    private int arr[];
    int top;
    int capacity;

    public Stack() {
        this.arr=new int[10];
        this.top=-1;
        this.capacity=10;
    }
    public Stack(int size) {
        this.arr=new int[size];
        this.top=-1;
        this.capacity=size;
    }

    public Boolean isFull(){
        return top==capacity-1;
    }
    public Boolean isEmpty(){
        return top==-1;
    }

    public void push(int x){
        if(isFull()) {
            System.out.println("Stack is Full. Unable to push::"+x);
            return;
        }
        top++;
        arr[top]=x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty. No more element");
            return -1;
        }
        int x=arr[top];
        top--;
        return x;
    }

    public void printStack(){
        System.out.println("Printing stack");
        for(int i=0;i<top+1;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}
