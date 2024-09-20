package DataStructures.Linear.Stacks;

import java.util.Scanner;

public class stackUsingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int j = -1;
        for(int i = 0;i<n;i++) {
            String str = sc.next();

            if(str.equalsIgnoreCase("push")) {
                arr[++j] = sc.nextInt();
            } else if(str.equalsIgnoreCase("pop")) {
                j--;
            } else if(str.equalsIgnoreCase("print")) {
                for (int k = 0; k <= j; k++) {
                    System.out.println(arr[k]);
                }
            }
        }
    }
}
