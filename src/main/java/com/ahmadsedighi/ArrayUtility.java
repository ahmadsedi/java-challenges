package com.ahmadsedighi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 05/06/2022
 * Time: 19:31
 */

public class ArrayUtility {
    public static Map<String, Long> occurring(String[] array){
        return Stream.of(array).collect(groupingBy(s->s, counting()));
    }

    public static Map.Entry<String, Long> maxOccurring(String[] array){
        return Stream.of(array).collect(groupingBy(s -> s, counting())).
                entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow(ArrayIndexOutOfBoundsException::new);
    }

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
