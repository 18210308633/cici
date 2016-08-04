package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rensong.pu on 2016/8/4.
 */
public class StringSolution {
    /**
     * 345. Reverse Vowels of a String
     */
    public String reverseVowels(String s) {
        char[] chararray = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int i = 0;
        int j = chararray.length - 1;
        while (i < j) {
            while (i < s.length() && !set.contains(chararray[i])) {
                i++;
            }
            while (j >= 0 && !set.contains(chararray[j])) {
                j--;
            }
            if (i < j) {
                char temp = chararray[i];
                chararray[i] = chararray[j];
                chararray[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(chararray);
    }

    /**
     * 344. Reverse String
     *
     * @param s
     */
    public String reverseString(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] charArray = s.toCharArray();
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        StringSolution solution = new StringSolution();
        System.out.println(solution.reverseString("leetcode"));
    }
}
