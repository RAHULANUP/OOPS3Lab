package SortingSearching;

public class binarysearch {
    public void partition(int arr[],int low,int high){
        if(low<high){
            int pivotindex = high;
            int storeindex = low;
            for(int j=low;j<high;j++){
                if(arr[j]<arr[pivotindex]){
                    int temp = arr[j];
                    arr[j]=arr[storeindex];
                    arr[storeindex]=temp;
                    storeindex++;
                }
                int temp = arr[pivotindex];
                arr[pivotindex]=arr[storeindex];
                arr[storeindex]=temp;
                pivotindex=storeindex;
                partition(arr,low,pivotindex-1);
                partition(arr,pivotindex+1,high);
                }
        }
        
    }
    
    public void quik(int arr[]){
        partition(arr,0,arr.length-1);
    }

    static int binarysrh(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;

            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        int arr[]={1,3,4,2,6};
        binarysearch b = new binarysearch();
        b.quik(arr);
        int index = binarysrh(arr,3);
        if(index==-1){
            System.out.println("ELEMENT NOT FOUND ");
        }        
        else{
            System.out.println("ELEMENT IS FOUND AT INDEX : "+index);
        }
    }    
}
