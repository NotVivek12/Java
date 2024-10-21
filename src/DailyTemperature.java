import java.util.Scanner;

public class DailyTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        System.out.println("enter");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            //System.out.println("next");
        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }
//        arr[n] = -99;
        for (int i = 0; i < n; i++) {
            int count = 0;
            boolean found = false;
//            if(i+1 != n) {
//                if(arr[i+1]>arr[i]) {
//                    arr2[i] = 1;
//                } else {
//                    int j = i;
//                    while(arr[j+1] < arr[j]) {
//                        count++;
//                    }
//                    arr2[i] = count;
//                }
//            } else {
//                arr2[i] = 0;
//                break;
//            }
            for (int j = i+1;j<n;j++) {
                count++;
                if (arr[j] > arr[i]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                arr2[i] = count;
            } else {
                arr2[i] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
