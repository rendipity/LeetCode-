package 字符串;

public class Leetcode647 {
    /*
    * 枚举所有的子串 时间复杂度O(n3);
    * */
    /*public boolean huiwen(String str){
        for (int i = 0; i <(str.length()+1)/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int sum=0;
        for (int l = 1; l <= s.length(); l++) {
            for (int i = 0; i <s.length()-l+1 ; i++) {
                if(huiwen(s.substring(i,i+l)))
                    sum++;
            }
        }
        return sum;
    }*/
    /*
    * 中心拓展法，先找中心，再向两侧延展求
    * */
    public int countSubstrings(String s) {
        int sum=0;
        for (int i = 0; i < 2*s.length()-1; i++) {
            int l=i/2;
            int r=(i+1)/2;
            for (int j = 0; l-j>=0&&r+j<=s.length()-1 ; j++) {
                if (s.charAt(l-j)!=s.charAt(r+j))
                    break;
                else
                   sum++;
            }
        }
        return sum;
    }
    /*
    Manacher 算法
    * */
    public static void main(String[] args) {
        Leetcode647 l=new Leetcode647();
        System.out.println(l.countSubstrings("aaa"));
    }
}
