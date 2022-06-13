package com.ahmadsedighi.java.challenges;

import java.util.stream.IntStream;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 13/06/2022
 * Time: 16:23
 */

public class GeneralUtility {
    /**
     * Concats elements of an integer array as a string.
     *
     * @param array of integers
     * @return an equivalent {@code String}
     */
    public static String convertToString(int[] array){
        return IntStream.of(array).collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append).toString();
    }
}
