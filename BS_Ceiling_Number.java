package dsa;

public class BS_Ceiling_Number {
    public static void main(String[] args) {

     int[] arr = {2, 3, 5, 9, 14, 16, 18};
    int target = 15;
    int ans=Ceiling(arr,target);
        System.out.println(ans);
    }
    // return the index of smallest no >= target
    static int Ceiling(int[]arr,int target){
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
        return start;
    }
}
