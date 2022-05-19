package 动态规划.分割整数;


public class Leetcode279_Perfect_square {
    public int numSquares(int n) {
        int[] minimumSumIsN =new int[n+1];
        for (int i = 1; i <=n ; i++) {
            minimumSumIsN[i]=i;
            for (int j = 1; i-j*j>=0 ; j++) {
                minimumSumIsN[i]=Math.min(minimumSumIsN[i],minimumSumIsN[i-j*j]+1);
            }
        }
        return minimumSumIsN[n];
    }

    public static void main(String[] args) {
        Leetcode279_Perfect_square l = new Leetcode279_Perfect_square();
        System.out.println(l.numSquares(9));
    }
}
