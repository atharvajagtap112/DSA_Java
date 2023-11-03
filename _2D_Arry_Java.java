package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class _2D_Arry_Java {
    public static void main(String[] args) {
//Scanner in=new Scanner(System.in);
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = in.next();
//        }
//
//        System.out.println(Arrays.toString(str));

        //        int[][]arr={ {4,5,5},
//                     {6,54,8},
//                     {4,4,4}
//                                 };
//        for (int row=0;row< arr.length;row++){
//            for (int col=0;col<arr[row].length;col++){
//                System.out.print( arr[row][col]+" ");
//            }
//            System.out.println();
//        }
////OR
//        for (int[]a:arr){
//            System.out.println(Arrays.toString(a));
//        }
        ////2D Array
        Scanner sc =new Scanner(System.in);
        int[][]arr=new int[3][3];
       // System.out.println(arr.length);
        for (int row=0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
               arr[row][col]=sc.nextInt();
            }

        }
///output
        for (int row=0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                System.out.print( arr[row][col]+" ");
            }
            System.out.println();
        }
        //Output
//        for (int row=0;row< arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
for (int[]a:arr){
    System.out.println(Arrays.toString(a));
}
    }

}