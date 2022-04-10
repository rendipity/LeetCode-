package 搜索.BFS;

import java.util.ArrayDeque;
import java.util.Queue;

public class Leetcode1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int [][] dir={{1,1},{1,0},{0,1},{1,-1},{-1,1},{0,-1},{-1,0},{-1,-1}};
        Queue<int []> queue=new ArrayDeque<>();
        if (grid[0][0]!=0||grid[grid.length-1][grid.length-1]==1)
            return -1;
        if (grid.length==1)
            return 1;
        queue.add(new int[]{0,0,1});
        grid[0][0]=1;
        while(!queue.isEmpty()){
            int[] now=queue.remove();
            for (int i = 0; i < dir.length; i++) {
                int ni=now[0]+dir[i][0];
                int nj=now[1]+dir[i][1];
                if (ni>=0&&ni< grid.length&&nj>=0&&nj< grid.length&&grid[ni][nj]==0) {
                    if (now[0]+dir[i][0]==grid.length-1&&now[1]+dir[i][1]== grid.length-1)
                        return now[2]+1;
                    else {
                        grid[now[0]+dir[i][0]][now[1]+ dir[i][1]]=1;
                        queue.add(new int[]{now[0] + dir[i][0], now[1]+ dir[i][1], now[2] + 1});
                    }
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int [][] grip={{0,0,0},{0,1,0},{0,0,0}};
        Leetcode1091 l=new Leetcode1091();
        System.out.println(l.shortestPathBinaryMatrix(grip));
    }
}
