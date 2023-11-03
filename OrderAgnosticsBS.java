package dsa;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target=11 ;
        int ans=OrderAgnosticsBS(arr,target);
        System.out.println(ans);
    }
    static int OrderAgnosticsBS(int[]arr,int target){

        int start=0;
        int end= arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while (start<=end){
            //int mid=start+end/2; // might be possible that (start + end) exceeds the range of int in java
            int mid=start+(end-start)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (isAsc){
            if (target<arr[mid]){
                end=mid-1;
            }
            else  {
                start=mid+1;
            }}
            else {
                if (target>arr[mid]){
                    end=mid-1;
                }
                else  {
                    start=mid+1;
                }
            }


        }
        return -1;
    }

}
