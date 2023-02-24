package SortingSearching;
import java.util.*;
public class quik {
    public void partition(int arr[],int low,int high){
        if(low<high){
            int pivotindex = high;
            int storeindex = low;
            for(int j = low;j<high;j++){
                if(arr[j]<arr[pivotindex]){
                    int temp = arr[j];
                    arr[j] = arr[storeindex];
                    arr[storeindex]= temp;
                    storeindex++;
                }
            }
            int temp = arr[pivotindex];
            arr[pivotindex]=  arr[storeindex];
            arr[storeindex]= temp;
            pivotindex=storeindex;
            partition(arr,low,pivotindex-1);
            partition(arr,pivotindex+1,high);
        }


    }


    public void quiksort(int arr[]){
        partition(arr,0,arr.length - 1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of numbers  ");
        int n = s.nextInt();
        System.out.println("Enter numbers : ");
        int a[]= new int[n];
        for(int i =0;i<n;i++){
            a[i]= s.nextInt();

        }
        quik q = new quik();
        q.quiksort(a);
        System.out.println("SORTED Numbers are : ");
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]+" ");
        }

    }

}

