package TestLearn.problemPractice.IntervalTest;

import java.util.Arrays;
import java.util.Comparator;

public class TestClass {
    public static void main(String[] args) {
        Interval arr[]=new Interval[4];
        arr[0]=new Interval(1,3);
        arr[1]=new Interval(2,6);//1,6
        arr[2]=new Interval(4,7);//1,7
        arr[3]=new Interval(10,12);
        //intervalMerge(arr);

        int[][] intervals=new int[][]{{1,3},{2,6},{8,10},{15,18}};
        intervalMergeArr(intervals);
    }

    public static void intervalMergeArr(int[][] intervals){
        Comparator<int[]>c2=(int i1[],int i2[])->{
            return i1[0]-i2[0];
        };

        Arrays.sort(intervals,c2);
        int index=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[index][1]>=intervals[i][0]){
                intervals[index][1]= Math.max(intervals[index][1],intervals[i][1]);
            }else{
                index++;
                intervals[index][0]=intervals[i][0];
                intervals[index][1]=intervals[i][1];
            }
        }

        int[][] arr=new int[index+1][2];
        for(int i=0;i<=index;i++){
            System.out.print("[" + intervals[i][0] + "," + intervals[i][1] + "]");
            System.out.println("Value of i::"+i);
            arr[i][0]=intervals[i][0];
            arr[i][1]=intervals[i][1];
        }

    }

    public static void intervalMerge(Interval arr[]){

        Comparator<Interval> c1= (i1,i2)->{
            return i1.start-i2.start;
        };
        Arrays.sort(arr,c1);
        int index = 0;
        for (int i=1; i<arr.length; i++)
        {
            if (arr[index].end >=  arr[i].start) {
                arr[index].end = Math.max(arr[index].end, arr[i].end);
            }
            else {
                index++;
                arr[index] = arr[i];
            }
        }
        for (int i = 0; i <= index; i++)
        {
            System.out.print("[" + arr[i].start + ","
                    + arr[i].end + "]");
        }
    }
}
