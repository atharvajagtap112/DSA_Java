package dsa;

import java.util.Arrays;

public class BS_2D_Array_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(Search(arr,5)));
    }


    static int[] BinarySearch(int[][] matrix, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cstart++;
            } else {
                cend--;
            }

        }
        return new int[]{-1, -1};
    }

    static int[] Search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (cols == 0) {
            return new int[]{-1, -1};
        }
        if (rows == 1) {
            return BinarySearch(matrix, 0, 0, cols - 1, target);


        }
int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        while (rStart<=(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;

            if (matrix[mid][cMid]==target){
return new int[]{mid,cMid};
            }
            if (matrix[mid][cMid]<target){
                rStart=mid;

            }
            else {
                rEnd=mid;
            }
        }
        if (target<=matrix[rStart][cMid-1]){
            return BinarySearch(matrix,rStart,0,cMid-1,target);
        }
        if (target>=matrix[rStart][cMid+1]){
            return BinarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        if (target<=matrix[rStart+1][cMid-1]){
            return BinarySearch(matrix,rStart+1,0,cMid-1,target);}
        if (target>=matrix[rStart][cMid+1]){
            return BinarySearch(matrix,rStart+1,0,cMid+1,target);
        }

 return new int[]{-1,-1};
    }
}

