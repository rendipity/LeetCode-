package 搜索.BackTracking.组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode76 {
    List<List<Integer>> list =new ArrayList<>();
    List<Integer> list1 =new ArrayList<>();
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums=nums;
        list.add(new ArrayList<>());
        subset(0);
        return list;
    }
    private void subset(int depth){
        for (int i = depth; i < nums.length ; i++) {
            list1.add(nums[i]);
            List<Integer> newList= Arrays.asList(new Integer[list1.size()]);
            Collections.copy(newList,list1);
            list.add(newList);
            subset(i+1);
            list1.remove(list1.size()-1);
        }
    }

    public static void main(String[] args) {
        Leetcode76 l =new Leetcode76();
        int [] nums={1,2,3};
        System.out.println(l.subsets(nums));
    }
}
