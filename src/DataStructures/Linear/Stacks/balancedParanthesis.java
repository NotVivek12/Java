package DataStructures.Linear.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class balancedParanthesis {
    public static Boolean balanced(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if(ch == ')' && top != '(') {
                    return false;
                }
                if(ch == ']' && top != '[') {
                    return false;
                }
                if(ch == '}' && top!='{') {
                    return false;
                }
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean result = balanced(s);
        System.out.println(result);
    }
}
