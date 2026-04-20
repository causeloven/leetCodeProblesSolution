package Interview150;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
