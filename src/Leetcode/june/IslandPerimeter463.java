package Leetcode.june;

public class IslandPerimeter463 {
    public int islandPerimeter(int[][] grid) {

        int perimetr = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    perimetr += 4;

                    if(i > 0 && grid[i-1][j] == 1) perimetr--;
                    if(i < grid.length-1 && grid[i+1][j] == 1) perimetr--;
                    if(j > 0 && grid[i][j-1]==1) perimetr--;
                    if(j < grid[i].length-1 && grid[i][j+1]==1) perimetr--;

                }
            }
        }

        return perimetr;
    }
}
