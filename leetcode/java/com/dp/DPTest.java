package com.dp;

import java.util.Vector;

/**
 * 现有N种不同面值的纸币，请用代码实现一函数，求当需支付M元时，最少需要多少张纸币，当无法正好凑整时返回-1。
 * Created by rensong.pu on 2016/9/19.
 */
public class DPTest {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1};
        int M = 5;
        System.out.println(min(arr, M));
    }

    public static int min(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return -1;
        }
        int n = arr.length;
        int max = Integer.MAX_VALUE;
        int[][] dp = new int[n][aim + 1];
        for (int j = 1; j <= aim; j++) {
            dp[0][j] = max;
            if (j - arr[0] >= 0 && dp[0][j - arr[0]] != max) {
                dp[0][j] = dp[0][j - arr[0]] + 1;
            }
        }
        int left = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= aim; j++) {
                left = max;
                if (j - arr[i] >= 0 && dp[i][j - arr[i]] != max) {
                    left = dp[i][j - arr[i]] + 1;
                }
                dp[i][j] = Math.min(left, dp[i - 1][j]);
            }
        }
        return dp[n - 1][aim] != max ? dp[n - 1][aim] : -1;
    }


}
