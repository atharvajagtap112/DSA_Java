package dsa;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in Google
public class FindAllMissingNum_CySort {
    public static void main(String[] args) {
int []arr={3,2,3,4,1,2,7,8};


    }
    public List<Integer> AllmissingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i]< nums.length&&nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }

        }
        List<Integer>ans= new ArrayList<>();
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

