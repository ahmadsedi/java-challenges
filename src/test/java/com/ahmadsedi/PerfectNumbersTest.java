package com.ahmadsedi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class PerfectNumbersTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isPerfect_given6_returnTrue(){
        Assertions.assertTrue(PerfectNumbers.isPerfect(6));
    }
    @Test
    public void isPerfect_given7_returnFalse(){
        Assertions.assertFalse(PerfectNumbers.isPerfect(7));
    }

    @Test
    public void calcPerfectNumbers_given30_return6_and_28(){
        Assertions.assertEquals(List.of(6, 28), PerfectNumbers.calcPerfectNumbers(30));
    }
}
