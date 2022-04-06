package 贪心算法;

public class Leetcode55 {
    public boolean canJump(int[] nums) {
            int max=0;
        for (int i = 0; i < nums.length; i++) {
            if(i>max)
                break;
            else if(nums[i]+i>max)
                max=nums[i]+i;
        }
        return max>=nums.length-1;
    }
    public static void main(String[] args) {
        Leetcode55 l=new Leetcode55();
        int[] array={3,2,1,0,4};
        System.out.println(l.canJump(array));
    }
}
