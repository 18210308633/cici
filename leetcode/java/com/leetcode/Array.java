package com.leetcode;

/**
 * Created by thinkpad on 2016/8/7.
 */
public class Array {

    /**
     * 26. Remove Duplicates from Sorted Array
     *
     * @param args
     */


    public static void main(String[] args) {
        Array solution = new Array();
        int[] nums = new int[]{3, 2, 3, 3};
        int val = 3;
        int length = solution.removeElement(nums, val);
        System.out.println("length=>" + length);
    }

    /**
     * 27. Remove Element
     * use two pointers
     * 需要注意的是测试用例的情况[],[val,val]
     * 0~i-1为不是val的其他数
     */
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = nums.length - 1;
        for (; i <= j; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;//交换过后的位置一定是nums[j]==val，没必要再做交换
                i--;//检验交换过后的i位置的nums[j]的值
            }
        }
        /**
         * i不加1的原因是i==j的时候一定有nums[i]!=val
         * 循环结束i已经+1
         * 或者全是val，还是初始值0
         */
        return i;
    }
}
