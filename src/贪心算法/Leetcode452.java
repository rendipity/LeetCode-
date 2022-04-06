package 贪心算法;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]<o2[1])
                    return -1;
                else if(o1[1]==o2[1])
                    return 0;
                else
                    return 1;
            }
        });
        int nums=0;
        int [] a=new int[points.length];
        Arrays.fill(a, 1);
        for (int i = 1; i < points.length; i++) {
            if(points[i][0]<=points[last(i,a)][1]){
                nums++;
                a[i]=0;
            }
        }
        return points.length-nums;
    }
    public int last(int i,int []a){
        for (int j = i-1; j>0 ; j--) {
            if(a[j]>0)
                return j;
        }
        return 0;
    }
    public static void main(String[] args) {
        int a[][]={{-2147483646,-2147483645},{2147483646,2147483647}};
        //int a[][]={{1,2},{2,3},{3,4},{4,5}};
        Leetcode452 l=new Leetcode452();
        System.out.println(l.findMinArrowShots(a));
    }
}
