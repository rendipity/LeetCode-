package 搜索.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Leetcode93 {
    List<String> list = new ArrayList<>();
    StringBuilder IP =new StringBuilder();
    String s;
    int splitNum=0;
    public List<String> restoreIpAddresses(String s) {
        this.s=s;
        if (s.length()>=4&&s.length()<=12)
            ipSplit(0);
        return list;
    }
    private void ipSplit(int i){
        //剪枝
        if (s.length()-i>(4-splitNum)*3||s.length()-i<=0)
            return ;
        if (splitNum==3){
            if (Integer.parseInt(s.substring(i))<=255&&!(s.substring(i,i+1).charAt(0)=='0'&&s.substring(i).length()>1)){
                IP.append(s.substring(i));
                list.add(IP.toString());
                IP.delete(IP.length()-s.length()+i,IP.length());
            }
            return;
        }
        for (int j = 1; j <=3&&j<s.length()-i ; j++) {
            if (Integer.parseInt(s.substring(i,i+j))>255)
                return;
            else if (s.substring(i,i+1).charAt(0)=='0'&&j>1)
                return;
            splitNum++;
            IP.append(s.substring(i,i+j));
            IP.append('.');
            ipSplit(i+j);
            splitNum--;
            IP.delete(i+splitNum,i+j+splitNum+1);
        }
    }

    public static void main(String[] args) {
        String s="255255255255";
        Leetcode93 l=new Leetcode93();
        System.out.println(l.restoreIpAddresses(s));
    }
}
