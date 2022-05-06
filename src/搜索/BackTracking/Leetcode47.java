package 搜索.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode47 {
    List<List<Integer>> list=new ArrayList<>();
    List<Integer> list1=new ArrayList<>();
    int[] nums;
    int[] sorted;
    public List<List<Integer>> permuteUnique(int[] nums) {
        this.nums=nums;
        sorted=new int[nums.length];
        allSort(0);
        return list;
    }
    private void allSort(int i){
        if (i==nums.length){
            List<Integer> addList= Arrays.asList(new Integer[list1.size()]);
            Collections.copy(addList,list1);
            list.add(addList);
            return ;
        }
        for (int j = 0; j < nums.length; j++) {
            if (sorted[j]!=1) {
                sorted[j] = 1;
                list1.add(nums[j]);
                allSort(i+1);
                list1.remove(i);
                sorted[j]=0;
            }
        }
    }

    public static void main(String[] args) {
        int [] nums={1,2,1};
        Leetcode47 l =new Leetcode47();
        System.out.println(l.permuteUnique(nums));
    }
}
