package TestLearn.problemPractice;

import java.util.Stack;

public class ValidString {
    public static void main(String[] args) {
        System.out.println(checkValid(")("));

    }

    public static Boolean checkValid(String s){
        Stack<Character>stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else{
                if(stack.isEmpty() || stack.pop()!=c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
