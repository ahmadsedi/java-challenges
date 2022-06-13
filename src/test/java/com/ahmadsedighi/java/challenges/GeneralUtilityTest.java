package com.ahmadsedighi.java.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
