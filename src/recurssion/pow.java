package recurssion;

import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = sc.nextInt();
        int res = power(n,pow);
        System.out.println(res);
    }
    public static int power(int n, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return n * power(n,pow-1);
        }
    }
}
