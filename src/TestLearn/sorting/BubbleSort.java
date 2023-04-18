package TestLearn.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]=new int[]{7,5,10,1};
        for(int index=0;index< arr.length;index++){
            System.out.print(" "+arr[index]+" ");
        }
        bubbleSort(arr);

        System.out.println("**********");
        for(int index=0;index< arr.length;index++){
            System.out.print(" "+arr[index]+" ");
        }
    }

    public static void  bubbleSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
