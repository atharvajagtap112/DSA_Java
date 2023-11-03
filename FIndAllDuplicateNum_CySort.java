package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FIndAllDuplicateNum_CySort {
    public static void main(String[] args) {
int []nums={1,2,3,4,3,2,7,8};
//findDuplicates(nums);
//        System.out.println(Arrays.toString(nums));
    }
  public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }
        List<Integer>ans=new ArrayList<>();
        for (int index=0;index< nums.length;index++){
            if (nums[index]!=index+1){
                ans.add(index+1);
            }
        }
return ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
