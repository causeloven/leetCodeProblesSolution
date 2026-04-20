package Interview150;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for(int i = 1; i < nums.length; i++){
            if(!(nums[i] == nums[i-1])){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
