package com.Math;

/**
 * Created by thinkpad on 2016/8/27.
 */
public class Solution {
    public static void main(String[] args) {
        int sum = new Solution().computeArea(-2, -2, 2, 2, -1, -1, 1, 1);
        System.out.println(sum);
    }

    /**
     * 223.Rectangle Area
     */
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A, E), right = Math.max(Math.min(C, G), left);
        int bottom = Math.max(B, F), top = Math.max(Math.min(D, H), bottom);
        return (C - A) * (D - B) - (right - left) * (top - bottom) + (G - E) * (H - F);
    }

}
