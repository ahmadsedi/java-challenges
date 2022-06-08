package com.ahmadsedighi.java.challenges;

import java.util.stream.IntStream;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 08/06/2022
 * Time: 17:55
 */

public class Pangrams {
    /**
     * Checks if a string is Pangrams. A string is Pangrams if it contains all 26 English alphabets.
     *
     * @param str to check if it's Pangrams.
     *
     * @return true if input is Pangrams
     */
    public static boolean isPangrams(String str){
        return IntStream.range(97, 122).filter(c->str.indexOf(c)==-1).findAny().isEmpty();
    }
}
