package com.ahmadsedighi.java.challenges;

import java.util.Arrays;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 08/06/2022
 * Time: 17:04
 */

public class Anagrams {

    /**
     * Two words are anagrams if they contain the same letters but in a different order.
     * Here are a few examples of anagram pairs:
     *
     * “listen” and “silent”
     * “binary” and “brainy”
     * “Paris” and “pairs”
     *
     * @param str1 the first {@code String}
     * @param str2 the second {@code String}
     * @return true if str1 and str2 are anagrams
     */
    public static boolean isAnagram(String str1, String str2){
        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();
        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);
        return String.valueOf(str1Chars).equals(String.valueOf(str2Chars));
    }
}
