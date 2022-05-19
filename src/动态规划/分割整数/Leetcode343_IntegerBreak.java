package 动态规划.分割整数;

public class Leetcode343_IntegerBreak {
    public int integerBreak(int n) {
        if (n<=3)
            return n-1;
        int num3=n/3;
        int remainder=n%3;
        int maxProduct=1;
        if (remainder==1)
        {
            num3-=1;
            remainder=4;
        }
        for (int i = 0; i < num3; i++) {
            maxProduct*=3;
        }
        return remainder==0?maxProduct:maxProduct*remainder;
    }

    public static void main(String[] args) {
        Leetcode343_IntegerBreak l = new Leetcode343_IntegerBreak();
        System.out.println(l.integerBreak(5));
    }
}
