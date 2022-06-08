package com.ahmadsedighi.java.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 08/06/2022
 * Time: 17:35
 */

public class AnagramsTest {

    @Test
    public void isAnagram_givenFirstEmpty_returnFalse(){
        Assertions.assertFalse(Anagrams.isAnagram("", "Java"));
    }

    @Test
    public void isAnagram_givenSecondEmpty_returnFalse(){
        Assertions.assertFalse(Anagrams.isAnagram("Java", ""));
    }

    @Test
    public void isAnagram_givenAnagrams_returnTrue(){
        Assertions.assertTrue(Anagrams.isAnagram("silent", "listen"));
    }

    @Test
    public void isAnagram_givenNotAnagrams_returnFalse(){
        Assertions.assertFalse(Anagrams.isAnagram("ae", "bd"));
    }
}
