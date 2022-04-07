package 字符串;

public class Leetcode409 {
    public int longestPalindrome(String s) {
        int []charNum=new int[52];
        for (int i = 0; i < s.length(); i++) {
            if ('A' <=s.charAt(i)&&s.charAt(i)<= 'Z')
                charNum[s.charAt(i)-'A']++;
            else
                charNum[s.charAt(i)-'a'+26]++;
        }
        int sum=0;
        int singular=0;
        for (int i = 0; i <52 ; i++) {
            if (charNum[i]%2==1)
                singular=1;
            sum+=(charNum[i]/2)*2;
        }
        sum+=singular;
        return sum;
    }
    public static void main(String[] args) {
        Leetcode409 l=new Leetcode409();
        String s="racecar";
        System.out.println(l.longestPalindrome(s));
    }
}
