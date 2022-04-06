package 贪心算法;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode435{
    public int eraseOverlapIntervals(int[][] intervals) {
        int sum=0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
               return o1[1]-o2[1];
            }
        });
        int[] value=new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            value[i]=1;
        }
        for (int i = 1; i <intervals.length ; i++) {
            if(intervals[i][0]<intervals[last(i,value)][1]){
                value[i]=0;
                sum++;
            }
        }
        return sum;
    }
    public int last(int i,int []value){
        for (int j = i-1; j >=0 ; j--) {
            if(value[j]!=0)
                return j;
        }
        return 0;
    }
    public static void main(String[] args) {
        Leetcode435 l=new Leetcode435();
        int [][] array={ {1,2}, {2,3}, {3,4}, {1,3} };
        System.out.println(l.eraseOverlapIntervals(array));
    }
}
