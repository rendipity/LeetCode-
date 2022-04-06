package 贪心算法;

public class Leetcode392 {
    public boolean isSubsequence(String t, String s) {
        char[]charS=s.toCharArray();
        char[]charT=t.toCharArray();
        int j=0;
        for (int i = 0; i < charS.length&&j<charT.length; i++) {
            if (charS[i]==charT[j]){
                j++;
            }
        }
        return j==charT.length;
    }
    public static void main(String[] args) {
        String t= "abh", s = "ahbgdc";
        Leetcode392 l =new Leetcode392();
        System.out.println(l.isSubsequence(t,s));
    }
}
