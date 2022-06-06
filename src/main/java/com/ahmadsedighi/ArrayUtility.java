package com.ahmadsedighi;

import java.util.Comparator;
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
        return Stream.of(array).collect(groupingBy(s->s, counting())).entrySet().stream().
                sorted(Map.Entry.<String, Long>comparingByValue().reversed()).findFirst().orElseThrow(ArrayIndexOutOfBoundsException::new);
    }

}
