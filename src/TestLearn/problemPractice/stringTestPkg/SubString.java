package TestLearn.problemPractice.stringTestPkg;

import java.util.*;

public class SubString {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abc"));

    }

    public static int lengthOfLongestSubstring(String s) {
        int len=s.length();
        if(len==1)return 1;

        int max=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                String substring = s.substring(i, j);
                if(checkRepeated(substring)){
                    max=Math.max(max,substring.length());
                }
            }
        }
        return max;
    }
    public static boolean checkRepeated(String str){
        Set<Character> charSet= new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(!charSet.add(str.charAt(i))) return false;
        }
        return true;
    }


    public static boolean checkRepeated1(String str){
        char[] chars=new char[128];
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            chars[c]++;
            if(chars[c]>1)return false;
        }
        return true;
    }
}
