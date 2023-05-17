package TestLearn.stack;

public class DoubleStack {
    private int arr[];
    int top1,top2;
    int capacity;

    DoubleStack(){
        this.arr=new int[10];
        this.top1=-1;
        this.top2=10;
        this.capacity=10;
    }
    DoubleStack(int size){
        this.arr=new int[size];
        this.top1=-1;
        this.top2=size;
        this.capacity=10;
    }

    public void push1(int x){
        if(top1<top2-1){
            top1++;
            arr[top1]=x;
        }else{
            System.out.println("Stack1 is full.Unable to push::"+x);
        }
    }

    public void push2(int x){
        if(top1<top2-1){
            top2--;
            arr[top2]=x;
        }else{
            System.out.println("Stack2 is full.Unable to push::"+x);
        }
    }

    public int pop1(){
        if(top1>=0){
            int x=arr[top1];
            top1--;
            return x;
        }else{
            System.out.println("Stack1 is empty");
            return -1;
        }
    }

    public int pop2(){
        if(top2<capacity){
            int x=arr[top2];
            top2++;
            return x;
        }else{
            System.out.println("Stack2 is empty");
            return -1;
        }
    }
}
