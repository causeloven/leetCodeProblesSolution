package Leetcode.TwoPointers;

public class MoveZeroes283{
    public void moveZeroes(int[] nums) {
        int insertPas = 0;

        for(int i =0; i < nums.length; i++){
            if(nums[i] == 0){
                nums[insertPas] = nums[i];
                insertPas++;
            }
        }

        while(insertPas < nums.length){
            nums[insertPas] = 0;
            insertPas++;
        }

    }
}


