package Leetcode.june;

public class FindPeakElement162 {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid] < nums[mid+1]){
                left = mid + 1;
            }else if(nums[mid] > nums[mid+1]){
                right = mid;
            }

            if(right == left){
                return left;
            }
        }

        return 0;
    }
}
