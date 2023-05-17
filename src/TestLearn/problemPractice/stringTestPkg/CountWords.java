package TestLearn.problemPractice.stringTestPkg;

public class CountWords {
    public static void main(String[] args) {
        String input= "This is a input sentence";
        String[] array = input.split("\\s");
        System.out.println("Total words in input::"+array.length);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        int whitespaceCount=0;
        for(int i=0;i<input.length()-1;i++){
            if(Character.isWhitespace(input.charAt(i))){
                whitespaceCount++;
            }
        }
        System.out.println("Total whitespace::"+whitespaceCount);


    }
}
