package Leetcode.june;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII119 {
    public List<Integer> getRow(int rowIndex) {

        long[] row = new long[rowIndex+1];
        row[0] = 1;

        for(int i = 1; i < rowIndex+1; i++){
            row[i] = (long) row[i-1] * (rowIndex - i + 1) / i;
        }

        List<Integer> result = new ArrayList<>();

        for(long a : row){
            result.add((int)a);
        }

        return result;
    }
}
