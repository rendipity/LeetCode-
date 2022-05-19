package 动态规划.数组区间;

public class Leetcode413_arithmetic_progression {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length<3)
            return 0;
        int begin=0,d=nums[1]-nums[0],number=0;
        for (int i = 2; i <nums.length; i++) {
            if (nums[i]-nums[i-1]==d)
                number+=(i-begin-1);
            else{
                begin=i-1;
                d=nums[i]-nums[i-1];
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,3,2,1};
        Leetcode413_arithmetic_progression l =new Leetcode413_arithmetic_progression();
        System.out.println(l.numberOfArithmeticSlices(nums));
    }
}
