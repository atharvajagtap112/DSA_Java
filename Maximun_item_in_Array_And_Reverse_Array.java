package dsa;

import java.util.Arrays;

public class Maximun_item_in_Array_And_Reverse_Array {
    public static void main(String[] args) {
        int[] arr={1 ,5,4,7,9,3,6,1};


//reverse1(arr);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        Swap(arr,0,4);
        System.out.println(max(arr));

        System.out.println(  Max_Val_Range(arr,2,5));
    }
    static void Swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;}
   static void reverse(int[]arr){
        int start=0;
        int end= arr.length-1;
        while (start<end){
            Swap(arr,start,end);
            start++;
            end--;
        }

   }
//    static void reverse1(int[]arr){
//        int start=0;
//        int end= arr.length-1;
//        while (start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;}
//            start++;
//            end--;
//        }


    static int max(int[]arr) {
        int a = arr[0];
//        if (arr[1] > a) {
//            a = arr[1];
//        }
//        if (arr[2] > a) {
//            a = arr[2];
//        }
//        if (arr[3] >a) {
//            a = arr[3];
//        }
        //OR
        for (int i=1;i< arr.length;i++){
            if (arr[i]>a){
                a=arr[i];
            }
        }
      return a;



    }
    static int Max_Val_Range(int[]arr,int index1,int index2){
         int a = arr[index1];

        for (int i=index1;i<= index2;i++){
            if (arr[i]>arr[index1]){
                a=arr[i];
            }
        }
        return a;

    }

    }
