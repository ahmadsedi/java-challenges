package com.ahmadsedighi.java.challenges;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 05/06/2022
 * Time: 19:31
 */

public class ArrayUtility {
    /**
     * Finds how often each element in an array of {@code String} has repeated.
     *
     * @param array of {@code String} to be processed.
     *
     * @return a map of {@code String} and {@code java.lang.Long} representing the number of String occurrence.
     */
    public static Map<String, Long> occurring(String[] array){
        return Stream.of(array).collect(groupingBy(s->s, counting()));
    }

    /**
     * Receives an array of {@code String} and finds the most often repeated element in the array.
     *
     * @param array of {@code String} to be processed.
     *
     * @return a {@code Map.Entry} representing the most often repeated element with the number of occurrence.
     */
    public static Map.Entry<String, Long> maxOccurring(String[] array){
        return Stream.of(array).collect(groupingBy(s -> s, counting())).
                entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow(ArrayIndexOutOfBoundsException::new);
    }


    /**
     *
     * @param input
     * @return
     */
    public static String findMaxOccurringWord(String input){
        return maxOccurring(input.split(" ")).getKey();
    }

    public static String[] removeDuplicates(String[] array){
        return Stream.of(array).distinct().toArray(String[]::new);
    }

    public static String[] common(String[] array1, String[] array2){
        return Stream.of(array1).filter(List.of(array2)::contains).toArray(String[]::new);
    }

    public static String[] firstThreeLongest(String[] array){
        return Stream.of(array).sorted(Comparator.comparingInt(String::length).reversed()).limit(3).toArray(String[]::new);
    }

    public static String[] firstThreeShortest(String[] array){
        return Stream.of(array).sorted(Comparator.comparingInt(String::length)).limit(3).toArray(String[]::new);
    }

}
