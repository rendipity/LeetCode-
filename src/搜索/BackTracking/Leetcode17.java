package 搜索.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Leetcode17 {
    private List<String> list =new ArrayList<>();
    private StringBuilder stringBuilder=new StringBuilder();
    private String digits;
    private char[][] c={{},{},{'a','b','c'},
                {'d','e','f'},
                {'g','h','i'},
                {'j','k','l'},
                {'m','n','o'},
                {'p','q','r','s'},
                {'t','u','v'},
                {'w','x','y','z'}};
    public List<String> letterCombinations(String digits) {
        this.digits=digits;
        combination(0);
        return list;
    }
    private void combination(int i){
        if (i==digits.length())
        {
            if (stringBuilder.length()>0)
                list.add(stringBuilder.toString());
            return;
        }
        int numb=digits.charAt(i)-'0';
        for (int j = 0; j < c[numb].length; j++) {
            stringBuilder.append(c[numb][j]);
            combination(i+1);
            stringBuilder.deleteCharAt(i);
        }
    }

    public static void main(String[] args) {
        String digits="";
        Leetcode17 l =new Leetcode17();
        System.out.println(l.letterCombinations(digits));
    }
}
