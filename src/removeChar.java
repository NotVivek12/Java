import java.util.Scanner;

public class removeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String result = "";
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (!str1.contains(Character.toString(c))){
                result += c;
            }
        }
        System.out.println(result);
    }
}
