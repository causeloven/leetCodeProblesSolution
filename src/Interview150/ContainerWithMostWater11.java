package Interview150;




public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxV = Integer.MIN_VALUE;


        while(left < right){
            int V = (right-left) * Math.min(height[left],height[right]);

            if(V > maxV){
                maxV = V;
            }else if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }

        }
        return maxV;
    }
}
