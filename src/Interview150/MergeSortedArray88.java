package Interview150;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexM = m - 1;
        int indexN = n - 1;
        int point = m + n - 1;

        while(indexN >=0 ){
            if(indexM >= 0 && nums1[indexM] > nums2[indexN]){
                nums1[point] = nums1[indexM];
                indexM--;
            }else {
                nums1[point] = nums2[indexN];
                indexN--;
            }
            point--;
        }
    }
}


