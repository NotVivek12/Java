import java.util.Scanner;

public class sumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = 0;
            int j=i;
            while( j<str.length() && Character.isDigit(ch[j])) {
                int a = ch[j] - '0';
                n = n*10 + a;
                //System.out.println(n);
                i++;
                j++;
            }
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
