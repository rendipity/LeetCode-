package 搜索.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode131 {
    List<List<String>> list =new ArrayList<>();
    List<String> list1=new ArrayList<>();
    public List<List<String>> partition(String s) {
        subString(s,0);
        return list;
    }
    private void subString(String s,int loc){
        if (loc==s.length()){
            List<String> newList= Arrays.asList(new String[list1.size()]);
            Collections.copy(newList,list1);
            list.add(newList);
            return;
        }
        for (int i =1; loc+i<=s.length(); i++) {
            if (isPartition(s.substring(loc,loc+i))){
                list1.add(s.substring(loc,loc+i));
                subString(s,loc+i);
                list1.remove(list1.size()-1);
            }
        }
    }
    private boolean isPartition(String s){
        for (int i = 0; i < s.length()/2+1; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="a";
        Leetcode131 l =new Leetcode131();
        System.out.println(l.partition(s));
    }
}
