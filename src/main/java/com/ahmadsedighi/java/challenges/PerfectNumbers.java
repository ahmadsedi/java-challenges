package com.ahmadsedighi.java.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class PerfectNumbers {

    public static boolean isPerfect_(int number){
        int sum = 0;
        for(int i=1; i<number; i++){
            if(number%i==0){
                sum+=i;
            }
        }
        return sum==number;
    }

    public static boolean isPerfect(int number){
        return number == IntStream.range(1, number).filter(n->number%n==0).sum();
    }

    public static List<Integer> calcPerfectNumbers(int number){
        return IntStream.rangeClosed(1, number).filter(n->isPerfect(n)).boxed().collect(Collectors.toList());
    }

    public static List<Integer> calcPerfectNumbers_(int number){
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=number; i++){
            if(isPerfect(i)){
                list.add(i);
            }
        }
        return list;
    }
}
