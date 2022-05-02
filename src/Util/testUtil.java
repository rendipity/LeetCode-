package Util;

public class testUtil {
    public static String replace(String str){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='[')
                stringBuilder.append('{');
            else if (str.charAt(i)==']')
                stringBuilder.append('}');
            else
                stringBuilder.append(str.charAt(i));
        }
        return  stringBuilder.toString();
    }
}
