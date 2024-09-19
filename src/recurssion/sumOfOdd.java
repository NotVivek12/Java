package recurssion;

import java.util.Scanner;

public class sumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = Sum(arr,0);
        System.out.println(sum);
    }
    public static int Sum(int arr[],int n) {
        if (n == arr.length) {
            return 0;
        }
        if (arr[n] % 2 != 0) {
            return arr[n] + Sum(arr, n + 1);
        } else {
            return Sum(arr, n + 1);
        }
    }
}
