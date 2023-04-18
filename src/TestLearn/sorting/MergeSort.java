package TestLearn.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]=new int[]{20,30,100,10,0};
        for(int index=0;index< arr.length;index++){
            System.out.print(" "+arr[index]+" ");
        }

        mergeSort(arr,0,arr.length-1);

        System.out.println("**********");
        for(int index=0;index< arr.length;index++){
            System.out.print(" "+arr[index]+" ");
        }
    }

    public static void mergeSort(int arr[], int l,int r){

        if(l<r){
            int m=(l+r)/2;
            //divide steps
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            //merge step
            merge(arr,l,m,r);
        }
    }

    public static void merge(int arr[],int p, int q, int r){
        int n1=q-p+1; int n2=r-q;
        int L[]= new int[n1];
        int M[]= new int[n2];
        //copy arr elms into sub- arrays
        for(int i=0;i<n1;i++){
            L[i]=arr[p+i];
        }
        for(int j=0;j<n2;j++){
            M[j]=arr[q+1+j];
        }
        int i=0;int j=0;//pointer for subarray
        int k=p;//pointer for sorted array arr

        //loop to mve the end of subarrays
        while(i<n1 && j<n2){
            if(L[i]<=M[j]){// compare elms of sub array and copy to sorted arr
                arr[k]=L[i];
                i++;
            }else{
                arr[k]=M[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=L[i];
            k++;i++;
        }
        while(j<n2){
            arr[k]=M[j];
            k++;j++;
        }
    }
}
