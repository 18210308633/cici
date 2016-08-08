package com.leetcode;

import java.util.HashSet;

/**
 * Created by rensong.pu on 2016/8/4.
 */
public class HashTableSolution {
    /**
     * 136. Single Number
     * 用抑或操作符实现
     *
     * @param nums 数组
     * @return
     */
    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum ^= nums[i];
        }
        return sum;
    }

    /**
     * 136(2). Single Number
     * 用hashSet实现
     *
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        HashSet<Integer> check = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!check.remove(nums[i])) {
                check.add(nums[i]);
            }
        }
        return check.iterator().next();
    }



    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 4, 4, 5, 6, 5};
        System.out.println(new HashTableSolution().singleNumber2(nums));
    }
}
