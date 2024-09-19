package recurssion;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fib(n-1);
        System.out.println(res);
    }
    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
