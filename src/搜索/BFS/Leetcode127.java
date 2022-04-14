package 搜索.BFS;

import java.util.*;

public class Leetcode127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue=new ArrayDeque<>();
        queue.add(beginWord);
        int len=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                String oldWord=queue.poll();
                Iterator<String> iterator= wordList.iterator();
                while(iterator.hasNext()) {
                    String word = iterator.next();
                    if (justOneDiff(word,oldWord)) {
                        if (word.equals(endWord))
                            return len + 1;
                        else {
                            iterator.remove();
                            queue.add(word);
                        }
                    }
                }
            }
            len++;
        }
        return 0;
    }
    private boolean justOneDiff(String str1,String str2){
        int difSum=0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i)!=str2.charAt(i)){
                if (difSum<1)
                    difSum++;
                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode127 l=new Leetcode127();
        String beginWord = "hit", endWord = "cog";
        String[] words = {"hot","dot","dog","lot","log","cog"};
        List<String> wordList=new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            wordList.add(words[i]);
        }
        System.out.println(l.ladderLength(beginWord, endWord, wordList));
    }
}
