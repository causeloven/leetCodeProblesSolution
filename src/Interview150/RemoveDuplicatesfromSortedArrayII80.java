package Interview150;

public class RemoveDuplicatesfromSortedArrayII80 {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 2; i < nums.length; i++){
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
