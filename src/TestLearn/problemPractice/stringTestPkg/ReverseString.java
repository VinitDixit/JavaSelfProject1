package TestLearn.problemPractice.stringTestPkg;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        reverseStringUsingStack("CAT");
        reverseStringUsingBuilder("DOG");

        String input="LION";
        StringBuilder sb= new StringBuilder(input);
        System.out.println("String:::"+input);
        System.out.println("Reverse using builder reverse method::"+sb.reverse());

    }

    /**
     * String can be reversed by putting each character in a stack and then getting elements from stack
     * stack-LIFO (last in first out)
     * @param input
     */
    public static void reverseStringUsingStack(String input){
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<input.length();i++){
            stack.push(input.charAt(i));
        }

        StringBuilder builder=new StringBuilder();
        while(!stack.isEmpty()){
            builder.append(stack.pop());
        }
        System.out.println("String:::"+input);
        System.out.println("Reverse using stack::"+builder);
    }

    public static void reverseStringUsingBuilder(String input){
        StringBuilder builder=new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            builder.append(input.charAt(i));
        }

        System.out.println("String:::"+input);
        System.out.println("Reverse using builder and traversal::"+builder);
    }
}
