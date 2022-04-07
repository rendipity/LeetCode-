package 字符串;


import java.util.Arrays;

public class Leetcode205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length())
            return false;
        int[] sMappingT=new int[128];
        int[] tMappingS=new int[128];
        Arrays.fill(sMappingT,-1);
        Arrays.fill(tMappingS,-1);
        for (int i = 0; i < s.length(); i++) {
            if (sMappingT[s.charAt(i)]==-1)
            {
                if (tMappingS[t.charAt(i)]==-1){
                    sMappingT[s.charAt(i)]=t.charAt(i);
                    tMappingS[t.charAt(i)]=s.charAt(i);
                }
                else
                    return false;
            }
            else if (t.charAt(i)!=sMappingT[s.charAt(i)])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Leetcode205 l =new Leetcode205();
        String s="egg";
        String t="add";
        System.out.println(l.isIsomorphic(s, t));
    }
}
