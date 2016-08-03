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
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }

    //13 Roman to Integer 复杂度O(N2)
    public int romanToInt(String s) {
        /**
         *  I ---- 1
         *  V ---- 5
         *  X ---- 10
         *  L ---- 50
         *  C ---- 100
         * 思路：自右向左扫描s，比后面所有的字母都要大的字母为正，否则为负
         * */
        int sig = 1;//标记正负
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            Character ct = new Character(s.charAt(i));
            sig = judgeSig(ct, s.substring(i), map);
            sum += sig * map.get(ct).intValue();
        }
        return sum;
    }

    public int judgeSig(Character c, String sub, Map<Character, Integer> map) {
        for (int i = 0; i < sub.length(); i++) {
            if (map.get(c).intValue() - map.get(sub.charAt(i)).intValue() < 0) {
                return -1;
            }
        }
        return 1;
    }

    //13 改进版 复杂度为O(N)
    public int romanToInt2(String s) {
        int[] sizes = {1, 5, 10, 50, 100, 500, 1000};
        char[] symbols = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        int i, j, k;

        i = s.length() - 1;
        j = 0;
        k = 0;
        int result = 0;
        while (i >= 0) {
            if (s.charAt(i) == symbols[j]) {
                result += sizes[j];
                i--;
            } else if (j > 0 && s.charAt(i) == symbols[k]) {
                result -= sizes[k];
                i--;
            } else {
                j++;
                k = j % 2 == 0 ? j - 2 : j - 1;
            }
        }
        return result;
    }

    //12 Integer to Roman
    public String intToRoman(int num) {
        String M[] = {"", "M", "MM", "MMM"}; //0:1000:3000
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};  //0:100:900
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  //0:10:90
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; //0:1:9
        return M[num/1000] + C[(num%1000)/100]+ X[(num%100)/10] + I[num%10];
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] arr = new int[]{3, 4, 5};
//        int[] arr = new int[]{4, 5, 6, 7, 0, 1, 2};
//        System.out.println(test.findMin(arr));
//        System.out.println(test.isPerfectSquare(808201));
        int aa = test.romanToInt2("XLVIII");
        System.out.println(aa);
        System.out.println(test.intToRoman(aa));
    }

}
