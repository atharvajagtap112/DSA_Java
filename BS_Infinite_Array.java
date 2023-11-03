package dsa;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class BS_Infinite_Array {
    public static void main(String[] args) {
        int []arr={3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target=10;
        System.out.println(ans(arr,target));
    }
   static int ans(int[] arr,int target){
       // first find the range
       // first start with a box of size 2
        int start=0;
        int end=1;
        while (target>arr[end]){
            int temp=end+1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end=end+(end-start+1)*2;
            start=temp;

        }
        return BinarySearch11(arr,target,start,end);
    }
    static int BinarySearch11(int[]arr,int target,int start,int end){

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
