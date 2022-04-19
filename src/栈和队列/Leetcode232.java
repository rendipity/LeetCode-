package 栈和队列;

import java.util.Arrays;
import java.util.Stack;

//摊还算法
public class Leetcode232 {

    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public void push(int x) {
        s1.push(x);
    }
    public int pop() {
        if (s2.empty())
            while (!s1.empty())
                s2.push(s1.pop());
        return s2.pop();
    }

    public int peek() {
        if (s2.empty())
            while (!s1.empty())
                s2.push(s1.pop());
        return s2.peek();
    }

    public boolean empty() {
        return s1.empty()&&s2.empty();
    }

    public static void main(String[] args) {
        Leetcode232 l =new Leetcode232();
        l.push(1);
        l.push(2);
        System.out.println(l.peek());
        System.out.println(l.pop());
        System.out.println(l.empty());

    }
}
