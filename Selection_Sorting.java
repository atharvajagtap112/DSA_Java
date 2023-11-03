package dsa;

import java.util.Arrays;

public class Selection_Sorting {
    public static void main(String[] args) {
        int[] arr = {5,555, 4, 1, 2};
        selction(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selction(int[]arr){
        // find the max item in the remaining array and swap with correct index
        for (int i=0;i< arr.length;i++){
int last= arr.length-i-1;
int max=getMaxIndex(arr,0,last);
       Swap(arr,max,last);
        }

    }
   static void Swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
   }
    static int getMaxIndex(int[] arr, int start, int end){
       int max=start;
        for (int i=start;i<end;i++){
        if (arr[max]<arr[i]){
            max=i;
        }
        }
        return max;
    }
}
