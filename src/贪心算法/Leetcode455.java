package 贪心算法;

import java.util.Arrays;

public class Leetcode455 {
    public static void main(String[] args) {
        Leetcode455 l=new Leetcode455();
        int[] g={1,2,3},s={1,2,6};
        System.out.println(l.findContentChildren(g,s));
    }
    /*public int findContentChildren(int[] g, int[] s) {
        int k=s.length;
        int num=0;
        for (int i = 0; i < g.length&&k>0; i++) {
            int loc=-1;
            for (int j = 0; j < s.length; j++) {
                if(g[i]<=s[j]&&(loc==-1||s[loc]>s[j])){
                      loc=j;
                }
            }
           if(loc!=-1){
               num++;
               s[loc]=-1;
               k--;
           }
        }
        return num;
    }*/
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        int num=0;
        for (int i = 0; i <s.length&&j<g.length ; i++) {
            if(g[j]<=s[i]){
                num++;
                j++;
            }
        }
        return num;
    }
}
