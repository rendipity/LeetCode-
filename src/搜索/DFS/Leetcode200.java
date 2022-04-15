package 搜索.DFS;

public class Leetcode200 {
    public int numIslands(char[][] grid) {
        int IslandNum=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]=='1') {
                    grid[i][j]='0';
                    DfsSearch(grid, i, j);
                    IslandNum++;
                }
            }
        }
        return IslandNum;
    }
    private void DfsSearch(char [][]grid,int i,int j){
        if (i-1>=0&&grid[i-1][j]=='1') {
            grid[i-1][j]='0';
            DfsSearch(grid, i - 1, j);
        }
        if (i+1<grid.length&&grid[i+1][j]=='1') {
            grid[i+1][j]='0';
            DfsSearch(grid, i + 1, j);
        }
        if (j-1>=0&&grid[i][j-1]=='1') {
            grid[i][j-1]='0';
            DfsSearch(grid, i, j - 1);
        }
        if (j+1< grid[i].length&&grid[i][j+1]=='1') {
            grid[i][j+1]='0';
            DfsSearch(grid, i, j + 1);
        }
    }
}
