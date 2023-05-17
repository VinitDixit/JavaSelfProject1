package TestLearn.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]=new int[]{15,20,9,3,33,55};
        for(int index=0;index< arr.length;index++){
            System.out.print(" "+arr[index]+" ");
        }
        insertionSort(arr);

        System.out.println("**********");
        for(int index=0;index< arr.length;index++){
            System.out.print(" "+arr[index]+" ");
        }
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){//move towards left from j till key is smaller than element
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
