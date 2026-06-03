package Leetcode.june;

public class EqualSumGridPartitionI3546 {
    public boolean canPartitionGrid(int[][] grid) {
        long total = totalSum(grid);
        if(total % 2 != 0){
            return false;
        }

        total = total/2;

        long sumTop = 0;

        for(int i = 0; i < grid.length - 1; i++){
            sumTop += sumRow(grid, i);
            if(sumTop == total){
                return true;
            }
        }

        long sumLeft = 0;
        for(int i = 0; i < grid[0].length - 1; i++){
            sumLeft += sumColumn(grid, i);
            if(sumLeft == total){
                return true;
            }
        }

        return false;
    }

    public long totalSum(int[][] grid){
        long total = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length;j++){
                total += grid[i][j];
            }
        }
        return total;
    }

    public long sumRow(int[][] grid, int indexRow){
        long sumRow = 0;
        for(int i = 0; i < grid[indexRow].length;i++){
            sumRow += grid[indexRow][i];
        }
        return sumRow;
    }

    public long sumColumn(int[][] grid, int indexColumn){
        long sumColumn = 0;
        for(int i = 0; i < grid.length; i++){
            sumColumn += grid[i][indexColumn];
        }
        return sumColumn;
    }
}
