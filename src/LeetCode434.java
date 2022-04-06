public class LeetCode434 {
    public static void main(String[] args) {
            Solution s=new Solution();
            String str=" Hello, my name is John ";
            System.out.println(s.countSegments(str));
    }
}
class Solution {
    public int countSegments(String s) {
        if (s.length()==0)
            return 0;
        char[] c=s.toCharArray();
        int num=0;
        for (int i = 1; i < c.length; i++) {
            if (c[i]==' '&&c[i-1]!=' ')
                num++;
        }
        if(c[c.length-1]!=' ')
            num++;
        return num;
    }
}
