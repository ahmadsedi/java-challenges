package com.ahmadsedighi.java.challenges.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    public static List<String> mergeAndRemoveEmpty(List<String>...lists){
        List<String> list = merge(lists);
        list.removeIf(String::isEmpty);
        return list;
    }

    public static List<String> trimTo10(List<String> list, int n){
        List<String> newList = new ArrayList(list);//list might be immutable, so we need to make a copy
        newList.replaceAll(e->e.length()>n?e.substring(0, n):e);
        return newList;
    }

    public static <E, F> Map<E, F> createMap(Set<E> keys, List<F> values){
        if(keys.size()!=values.size()){
            throw new IllegalArgumentException("Set and List must have same size!");
        }
        List<E> keysList = new ArrayList<E>(keys);
        return Map.ofEntries(Stream.iterate(0, i->i+1).limit(keys.size()).map(i->Map.entry(keysList.get(i), values.get(i))).toArray(Map.Entry[]::new));
    }


}
