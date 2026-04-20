package Interview150;

import java.util.HashMap;


public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashSet = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            hashSet.put(num, hashSet.getOrDefault(num, 0)+1);

            if(hashSet.get(num) > nums.length/2){
                return num;
            }
        }
        return -1;
    }
}
