package 动态规划.斐波拉契数列;

public class Leetcode198_houseRobber_I {
    public int rob(int[] nums) {
        if (nums.length==1)
            return nums[0];
        int[] maxMoney=new int[nums.length];
        maxMoney[0]=nums[0];
        maxMoney[1]= Math.max(nums[0], nums[1]);
        for (int i = 2; i <nums.length ; i++) {
            maxMoney[i]=Math.max(nums[i]+maxMoney[i-2],maxMoney[i-1]);
        }
        return maxMoney[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums={0};
        Leetcode198_houseRobber_I l=new Leetcode198_houseRobber_I();
        System.out.println(l.rob(nums));
    }
}
