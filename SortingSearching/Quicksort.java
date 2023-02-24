package SortingSearching;
import java.util.*;
import java.io.*;
public class Quicksort {
    public void partition(String arr[],int low,int high){
        if(low<high){
            int pivotIndex = high;
            int storeIndex = low;
            for(int j=low;j<high;j++){
                if(arr[j].compareTo(arr[pivotIndex])<0){
                    String temp = arr[j];
                    arr[j] = arr[storeIndex];
                    arr[storeIndex]=temp;
                    storeIndex++;
                }
                
            }
            String temp = arr[pivotIndex];
            arr[pivotIndex]=arr[storeIndex];
            arr[storeIndex]=temp;
            pivotIndex=storeIndex;
            partition(arr,low,pivotIndex-1);
            partition(arr,pivotIndex+1,high);
        }
    }
    public void quicksort(String arr[]){
        partition(arr,0,arr.length-1);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF NAMES : ");
        int n = s.nextInt();
        System.out.println("ENTER THE NAMES : ");
        String names[]=new String[n];
        if(s.hasNextLine()){
            s.nextLine();
        }
        for(int i=0;i<n;i++){
            names[i]=s.nextLine();

        }
        Quicksort q = new Quicksort();
        q.quicksort(names);
        System.out.println("SORTED ARRAY OF NAMES : ");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }        
}
