package List.ArrayList;

import java.util.*;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();

            if (i == 0) {
                row.add(1);
                triangle.add(row);
                continue;
            }

            List<Integer> prevRow = triangle.get(i - 1);

            row.add(1);

            for(int j = 1; j < i; j++){
                row.add(prevRow.get(j) + prevRow.get(j-1));
            }

            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
}
