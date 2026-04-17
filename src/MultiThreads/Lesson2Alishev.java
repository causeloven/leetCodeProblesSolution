package MultiThreads;

public class Lesson2Alishev {
    public static void main(String[] args) {
           int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
           int target = 10;

           BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.indexSearch(nums, target));
    }
}

class BinarySearch{
    public int indexSearch(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;
        int mid = -1;
        int indexOfOperation = 0;
        while(left < right){
            mid = left + (right - left)/2 + 1;

            if(nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if(nums[mid] > target){
                right = mid - 1;
            }
            indexOfOperation++;
            System.out.println("Index: " + indexOfOperation + " left: " + left + " right: " + right);
        }
        return mid;
    }

}

