package com.ahmadsedighi.java.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 13/06/2022
 * Time: 16:30
 */

public class GeneralUtilityTest {
    @Test
    public void convertToString_givenEmptyArray_returnEmptyString(){
        Assertions.assertEquals("", GeneralUtility.convertToString(new int[0]));
    }

    @Test
    public void convertToString_givenArray_returnConcatedElementsAsString(){
        Assertions.assertEquals("141295", GeneralUtility.convertToString(new int[]{1, 4, 1, 2, 9, 5}));
    }

    @Test
    public void selectRandomly_givenEmptyList_returnEmptyList(){
        Assertions.assertEquals(List.of(), GeneralUtility.selectRandomly(List.of()));
    }

    @Test
    public void selectRandomly_givenList_returnNotTheSameList(){
        List<String> list = List.of("1", "4", "2", "1", "5");
        List<String> randomList = GeneralUtility.selectRandomly(list);
        Assertions.assertTrue(randomList.stream().filter(e->!list.contains(e)).findAny().isEmpty());
    }
}
