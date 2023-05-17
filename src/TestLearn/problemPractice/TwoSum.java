package TestLearn.problemPractice;

/**
 * given array and target number.
 * Find array indexs which add to that number
 * nums = [2,7,11,15], target = 9 output-[0,1] Because nums[0] + nums[1] == 9
 */
public class TwoSum {
    public static void main(String[] args) {
        int arr[]=new int[]{3,2,3};
        int[] indexArr = twoSum(arr, 6);
        System.out.println(" "+indexArr[0]+" "+indexArr[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int size=nums.length;
        int[] arr= new int[2];
        for(int i=0;i<size;i++){
            int num=target-nums[i];
            for(int j=i+1;j<size;j++){
                if(nums[j]==num){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}
