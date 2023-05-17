package TestLearn.problemPractice.stringTestPkg;

public class StringPalindrome {
    public static void main(String[] args) {
        String input = "Vinit";
        //define stringbuilder and reverse the string
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println(sb.toString().equalsIgnoreCase(input) ? "Palindrome" : "Not Palindrome");

        System.out.println(StringPalindrome.checkPalindromeBYPointers(input) ? "Palindrome" : "Not Palindrome");

    }

    //define two pointer i,j- i start from start, j from end and compare char at i,j till i>j
    public static boolean checkPalindromeBYPointers(String input){
        int i=0;
        int j=input.length()-1;
        while(i<=j){
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }

}
