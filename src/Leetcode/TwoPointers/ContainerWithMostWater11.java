package Leetcode.TwoPointers;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int maxV = Integer.MIN_VALUE;

        int left = 0;
        int right = height.length - 1;

        while(left < right){
            int v = (right - left) * Math.min(height[left], height[right]);

            if(v > maxV){
                maxV = v;
            }


            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }

        return  maxV;
    }
}
