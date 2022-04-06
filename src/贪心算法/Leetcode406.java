package 贪心算法;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode406 {
    public static void main(String[] args) {
            int [][] people={{6,0},{5,2},{5,1},{5,0},{4,0},{3,2},{2,2},{1,4}};
            Leetcode406 l=new Leetcode406();
            l.reconstructQueue(people);
            System.out.println(Arrays.deepToString(people));
    }
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]){
                    return o2[1]-o1[1];
                }else{
                    return o1[0]-o2[0];
                }
            }
        });
        System.out.println(Arrays.deepToString(people));
        for (int i = people.length-1; i>=0 ; --i) {
            if (people[i][1]>0){
                int[] t=new int[1];
                t=people[i];
                for (int j =0; j<t[1] ; j++) {
                    people[i+j]=people[i+j+1];
                }
                people[i+t[1]]=t;
            }
        }
        return people;
    }
}
