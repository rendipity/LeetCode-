package 搜索.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode77 {
    List<List<Integer>> list=new ArrayList<>();
    List<Integer> list1=new ArrayList<>();
    int n,k;
    int[] visited;
    public List<List<Integer>> combine(int n, int k) {
        this.visited=new int[n+1];
        this.n=n;
        this.k=k;
        combination(1);
        return list;
    }
    private void combination(int i){
        if (list1.size()==k){
            List<Integer> newList= Arrays.asList(new Integer[list1.size()]);
            Collections.copy(newList,list1);
            list.add(newList);
            return;
        }
        for (int j = i; j <= Math.min(n-k+i,n); j++) {
            if (visited[j]!=1){
                list1.add(j);
                visited[j]=1;
                combination(j+1);
                list1.remove(list1.size()-1);
                visited[j]=0;
            }
        }
    }

    public static void main(String[] args) {
        Leetcode77 l =new Leetcode77();
        System.out.println(l.combine(4, 2));
    }
}
