package 搜索.DFS;

import Util.testUtil;

import java.util.ArrayList;
import java.util.List;

public class Leetcode417 {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int[][] sign=new int[heights.length][heights[0].length];
        int[][] sign2=new int[heights.length][heights[0].length];
        for (int i = 0; i <heights[0].length ; i++) {
            if (sign[0][i]==0)
                sign(heights,0,i,sign);
        }
        for (int i=0;i<heights.length;i++){
            if (sign[i][0]==0)
            sign(heights,i,0,sign);
        }
        for (int i = 0; i <heights[0].length ; i++) {
            if (sign2[heights.length-1][i]==0)
                sign(heights,heights.length-1,i,sign2);
        }
        for (int i=0;i<heights.length;i++){
            if (sign2[i][heights[0].length-1]==0)
                sign(heights,i,heights[0].length-1,sign2);
        }
        List<List<Integer>> lists=new ArrayList<>();
        for (int i = 0; i <heights.length ; i++) {
            for (int j = 0; j < heights[i].length; j++) {
                if (sign[i][j]==1&&sign2[i][j]==1) {
                    List<Integer> l=new ArrayList<>();
                    l.add(i);
                    l.add(j);
                    lists.add(l);
                }
            }
        }
        return lists;
    }
    private void sign(int[][] heights,int i,int j,int[][] sign){
        sign[i][j]++;
        if (i-1>=0&&heights[i-1][j]>=heights[i][j]&&sign[i-1][j]==0){
            sign(heights,i-1,j,sign);
        }
        if (j-1>=0&&heights[i][j-1]>=heights[i][j]&&sign[i][j-1]==0){
            sign(heights,i,j-1,sign);
        }
        if (i+1<heights.length&&heights[i+1][j]>=heights[i][j]&&sign[i+1][j]==0){
            sign(heights,i+1,j,sign);
        }
        if (j+1<heights[0].length&&heights[i][j+1]>=heights[i][j]&&sign[i][j+1]==0){
            sign(heights,i,j+1,sign);
        }
    }
    public static void main(String[] args) {
        //System.out.println(testUtil.replace("[[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]"));
        int[][] test={{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        Leetcode417 l=new Leetcode417();
        System.out.println(l.pacificAtlantic(test));
    }

}
