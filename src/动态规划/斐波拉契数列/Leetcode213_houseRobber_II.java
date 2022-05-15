package 动态规划.斐波拉契数列;

public class Leetcode213_houseRobber_II {
    public int rob(int[] nums) {
        if (nums.length==1)
            return nums[0];
        else if ( nums.length==2)
            return Math.max(nums[0],nums[1]);
        return Math.max(robRange(nums,0,nums.length-2),robRange(nums,1,nums.length-1));
    }
    private int robRange(int[] nums,int start,int end){
        int first=nums[start],second=Math.max(nums[start+1],nums[start]);
        int maxMoney;
        for (int i = start+2; i <=end ; i++) {
            maxMoney=Math.max(first+nums[i],second);
            first=second;
            second=maxMoney;
        }
        return second;
    }


    public static void main(String[] args) {
        Leetcode213_houseRobber_II l =new Leetcode213_houseRobber_II();
        int[] nums={1,2,3,1};
        System.out.println(l.rob(nums));
    }
}
