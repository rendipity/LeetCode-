package 贪心算法;
public class Leetcode53 {
    public int maxSubArray(int[] nums) {
        int msum=-10000;
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
            if (sum>msum)
                msum=sum;
            if (sum<0)
                sum=0;
        }
        return msum;
    }

    public static void main(String[] args) {
        Leetcode53 l=new Leetcode53();
        int []nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println( l.maxSubArray(nums));
    }
}
