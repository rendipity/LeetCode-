package 动态规划.斐波拉契数列;

public class Leetcode70_climbStairs {
    public int climbStairs(int n) {
        int[] dp=new int[50];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Leetcode70_climbStairs l =new Leetcode70_climbStairs();
        System.out.println(l.climbStairs(45));
    }
}
