package dsa;

public class Search_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
int[] nums={4,5,6,7,0,1,2};
int target=6;
        System.out.println(Search(nums,target));
    }

    static int Search(int[]nums,int target){
        int pivot=FindPivot(nums);
        if (pivot==-1){
            return BinarySearch(nums,target,0, nums.length-1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target>=nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }
        return BinarySearch(nums,target,pivot+1,nums.length-1);
    }
    static int FindPivot(int[]arr){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if (start<mid&&arr[mid]<arr[mid-1]){
                return arr[mid-1];
            }
            if (arr[start]>=arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return -1;
    }
    static int BinarySearch(int[]arr,int target,int start,int end){

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
    static int FindPivotInDuplicateArray(int[]arr){

        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if (start<mid&&arr[mid]<arr[mid-1]){
                return arr[mid-1];
            }
            if (arr[start]>=arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }

            if (arr[start]==arr[mid]&&arr[end]==arr[mid]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot

                if (arr[start]>arr[start+1]) {
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if (arr[start]<arr[mid]||(arr[start]==arr[mid]&&arr[mid]<arr[end])){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
