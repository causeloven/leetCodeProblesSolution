package Leetcode.Collections.HashSet;

import java.util.HashSet;

class IntersectionofTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> answer = new HashSet<>();

        for (int num : nums1) {
            n1.add(num);
        }

        for (int num : nums2) {
            if (n1.contains(num)) {
                answer.add(num);
            }
        }

        int[] result = new int[answer.size()];
        int index = 0;
        for (int num : answer) {
            result[index] = num;
            index++;
        }

        return result;
    }
}
