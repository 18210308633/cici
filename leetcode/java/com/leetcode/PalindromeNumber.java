package com.leetcode;

/**
 * Determine whether an integer is a palindromeNumber,without extra space
 * Created by thinkpad on 2016/7/17.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 123141321;
        int num2 = 1234321;
        PalindromeNumber bea = new PalindromeNumber();
        System.out.println("num1 is palindromeNumber?："+bea.judge(num));
        System.out.println("num2 is palindromeNumber?："+bea.judge(num2));
    }

    public int[] getDigit(int num) {
        if (num < 0) {
            return new int[]{-1};
        }
        int length = 1;
        int num2 = num;
        while (num2 / 10 != 0) {
            length++;
            num2 /= 10;
        }
        int first;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            first = num % 10;
            result[i] = first;
            num /= 10;
        }
        return result;
    }

    public boolean judge(int num) {
        int[] numArray = getDigit(num);

        for (int i = 0, j = numArray.length - 1; i <= numArray.length / 2; i++, j--) {
            if (numArray[i] != numArray[j]) {
                return false;
            }
        }
        return true;
    }
}
