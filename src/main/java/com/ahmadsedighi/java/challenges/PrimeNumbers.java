package com.ahmadsedighi.java.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 02/06/2022
 * Time: 22:17
 */

public class PrimeNumbers {
    public static boolean isPrime(int number){
//        return IntStream.rangeClosed(2, (int)Math.sqrt(number)).filter(n->number%n==0).findFirst().isEmpty();
        return IntStream.rangeClosed(2, (int)Math.sqrt(number)).noneMatch(n->number%n==0);
    }

    /**
     * Accepts a decimal number and partitions all prime and not-prime numbers.
     *
     * @param n represents the upper bound of the list.
     *
     * @return a map of prime and not-prime numbers to n.
     */
    public static Map<Boolean, List<Integer>> groupByPrime(int n){
        if(n<=2){
            throw new IllegalArgumentException("number can not be less than two");
        }
        return IntStream.rangeClosed(2, n).boxed().collect(Collectors.partitioningBy(PrimeNumbers::isPrime));
    }

    public static List<Integer> calcPrimesUpTo(int number){
        return IntStream.rangeClosed(2, number).filter(PrimeNumbers::isPrime).boxed().collect(Collectors.toList());
    }

    public static List<PrimePair> primeTwins(int limit){
        return IntStream.rangeClosed(2, limit).filter(n->{return isPrime(n)&&isPrime(n+2);}).boxed().map(n->new PrimePair(n, n+2)).collect(Collectors.toList());
    }

    static class PrimePair{
        private int a, b;
        PrimePair (int a, int b){
            this.a=a;
            this.b = b;
        }
        public String toString(){
            return a+"="+b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public boolean equals(Object object){
            PrimePair that = (PrimePair) object;
            if((that.a==this.a && that.b==this.b)||
                    (that.a==this.b && that.b==this.a)){
                return true;
            }
            return false;
        }
    }

}
