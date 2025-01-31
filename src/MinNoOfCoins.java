import java.util.Scanner;

public class MinNoOfCoins {
    public static void findMinCurrency(int N) {
        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        for (int denom : denominations) {
            while (N >= denom) {
                System.out.print(denom + " ");
                N -= denom;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        findMinCurrency(N);
    }
}
