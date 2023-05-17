package TestLearn.problemPractice;

public class ReverseNum {
    public static void main(String[] args) {
        //System.out.println("Reverse NUmber::"+reverse(123));
        int height[]=new int[]{1,2,3,4,5};
        maxArea(height);
    }

    public static int maxArea(int[] height) {
        int maxArea=0;
        int length=height.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                int len=Math.min(height[i],height[j]);
                System.out.println("Length:"+len);
                int width=j-i;
                System.out.println("Width:"+width);
                int area=len*width;
                System.out.println("area:"+area);
                maxArea=Math.max(maxArea,area);
            }
        }
        System.out.println("MAxArea:"+maxArea);
        return maxArea;
    }
    public static int reverse(int x) {
        if(x>-9 && x<9){
            return x;
        }
        int sign=x<0?-1:1;
        int num=Math.abs(x);

        int reverseNum=0;
        while(num>0){
            int digit=num%10;
            System.out.println("Digit::"+digit);
            reverseNum=reverseNum*10+digit;
            System.out.println("Reverse::"+reverseNum);
            num=num/10;
            System.out.println("Number::"+num);
        }
        if (reverseNum > Integer.MAX_VALUE) {
            return 0;
        }
        return reverseNum*sign;
    }
}
