package 搜索.数学;

public class System36 {
    static String add(String a, String b) {
        char[] e=new char[36];
        for (int i = 0; i < 36; i++) {
            if (i<10)
                e[i]=(char) (i+'0');
            else
                e[i]=(char) ('a'+i-10);
        }
        String c=a.length()>b.length()?a:b;
        String d=a.length()<b.length()?a:b;
        StringBuilder result= new StringBuilder();
        // Please fill this blank
        int carry=0;
        for (int i = c.length()-1,j=d.length()-1; j>=0; i--,j--) {
            int a1 = c.charAt(i) <= '9' ? c.charAt(i) - '0' : c.charAt(i) - 'a' + 10;
            int a2 = d.charAt(j) <= '9' ? d.charAt(j) - '0' : d.charAt(j) - 'a' + 10;
            int sumC = a1 + a2 + carry;
            carry = sumC / 36;
            sumC %= 36;
            result.append(e[sumC]);
        }
        int i=c.length()-d.length()-1;
        for (; i>=0&&carry>0 ; i--) {
            int a1 = c.charAt(i) <= '9' ? c.charAt(i) - '0' : c.charAt(i) - 'a' + 10;
            int sumC = a1 + carry;
            carry = sumC / 36;
            sumC %= 36;
            result.append(e[sumC]);
        }

            return i<0&&carry>0?"1"+result.reverse():c.substring(0,i+1)+result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(System36.add("abbbb","1"));
    }
}
