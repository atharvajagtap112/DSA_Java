package dsa;

import java.util.Arrays;

public class BS_FirstAndLastPosition {
    public static void main(String[] args) {
//int []ans={1,5,6,6,6,6,3};
//int target=6;
       // System.out.println(Arrays.toString(SearchRange(ans,target)));
    }
    public int[] searchRange(int nums[],int target){
        int[] ans= {-1,-1};
ans[0]=Search(nums,target,true);
ans[1]=Search(nums,target,false);
        return ans;
    }
    static int Search(int[]nums,int target,boolean findfirstindex){
        int ans=-1;
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            //int mid=start+end/2; // might be possible that (start + end) exceeds the range of int in java
            int mid=start+(end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            }
            else if (target>nums[mid]) {
                start=1+mid;

            }
            else {
              ans=mid;
                if (findfirstindex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
