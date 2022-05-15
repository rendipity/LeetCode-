package 动态规划.矩阵运算;

public class Leetcode62_uniquePath {
    public int uniquePaths(int m, int n) {
        int[][] grip = new int[m][n];
        for (int i = 0; i < m; i++) {
            int j=0;
            for (; j < n; j++) {
                if (i==0||j==0)
                  grip[i][j]=1;
                else
                  grip[i][j]=grip[i-1][j]+grip[i][j-1];
            }
        }
        return grip[m-1][n-1];
    }

    public static void main(String[] args) {
        Leetcode62_uniquePath l =new Leetcode62_uniquePath();
        System.out.println(l.uniquePaths(1, 1));
    }
}
