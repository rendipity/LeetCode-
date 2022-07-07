package 动态规划.分割整数;

public class Leetcode91_KindsOfDecode {
    public int numDecodings(String s) {
        if (s.charAt(0)=='0')
            return 0;
        int num1=1,num2=1;
        for (int i = 1; i <s.length() ; i++) {
            if (s.charAt(i)=='0'){
                if (Integer.parseInt(s.substring(i-1,i+1))>26||Integer.parseInt(s.substring(i-1,i+1))<1)
                    return 0;
                else{
                    num2=num1;
                }
            }
            else if (Integer.parseInt(s.substring(i-1,i+1))<=26){
                if (s.charAt(i-1)=='0')
                    num1=num2;
                else
                {
                    int t = num2;
                    num2 += num1;
                    num1 = t;
                }
            }else{
                num1=num2;
            }
        }
        return num2;
    }

    public static void main(String[] args) {
        Leetcode91_KindsOfDecode l = new Leetcode91_KindsOfDecode();
        System.out.println(l.numDecodings("226"));
    }
}
