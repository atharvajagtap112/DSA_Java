package dsa;

public class Binary_Search_1 {
    public static void main(String[] args) {
int[] arr={-14,-10,-4,-2,1,3,5,6,8,10,15,18,22,28,33,39,46};
int target=3;
        System.out.println(BinarySearch(arr,target));
    }
    static int BinarySearch(int[]arr,int target){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            //int mid=start+end/2; // might be possible that (start + end) exceeds the range of int in java
            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]) {
                start=1+mid;

            }
            else {
                return mid;
            }
        }
    return -1;
    }

}
