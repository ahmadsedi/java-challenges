package com.ahmadsedighi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Map;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 05/06/2022
 * Time: 19:45
 */

public class ArrayUtilityTest {

    @Test
    public void occurring_givenEmpty_returnEmpty(){
        assertEqualsMap(Map.of(), ArrayUtility.occurring(new String[]{}));
    }

    @Test
    public void occurring_givenOneElement_returnOneEntry(){
        Map<String, Long> actual = ArrayUtility.occurring(new String[]{"Java"});
        Map<String, Long> expected = Map.of("Java", 1L);
        assertEqualsMap(actual, expected);
    }

    @Test
    public void occurring_givenTwoDifferentElements_returnTwoEntries(){
        Map<String, Long> actual = ArrayUtility.occurring(new String[]{"Java", ".Net"});
        Map<String, Long> expected = Map.of("Java", 1L, ".Net", 1L);
        assertEqualsMap(actual, expected);
    }

    @Test
    public void occurring_givenMultipleElements_returnMultipleEntries(){
        Map<String, Long> actual = ArrayUtility.occurring(new String[]{"Java", "Java", ".Net"});
        Map<String, Long> expected = Map.of("Java", 2L, ".Net", 1L);
        assertEqualsMap(actual, expected);
    }

    @Test
    public void maxOccurring_givenEmptyArray_throwArrayIndexOutOfBoundException(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()->ArrayUtility.maxOccurring(new String[]{}));
    }

    @Test
    public void maxOccurring_givenArrayWithOneElement_returnOne(){
        Assertions.assertEquals(new AbstractMap.SimpleEntry<>("Java", 1L), ArrayUtility.maxOccurring(new String[]{"Java"}));
    }

    @Test
    public void maxOccurring_givenArrayWithMultipleElements_returnMaxOccurring(){
        Assertions.assertEquals(new AbstractMap.SimpleEntry<>("Java", 2L), ArrayUtility.maxOccurring(new String[]{".Net", "Java", "Java"}));
    }

    private void assertEqualsMap(Map<String, Long> actual, Map<String, Long> expected){
        for(Map.Entry<String, Long> entry : actual.entrySet()) {
            Assertions.assertEquals(entry.getValue(), expected.get(entry.getKey()));
        }
    }


}