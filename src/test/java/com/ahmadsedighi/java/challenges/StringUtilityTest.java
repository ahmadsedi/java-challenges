package com.ahmadsedighi.java.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 09/06/2022
 * Time: 15:49
 */

public class StringUtilityTest {

    @Test
    public void extractDigits_givenEmpty_returnZero(){
        Assertions.assertEquals(Optional.empty(), StringUtility.extractDigits(""));
    }

    @Test
    public void extractDigits_givenNotEmptyNoDigit_returnZero(){
        Assertions.assertEquals(Optional.empty(), StringUtility.extractDigits("Java"));
    }

    @Test
    public void extractDigits_givenNotEmptyWithDigits_returnLongValue(){
        Assertions.assertEquals(Optional.of(18L), StringUtility.extractDigits("Java 1.8"));
    }
}
