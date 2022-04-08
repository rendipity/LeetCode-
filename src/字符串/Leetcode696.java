package 字符串;

import java.util.Arrays;

public class Leetcode696 {
    public int countBinarySubstrings(String s) {
        int sum=0;
        int[] num=new int[2];
        Arrays.fill(num,-1);
        for (int i = 0; i < s.length(); i++) {
            if (num[s.charAt(i)-'0']==-1)
                num[s.charAt(i)-'0']=1;
            else if (s.charAt(i)==s.charAt(i-1)){
                num[s.charAt(i)-'0']++;
            }else{
                sum+=Math.min(num[0],num[1]);
                num[s.charAt(i)-'0']=1;
            }
        }
        if (num[0]*num[1]>0)
            sum+=Math.min(num[0],num[1]);
        return sum;
    }

    public static void main(String[] args) {
        Leetcode696 l=new Leetcode696();
        System.out.println(l.countBinarySubstrings("00"));
    }
}
