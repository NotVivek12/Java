import java.util.*;
class MoveAllZeros
{
    static int arrange(String val) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < val.length(); i++) {
            if(val.charAt(i) == '1') count1++;
            else count2++;
        }
        StringBuilder arranged = new StringBuilder();
        for (int i = 0; i < count1; i++) {
            arranged.append('1');
        }
        for (int i = 0; i < count2; i++) {
            arranged.append('0');
        }
        return Integer.parseInt(arranged.toString());
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) arr[i] = sc.next();
        for(String val : arr) System.out.println(arrange(val));
    }
}