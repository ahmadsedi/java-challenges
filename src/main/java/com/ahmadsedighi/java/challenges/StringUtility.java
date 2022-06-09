package com.ahmadsedighi.java.challenges;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 07/06/2022
 * Time: 16:10
 */

public class StringUtility {

    public static String[] findWords(String input){
        return Stream.of(input.split(" ")).distinct().toArray(String[]::new);
    }

    /**
     * Extracts digit characters from a string, convert to Long object, and wrap it in Optional.
     *
     * @param input represents the string which is being processed.
     *
     * @return {@code Optional} which wraps a Long object.
     */
    public static Optional<Long> extractDigits(String input){
        String result = input.chars().filter(Character::isDigit).collect(StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append).toString();
        return result.isEmpty()?Optional.empty():Optional.of(Long.parseLong(result));
    }


}
