package 字符串;

public class Leetcode9 {
    public boolean isPalindrome(int x) {
        String strX=String.valueOf(x);
        for (int i = 0; i < (strX.length()+1)/2; i++) {
            if (strX.charAt(i)!=strX.charAt(strX.length()-i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode9 l =new Leetcode9();
        System.out.println(l.isPalindrome(3));
    }
}
