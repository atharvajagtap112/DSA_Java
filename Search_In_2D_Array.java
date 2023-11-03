package dsa;

import java.util.Arrays;

public class Search_In_2D_Array {
    public static void main(String[] args) {
      ///Search In 2D Array
        int[][] arr={{ 4,7,6 },
                      { 14,5,8 },
                     { 7,3,9  }};
        int store=14;
        int[] ans=arr(arr,store);
        System.out.println(Arrays.toString(ans));
        //Max num Search In 2D Array
        int max=arr[0][0];
        System.out.println(Maxarr(arr,max));
    }
    static int[] arr(int[][]arr,int store){
        int ans=store;
        int rem=0;

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<i;j++){
                if (ans==arr[i][j]){
                    return new int[]{i, j};


                }
            }

        }
    return new int[]{-1};

    }
///////////////////////////////////////////////////////////////////////////////
    static int Maxarr(int[][]arr,int store){
        int ans=Integer.MIN_VALUE;  // OR int ans=store;


        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (ans<arr[i][j]){
                   ans=arr[i][j];


                }
            }

        }
        return ans;

    }

}
