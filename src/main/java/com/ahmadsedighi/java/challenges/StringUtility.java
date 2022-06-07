package com.ahmadsedighi.java.challenges;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 07/06/2022
 * Time: 16:10
 */

public class StringUtility {

    public static String[] findWords(String input){
        return Stream.of(input.split(" ")).distinct().toArray(String[]::new);
    }
}
