package 动态规划.矩阵运算;

public class Leetcode64_ShortestPath {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            int j = 0;
            for ( ;j < grid[i].length; j++) {
                if (i==0&&j>0)
                    grid[0][j]+=grid[0][j-1];
                else if (i>0&&j==0)
                    grid[i][0]+=grid[i-1][0];
                else if (i>0&&j>0){
                    grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }

    public static void main(String[] args) {
        int[][] grid ={{1,3,1},{1,5,1},{4,2,1}};
        Leetcode64_ShortestPath l =new Leetcode64_ShortestPath();
        System.out.println(l.minPathSum(grid));
    }
}
