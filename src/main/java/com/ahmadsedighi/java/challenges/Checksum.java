package com.ahmadsedighi.java.challenges;

import java.util.stream.IntStream;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 02/06/2022
 * Time: 22:52
 */

public class Checksum {
    public static int calcChecksum(String input){
        return IntStream.range(0, input.length()).map(n->(n+1)*Integer.parseInt(String.valueOf(input.charAt(n)))).sum()%10;
    }
}
