package TestLearn.stringTestPkg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        //give pattern which needs to searched
        Pattern pattern=Pattern.compile("[a-z]");
        //Pattern.matcher is used to search for the pattern in input
        Matcher matcher=pattern.matcher("Vinit is going abc!!");

        if(matcher.matches()){
            System.out.println("Match Found::");
        }

        String input="reqtyvfght";
        //[abc] - Find one character from the options between the brackets
        System.out.println(input.matches("[abc]") ? "Match Found::" : "Match Not Found::");

        System.out.println(input.matches("[^abc]") ? "Match Found::" : "Match Not Found::");
    }
}
