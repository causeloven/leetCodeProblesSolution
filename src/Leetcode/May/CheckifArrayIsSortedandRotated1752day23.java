package Leetcode.May;

public class CheckifArrayIsSortedandRotated1752day23 {
    public boolean check(int[] nums) {
        int[] num =  new  int[nums.length*2];

        System.arraycopy(nums,0,num,0,nums.length);
        System.arraycopy(nums,0,num,nums.length,nums.length);

        int count = 0;
        int maxCount = Integer.MIN_VALUE;

        for(int i = 0; i < num.length-1; i++){
            if (num[i] <= num[i+1]){
                count++;
                if(maxCount < count){
                    maxCount = count;
                }
            }else {
                count = 0;
            }
        }

        return maxCount >= nums.length-1;
    }
}
