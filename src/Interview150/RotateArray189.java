package Interview150;

public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        rot(0,nums.length-1, nums);
        rot(0, k-1, nums);
        rot(k, nums.length-1, nums );

    }

    private void rot(int start, int end, int[] nums){
        int temp = 0;
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

}