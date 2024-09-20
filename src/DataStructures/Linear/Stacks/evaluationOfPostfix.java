package DataStructures.Linear.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class evaluationOfPostfix {

    public static int evaluatePostfix(String s) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                continue;
            } else if(Character.isDigit(ch)) {
                st.push(ch-'0');
            }
            else {
                int b = st.pop();
                int a = st.pop();

                if (ch == '+') {
                    int c = a+b;
                    st.push(c);
                } else if (ch == '-') {
                    int c = a-b;
                    st.push(c);
                } else if (ch == '*') {
                    int c = a*b;
                    st.push(c);
                } else if (ch == '/') {
                    int c = a/b;
                    st.push(c);
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = evaluatePostfix(s);
        System.out.println(result);
    }
}
