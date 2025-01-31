package DyanamicProgramming;

import java.util.*;
class LongestIncreasingSubsequence
{
    static int DP(int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp,1);
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0 ; j < i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max = 0;
        for(int val: dp) max = Math.max(max, val);
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(DP(arr));
    }
}