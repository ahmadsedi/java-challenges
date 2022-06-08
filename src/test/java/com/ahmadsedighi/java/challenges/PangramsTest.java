package com.ahmadsedighi.java.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 08/06/2022
 * Time: 18:04
 */

public class PangramsTest {

    @Test
    public void isPangrams_givenPangrams_returnTrue(){
        Assertions.assertTrue(Pangrams.isPangrams("The quick brown fox jumps over the lazy dog"));
    }
    @Test
    public void isPangrams_givenEmpty_returnFalse(){
        Assertions.assertFalse(Pangrams.isPangrams(""));
    }
}
