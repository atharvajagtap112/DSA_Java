package dsa;

import java.util.Arrays;

public class Swaping_An_Array {
    public static void main(String[] args) {
        int[] arr={1 ,5,4,7,9,6};
        Swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
    static void Swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
       arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
