package com.leetcode;

/**
 * Created by thinkpad on 2016/8/8.
 */
public class BigManipulation {
    public static void main(String[] args) {
        BigManipulation solution = new BigManipulation();
        int num = 0;
//        System.out.println(solution.isPowerOfFour(num));
        System.out.println(solution.isPowerOfThree(num));
    }

    /**
     * 342. Power of Four
     * warn:without loops/recursion
     * leetcode Oj不支持pattern，其实string已经有match的正则匹配了
     */
    public boolean isPowerOfFour(int num) {
        String bi = Integer.toBinaryString(num);
//        Pattern pattern = Pattern.compile("(?<=1)0+");
//        Matcher matcher = pattern.matcher(bi);
        if (bi.matches("10*")) {    //注意到1也是4的Power，故正则用*
            //后缀0的个数为偶数个则为power of four
//            return matcher.group().length() % 2 == 0;
            return (bi.length() - 1) % 2 == 0;
        }       //以上可以简化为 bi.matches("1(00)*").length
        return false;
        /**
         * 大神的一行代码
         * Proof #1: (4^n-1) = (4-1) (4^(n-1) + 4^(n-2) + 4^(n-3) + ..... + 4 + 1)
         * Proof #2 (by induction) 4^(n+1) - 1 = 44^n -1 = 34^n + 4^n-1. The first is divided by 3, the second is proven by induction hypothesis
         * num&(num-1)==0 guarantee the num is power of two ？？
         *
         */
//        return num > 0 && (num & (num - 1)) == 0 && (num - 1) % 3 == 0;
    }

    /**
     * 231. Power of Two
     */
    public boolean isPowerOfTwo(int n) {
//        if (n <= 0) {
//            return false;
//        }
//        return (n & (n - 1)) == 0; //可以合并  &
        //recursion
        return n > 0 && (n == 1 || (n % 2 == 0 && isPowerOfTwo(n / 2)));
        /*
        //iteration
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;*/
    }

    /**
     * 326. Power of  Three
     *
     * @param n
     */
    public boolean isPowerOfThree(int n) {
        return n > 0 && (n == 1 || (n % 3 == 0 && isPowerOfThree(n / 3)));
        /**
         * without loops and recursion
         * 借助Math.log10(n)
         */
        //   double log = (double) Math.log10(n);  //?
    }

}
