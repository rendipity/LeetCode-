package 搜索.BackTracking.排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
按照没有重复数字的方式进行遍历，但是在添加结果时判断是否存在相同
 */
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
            if (!contains(list,addList))
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
    private boolean contains(List<List<Integer>> list,List<Integer> newList){
        for (int i = 0; i < list.size(); i++) {
            List<Integer> listElemet=list.get(i);
            int j = 0;
            for (; j < listElemet.size(); j++) {
                if (!newList.get(j).equals(listElemet.get(j)))
                    break;
            }
            if (j==listElemet.size())
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums={1,2,1};
        Leetcode47 l =new Leetcode47();
        System.out.println(l.permuteUnique(nums));
    }
}
