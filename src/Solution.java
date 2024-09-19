import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length() -1;
        char ch[] = new char[str.length()];
        for (int i = 0; i< len; i++) {
            ch[i] = str.charAt(i);
        }
        for (int i = 0;i < len;i++) {
            if (ch[i] == '0') {
                continue;
            }
            int flag = 0;
            for (int j = i; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag += 1;
                    ch[j] = '0';
                }
            }
            if (flag == 0) {
                System.out.println(ch[i]);
                System.exit(0);
            }
        }
        System.out.println("All cheuigeo");
    }
}