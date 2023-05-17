package TestLearn.problemPractice;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr= new String[]{"flower","flow","floor"};
        System.out.println(commonPrefix(arr));

    }
    private static String commonPrefix(String[] arr){
        StringBuilder sb= new StringBuilder();
        if(arr.length==0){
           return sb.toString();
        }
        //find string with minimum length in the array
        int min=arr[0].length();
        for(int i=1;i< arr.length;i++){
            if(min>arr[i].length()){
                min=arr[i].length();
            }
        }

        //outer loop for each character-from 0 to min length
        for(int i=0;i<min;i++){
            char c = arr[0].charAt(i);
            for(String s:arr){//check if the character is present in each string// if not then return, else append the char after for loop
                if(s.charAt(i)!=c){
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
