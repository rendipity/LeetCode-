package 贪心算法;

public class Leetcode665 {
    public boolean checkPossibility(int[] nums) {
        int sum=0;
        for (int i =0; i<nums.length-1&&sum<2 ; ++i) {
            if (nums[i]>nums[i+1]){
                if (i==0||nums[i-1]<nums[i+1]){
                    nums[i]=nums[i+1];
                }
                else if(nums[i-1]>nums[i+1]){
                    nums[i+1]=nums[i];
                }
                else{
                    if (nums[i]>nums[i-1])
                        nums[i]=nums[i-1];
                    else
                        nums[i+1]=nums[i];
                }
                sum++;
            }
        }
        return sum<2;
    }

    public static void main(String[] args) {
        int[] nums={1,4,1,2};
        //int[] nums={3,4,2,3};
        //int [] nums={5,7,1,8};//,{4,2,3};
        Leetcode665 l=new Leetcode665();
        System.out.println(l.checkPossibility(nums));
    }
}
