package 动态规划.最长递增子序列;

import java.util.Arrays;

public class LeetCode300_IncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int maxL=1,maxTail=nums[0];
        int[] numsL=new int[nums.length];
        Arrays.fill(numsL,1);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxTail) {
                maxL = maxL + 1;
                maxTail = nums[i];
                numsL[i]=maxL;
            }else{
                for (int j = 0; j < i; j++) {
                    if (nums[i] >nums[j]&&(numsL[j]+1)>numsL[i]){
                        numsL[i] = numsL[j]+1;
                    }
                }
                if (numsL[i]==maxL&&nums[i]<maxTail)
                    maxTail=nums[i];
            }
        }
        return maxL;
    }

    public static void main(String[] args) {
        LeetCode300_IncreasingSubsequence l =new LeetCode300_IncreasingSubsequence();
        int [] nums={10,9,2,5,3,7,101,18};
        System.out.println(l.lengthOfLIS(nums));
    }
}
