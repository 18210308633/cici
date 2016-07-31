package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by thinkpad on 2016/7/25.
 */
public class Solution {

    //33 Search in Rotated Sorted Array
    public int search(int[] nums, int target) {
        //先找到异常点
        int index = -1;
        for (int k = 0; k < nums.length - 1; k++) {
            if (nums[k] < nums[k + 1]) {
                continue;
            }
            index = k;
        }
        if (index == -1) {
            index = nums.length;//正常顺序
            int r = Arrays.binarySearch(nums, target);
            return r < 0 ? -1 : r;
        }
        //第一段二分
        int[] subnums = Arrays.copyOfRange(nums, 0, index + 1);
        int result = Arrays.binarySearch(subnums, target);
        //第二段二分
        int[] secondnums = Arrays.copyOfRange(nums, index + 1, nums.length);
        int result2 = Arrays.binarySearch(secondnums, target);
        return result < 0 ? (result2 < 0 ? -1 : result2 + index + 1) : result;
    }

    //33 Search in Rotated Sorted Array 改进版本
    public int search2(int[] nums, int target) {
        //先找到异常点
        int index = -1;
        for (int k = 0; k < nums.length - 1; k++) {
            if (nums[k] < nums[k + 1]) {
                continue;
            }
            index = k;
        }
        if ((index != -1 && (nums[index] < target || nums[index + 1] > target))
                || (index == -1 && (nums[nums.length - 1] < target || nums[0] > target))) {
            return -1;
        }
        if (index == -1) {
            index = nums.length;//正常顺序
            int r = Arrays.binarySearch(nums, target);
            return r < 0 ? -1 : r;
        }
        if (nums[0] <= target) {
            int[] subnums = Arrays.copyOfRange(nums, 0, index + 1);
            int result = Arrays.binarySearch(subnums, target);
            return result < 0 ? -1 : result;
        } else {
            int[] secondnums = Arrays.copyOfRange(nums, index + 1, nums.length);
            int result = Arrays.binarySearch(secondnums, target);
            return result < 0 ? -1 : result + index + 1;
        }
    }

    //普通二分
    public int binarySearch(int[] arr, int begin, int end, int target) {
//        int begin = 0;
//        int end = arr.length - 1;
        int mid;
        while (begin <= end) {
            mid = (begin + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                begin = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //81.Search in Rotated Sorted Array II

    //153 Find Minimum in Rotated Sorted Array
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right - 1) {//while loop stop at left == right -1
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > nums[right]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (nums[left] > nums[right])
            return nums[right];
        return nums[left];
    }

    //367.Valid Perfect Square
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long left = 1;
        long right = num / 2;
        while (left <= right) {
            long mid = left + ((right - left) >> 1);
            if (mid * mid == num) {
                return true;
            } else {
                if (mid * mid < num) {
                    //需要注意的是mid*mid值会溢出int的最大值，所以left，right用的是long
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] arr = new int[]{3, 4, 5};
//        int[] arr = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(test.findMin(arr));
        System.out.println(test.isPerfectSquare(808201));
    }

}
