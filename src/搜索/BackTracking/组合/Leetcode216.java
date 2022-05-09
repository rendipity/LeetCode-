package 搜索.BackTracking.组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode216 {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    int n, k;

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.n = n;
        this.k = k;
        combination(1, 0, 0);
        return list;
    }
    private void combination(int i, int indexNum, int sum) {
        if (k - indexNum > 10 - i)
            return;
        else if (sum == n && indexNum == k) {
            List<Integer> newList = Arrays.asList(new Integer[list1.size()]);
            Collections.copy(newList, list1);
            list.add(newList);
            return;
        }
        for (int j = i; j < Math.min(10, 10 - k + i); j++) {
            if(sum+j>n)
                return;
            list1.add(j);
            combination(j + 1, indexNum + 1, sum + j);
            list1.remove(list1.size() - 1);
        }
    }

    public static void main(String[] args) {
        int k=3,n=7;
        Leetcode216 l=new Leetcode216();
        System.out.println(l.combinationSum3(k, n));
    }
}