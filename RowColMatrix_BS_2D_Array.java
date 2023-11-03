package dsa;

import java.util.Arrays;

public class RowColMatrix_BS_2D_Array {
    public static void main(String[] args) {
int [][]Matrix={
        {10,20,30,40},
        {11,25,35,45},
        {28,29,37,49},
        {33,34,38,50}
};
        System.out.println(Arrays.toString(Matrix(Matrix,50)));
    }
    static int[] Matrix(int[][] Matrix,int target){
        int r=0;
        int c=Matrix.length-1;
        while (r<Matrix.length&&c>=0){
            if (Matrix[r][c]==target){
                return new int[]{r,c};
            }
            if (Matrix[r][c]<target){
                r++;
            }
            else {
                c--;
            }

        }
return new int[]{0,0};
    }
}
