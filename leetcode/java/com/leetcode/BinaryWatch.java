package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二进制手表
 * Created by rensong.pu on 2016/12/19.
 */
public class BinaryWatch {
    /**
     * bigCount为二进制位补码的个数，正数的补码就是自身
     * 所以返回的个数相加如果为num就是符合条件的时间。
     * @param num
     */
    public void printTime(Integer num) {
        if (num < 0 | num > 8) {
            return;
        }
        for (int h = 0; h <= 12; h++) {
            for (int m = 0; m <= 59; m++) {

                if(Integer.bitCount(h)+Integer.bitCount(m)==num){
                    System.out.println(h+":"+m);
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryWatch bw = new BinaryWatch();
        List<String> rs = new ArrayList<>();
//        for (int i = 0; i <= 9; i++) {
//            rs.addAll(bw.readBinaryWatch(i));
//        }
//        System.out.println(rs.size());
        System.out.println(Integer.bitCount(7));
//        bw.printTime(2);
    }

    public List<String> readBinaryWatch(int num) {
        if (num > 8) {
            try {
                throw new Exception("不合法，不存在这种情况,num=" + num);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        List<String> res = new ArrayList<>();
        int[] nums1 = new int[]{8, 4, 2, 1}, nums2 = new int[]{32, 16, 8, 4, 2, 1};
        for (int i = 0; i <= num; i++) {
            List<Integer> list1 = generateDigit(nums1, i);
            List<Integer> list2 = generateDigit(nums2, num - i);
            for (int num1 : list1) {
                if (num1 >= 12) continue;
                for (int num2 : list2) {
                    if (num2 >= 60) continue;
                    res.add(num1 + ":" + (num2 < 10 ? "0" + num2 : num2));
                }
            }
        }
        return res;
    }

    private List<Integer> generateDigit(int[] nums, int count) {
        List<Integer> res = new ArrayList<>();
        generateDigitHelper(nums, count, 0, 0, res);
        return res;
    }

    private void generateDigitHelper(int[] nums, int count, int pos, int sum, List<Integer> res) {
        if (count == 0) {
            res.add(sum);
            return;
        }

        for (int i = pos; i < nums.length; i++) {
            generateDigitHelper(nums, count - 1, i + 1, sum + nums[i], res);
        }
    }
}
