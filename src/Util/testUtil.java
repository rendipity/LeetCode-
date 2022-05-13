package Util;

public class testUtil {
    public static String replace(String str){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='[')
                stringBuilder.append('{');
            else if (str.charAt(i)==']')
                stringBuilder.append('}');
            else if (str.charAt(i)=='\"')
                stringBuilder.append("'");
            else
                stringBuilder.append(str.charAt(i));
        }
        return  stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s="[[\"5\",\"3\",\".\",\".\",\"7\",\".\",\".\",\".\",\".\"],[\"6\",\".\",\".\",\"1\",\"9\",\"5\",\".\",\".\",\".\"],[\".\",\"9\",\"8\",\".\",\".\",\".\",\".\",\"6\",\".\"],[\"8\",\".\",\".\",\".\",\"6\",\".\",\".\",\".\",\"3\"],[\"4\",\".\",\".\",\"8\",\".\",\"3\",\".\",\".\",\"1\"],[\"7\",\".\",\".\",\".\",\"2\",\".\",\".\",\".\",\"6\"],[\".\",\"6\",\".\",\".\",\".\",\".\",\"2\",\"8\",\".\"],[\".\",\".\",\".\",\"4\",\"1\",\"9\",\".\",\".\",\"5\"],[\".\",\".\",\".\",\".\",\"8\",\".\",\".\",\"7\",\"9\"]]\n";
        System.out.println(testUtil.replace(s));
    }
}
