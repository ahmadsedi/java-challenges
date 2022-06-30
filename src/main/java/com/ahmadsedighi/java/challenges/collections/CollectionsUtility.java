package com.ahmadsedighi.java.challenges.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 30/06/2022
 * Time: 23:33
 */

public class CollectionsUtility {
    public static <E> List<E> merge(List<E>...lists){
        return Arrays.stream(lists).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public static <E> Set<E> mergeDistinct(List<E>...lists){
        return Arrays.stream(lists).flatMap(Collection::stream).collect(Collectors.toSet());
    }

}
