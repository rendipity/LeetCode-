package 动态规划.数组区间;

public class Leetcode303_RangeSum {
    int[] sums;
    public Leetcode303_RangeSum(int[] nums) {
        this.sums=new int[nums.length];
        sums[0]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            sums[i]=nums[i]+sums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        return left==0?sums[right]:sums[right]-sums[left-1];
    }
}
