import java.util.Scanner;
class scam
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] mat = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        if (m == 3) {
            for (int i = 0; i < m; i++) {
                System.out.print(mat[0][i] + " ");
            }
            for (int i = 1; i < m; i++) {
                System.out.print(mat[i][2] + " ");
            }
            for (int i = 1; i >= 0; i--) {
                System.out.print(mat[2][i] + " ");
            }
            for (int i = 0; i <= 1; i++) {
                System.out.print(mat[1][i] + " ");
            }
        }
        if (m == 4) {
            for (int i = 0; i < m; i++) {
                System.out.print(mat[0][i] + " ");
            }
            for (int i = 1; i < m; i++) {
                System.out.print(mat[i][3] + " ");
            }
            for (int i = 2; i >= 0; i--) {
                System.out.print(mat[3][i] + " ");
            }
            for (int i = 2; i >= 1; i--) {
                System.out.print(mat[i][0] + " ");
            }
            for (int i = 1; i < 3; i++) {
                System.out.print(mat[1][i] + " ");
            }
            for (int i =2; i >= 1; i--) {
                System.out.print(mat[2][i] + " ");
            }
        }
    }
}