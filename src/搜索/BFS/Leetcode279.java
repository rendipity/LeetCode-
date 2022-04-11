package 搜索.BFS;

import java.util.ArrayDeque;
import java.util.Queue;

public class Leetcode279 {
    //BFS
    /* public int numSquares(int n) {
        Queue<int[]> queue=new ArrayDeque<>();
        queue.add(new int[]{0,0});
        while(!queue.isEmpty()){
            int [] number=queue.remove();
            for (int i = 1; i*i<=n ; i++) {
                if (number[0]+i*i>n)
                    break;
                else if (number[0]+i*i==n)
                    return number[1]+1;
                else{
                    queue.add(new int[]{number[0]+i*i,number[1]+1});
                }
            }
        }
        return -1;
    }*/
    //动态规划
    public int numSquares(int n) {
        int []min =new int[n+1];
        for (int i = 1; i <= n; i++) {
            min[i]=i;
            for (int j = 1; i-j*j>=0 ; j++) {
                min[i]=Math.min(min[i],min[i-j*j]+1);
            }
        }
        return min[n];
    }

    public static void main(String[] args) {
        Leetcode279 l=new Leetcode279();
        int n=121;
        System.out.println(n+": "+l.numSquares(n));
    }
}
