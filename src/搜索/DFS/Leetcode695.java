package 搜索.DFS;

public class Leetcode695 {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]==1) {
                    grid[i][j]=0;
                    int area=DfsSearch(grid, i, j);
                    if (area>maxArea)
                        maxArea=area;
                }
            }
        }
        return maxArea;
    }
    private int DfsSearch(int [][]grid,int i,int j){
        int area=1;
        if (i-1>=0&&grid[i-1][j]==1) {
            grid[i-1][j]=0;
            area += DfsSearch(grid, i - 1, j);
        }
        if (i+1<grid.length&&grid[i+1][j]==1) {
            grid[i+1][j]=0;
            area += DfsSearch(grid, i + 1, j);
        }
        if (j-1>=0&&grid[i][j-1]==1) {
            grid[i][j-1]=0;
            area += DfsSearch(grid, i, j - 1);
        }
        if (j+1< grid[i].length&&grid[i][j+1]==1) {
            grid[i][j+1]=0;
            area += DfsSearch(grid, i, j + 1);
        }
        return area;
    }

    public static void main(String[] args) {
        int[][] grid = {
                            {0,0,1,0,0,0,0,1,0,0,0,0,0},
                            {0,0,0,0,0,0,0,1,1,1,0,0,0},
                            {0,1,1,0,1,0,0,0,0,0,0,0,0},
                            {0,1,0,0,1,1,0,0,1,0,1,0,0},
                            {0,1,0,0,1,1,0,0,1,1,1,0,0},
                            {0,0,0,0,0,0,0,0,0,0,1,0,0},
                            {0,0,0,0,0,0,0,1,1,1,0,0,0},
                            {0,0,0,0,0,0,0,1,1,0,0,0,0}
                        };
        System.out.println(new Leetcode695().maxAreaOfIsland(grid));
    }
}
