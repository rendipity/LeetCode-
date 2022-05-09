package 搜索.BackTracking.组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode40 {
    int[] candidates;
    int target;
    int[] visited;
    List<List<Integer>> list=new ArrayList<>();
    List<Integer> list1=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.target=target;
        Arrays.sort(candidates);
        visited=new int[candidates.length];
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
                else if (i>0&&candidates[i]==candidates[i-1]&&visited[i-1]!=1)
                    continue;
                list1.add(candidates[i]);
                visited[i]=1;
                combination(sum+candidates[i],i+1);
                list1.remove(list1.size()-1);
                visited[i]=0;
            }
        }
    }
    public static void main(String[] args) {
        int[] candidations={10,1,2,7,6,1,5};
        int target=8;
        Leetcode40 l=new Leetcode40();
        System.out.println(l.combinationSum2(candidations, target));
    }
}
