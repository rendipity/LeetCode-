package 搜索.DFS;

public class Leetcode547 {
    public int findCircleNum(int[][] isConnected) {
        int numOfCircle=0;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[i][i]==0)
                continue;
            numOfCircle++;
            isConnected[i][i]=0;
            for (int j = i+1; j < isConnected.length ; j++) {
                if (isConnected[i][j]==1&&isConnected[j][j]==1) {
                    isConnected[j][j]=0;
                    mended(j, isConnected);
                }
            }
        }
        return numOfCircle;
    }
    void mended(int j,int[][] isConnected){
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[j][i]==1&&isConnected[i][i]==1) {
                isConnected[i][i]=0;
                mended(i, isConnected);
            }
        }
    }
}
