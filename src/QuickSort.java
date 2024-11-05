import java.util.Arrays;

public class QuickSort {
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low<high){
            int pvt = partition(arr,low,high);
            quickSort(arr,low,pvt-1);
            quickSort(arr,pvt+1,high);
        }

    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int pvt = arr[low];
        int p = low;
        int q = high;
        int temp;
        do{
            while(arr[p]<=pvt && p<=high-1){
                p++;
            }
            while(arr[q]>pvt && q>=low+1){
                q--;
            }
            if(p<q){
                temp = arr[p];
                arr[p] = arr[q];
                arr[q] = temp;
            }
        }while(p<q);
        temp = arr[low];
        arr[low] = arr[q];
        arr[q] = temp;
        return q;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,3,9,7};
        quickSort(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
}
