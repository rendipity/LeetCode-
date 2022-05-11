package 搜索.BackTracking.组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode90_subsetII {
    List<List<Integer>> list =new ArrayList<>();
    List<Integer> list1 =new ArrayList<>();
    int[] nums;
    int[] visited;
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        this.nums=nums;
        visited=new int[nums.length];
        list.add(new ArrayList<>());
        subset(0);
        return list;
    }
    private void subset(int depth){
        for (int i = depth; i < nums.length ; i++) {
            if (i>0&&nums[i]==nums[i-1]&&visited[i-1]!=1)
                continue;
            list1.add(nums[i]);
            List<Integer> newList= Arrays.asList(new Integer[list1.size()]);
            Collections.copy(newList,list1);
            list.add(newList);
            visited[i]=1;
            subset(i+1);
            visited[i]=0;
            list1.remove(list1.size()-1);
        }
    }

    public static void main(String[] args) {
        Leetcode90_subsetII l = new Leetcode90_subsetII();
        int[] nums={1,2,2};
        System.out.println(l.subsets(nums));
    }
}
