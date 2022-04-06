package 字符串;

public class Leetcode242 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        int[] charNum=new int[26];
        for (int i = 0; i < s.length(); i++) {
            charNum[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            charNum[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (charNum[i]!=0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Leetcode242 l =new Leetcode242();
        String s="hellop";
        System.out.println(l.isAnagram(s, s+"a"));

    }
}
