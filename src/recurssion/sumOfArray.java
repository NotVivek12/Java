package recurssion;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = sum(arr,0);
        System.out.println(res);
    }
    public static int sum(int[] arr, int n) {
        if (n == arr.length) {
            return 0;
        }
        return arr[n] + sum(arr,n+1);
    }
}
