package 搜索.BackTracking.组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode39 {
    int[] candidates;
    int target;
    List<List<Integer>> list=new ArrayList<>();
    List<Integer> list1=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target=target;
        Arrays.sort(candidates);
        this.candidates=candidates;
        combination(0,0);
        return list;
    }
    private void combination(int sum,int begin){
        if (sum==target) {
            List<Integer> newList= Arrays.asList(new Integer[list1.size()]);
            Collections.copy(newList,list1);
            list.add(newList);
        }
        else if (sum<target){
            for (int i = begin; i < candidates.length; i++) {
                if (sum+candidates[i]>target)
                    return ;
                list1.add(candidates[i]);
                combination(sum+candidates[i],i);
                list1.remove(list1.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] candidations={2,3,6,7};
        int target=7;
        Leetcode39 l=new Leetcode39();
        System.out.println(l.combinationSum(candidations, target));
    }
}
