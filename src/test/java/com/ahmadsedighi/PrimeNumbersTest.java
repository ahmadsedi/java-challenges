package com.ahmadsedighi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 02/06/2022
 * Time: 22:20
 */

public class PrimeNumbersTest {
    @Test
    public void isPrime_given2_returnTrue(){
        Assertions.assertTrue(PrimeNumbers.isPrime(2));
    }
    @Test
    public void isPrime_given3_returnTrue(){
        Assertions.assertTrue(PrimeNumbers.isPrime(3));
    }
    @Test
    public void isPrime_given4_returnTrue(){
        Assertions.assertFalse(PrimeNumbers.isPrime(4));
    }

    @Test
    public void calcPrimesUpTo_given10_return2_3_5_7(){
        Assertions.assertEquals(List.of(2, 3, 5, 7), PrimeNumbers.calcPrimesUpTo(10));
    }

    @Test
    public void calcPrimesUpTo_given2_returnEmpty(){
        Assertions.assertEquals(1, PrimeNumbers.calcPrimesUpTo(2).size());
    }

    @Test
    public void primeTwins_given50_3and5_5and7_11and13_17and19_29and31_41and43(){
        List<PrimeNumbers.PrimePair> expected = List.of(new PrimeNumbers.PrimePair(3, 5),
                new PrimeNumbers.PrimePair(5, 7),
                new PrimeNumbers.PrimePair(11, 13),
                new PrimeNumbers.PrimePair(17, 19),
                new PrimeNumbers.PrimePair(29, 31),
                new PrimeNumbers.PrimePair(41, 43));
        Assertions.assertEquals(expected, PrimeNumbers.primeTwins(50));
    }
}
