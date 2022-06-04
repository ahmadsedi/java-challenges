package com.ahmadsedighi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 02/06/2022
 * Time: 22:55
 */

public class ChecksumTest {

    @Test
    public void calcChecksum_given11111_return5(){
        Assertions.assertEquals(5, Checksum.calcChecksum("11111"));
    }

    @Test
    public void calcChecksum_given87654321_return0(){
        Assertions.assertEquals(0, Checksum.calcChecksum("87654321"));
    }
}
