package TestLearn.stack;

public class Client {
    public static void main(String[] args) {
        Stack stack= new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();
        int popElm = stack.pop();
        System.out.println("Pop Element::"+popElm);
    }
}
