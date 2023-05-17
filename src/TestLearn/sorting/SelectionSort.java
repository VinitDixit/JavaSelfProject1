package TestLearn.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]=new int[]{20,30,100,10,0};
        for(int index=0;index< arr.length;index++){
            System.out.print(" "+arr[index]+" ");
        }
        selectionSort(arr);

        System.out.println("**********");
        for(int index=0;index< arr.length;index++){
            System.out.print(" "+arr[index]+" ");
        }
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int minIdx=i;
            //find min index for the step
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            //swap iTh element with min ind element
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
    }
}
