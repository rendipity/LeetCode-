package 贪心算法;

import java.util.ArrayList;
import java.util.List;

public class Leetcode763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new ArrayList<>();
        int []cEnd=new int[26];
        for (int i = 0; i < s.length(); i++) {
            cEnd[s.charAt(i)-'a']=i;
        }
        int start=0,end=0;
        for (int i = 0; i < s.length(); i++) {
            if (cEnd[s.charAt(i)-'a']>end)
                end=cEnd[s.charAt(i)-'a'];
            else if (i==end){
                list.add(end-start+1);
                start=i+1;
                end+=1;
            }
        }
        return list;
    }

    public static void main(String[] args) {
            String s="eaaaabaaec";
            Leetcode763 l=new Leetcode763();
            List<Integer> result=l.partitionLabels(s);
        for (int i : result){
            System.out.println(i);
        }
    }
}
