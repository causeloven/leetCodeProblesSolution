package Leetcode.june;

public class RearrangeArrayElementsbySign2149 {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];

        int index = 0;
        for(int i : nums){
            if(i > 0){
                pos[index] = i;
                index++;
            }
        }

        index = 0;
        for(int i : nums){
            if(i < 0){
                neg[index] = i;
                index++;
            }
        }

        int posId = 0, negId = 0;
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i+=2){
            res[i] = pos[posId++];
            res[i+1] = neg[negId++];
        }
        return res;
    }
}
