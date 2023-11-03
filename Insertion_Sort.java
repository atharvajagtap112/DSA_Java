package dsa;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
int[]arr={5,6,3,8,2,1};
Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insertion(int[]arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j= i+1;j > 0;j--){
                if (arr[j]<arr[j-1]){
                     Swap(arr, j,j-1);
                }
                else {
                    break;
                }

            }
        }
    }
    static void Swap(int []arr,int first,int Second){
        int temp=arr[Second];
        arr[Second]=arr[first];
        arr[first]=temp;
    }
}
