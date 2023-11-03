package dsa;
// https://leetcode.com/problems/split-array-largest-sum/
public class BS_Split_Array_Largest_Sum {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums,int k){
        int start=0;
        int end=0;
        for (int i=0;i<nums.length;i++){
            // in the end of the loop this will contain the max item of the array
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        //Binary Search
        while (start<end){
            int mid=start+(end-start)/2;
            // calculate how many pieces you can divide this in with this max sum
          int sum=0;
          int pieces=1;
          for (int num:nums) {
              // you cannot add this in this subarray, make new one
              // say you add this num in new subarray, then sum = num
              if (sum + num > mid) {
                  sum = num;
                  pieces++;
              } else {
                  sum += num;
              }
          }
              if (pieces>k){
                  start=mid+1;
              }
              else {
                  end=mid;
              }
          }


return end;//Or Start  here start == end

    }
}
