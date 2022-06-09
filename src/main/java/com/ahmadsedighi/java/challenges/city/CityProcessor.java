package com.ahmadsedighi.java.challenges.city;

import java.util.*;
import static java.util.stream.Collectors.*;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 09/06/2022
 * Time: 18:23
 */

public class CityProcessor {

    public static Map<Country, List<City>> groupByCountry(List<City> cities){
        return cities.stream().collect(groupingBy(City::getCountry));
    }

    public static List<City> findCapitals(List<City> cities){
        return cities.stream().filter(City::isCapital).collect(toList());
    }

    public static Optional<Long> totalPopulation(List<City> cities){
        return cities.stream().map(City::getPopulation).reduce(Long::sum);
    }

    public static List<Country> findCountriesWithCrowdedCities(List<City> cities, long population){
        return cities.stream().filter(city -> city.getPopulation()>=population).map(City::getCountry).distinct().collect(toList());
    }

    public static String countryNames(List<City> cities){
        return cities.stream().map(City::getName).collect(joining(", "));
    }

    public static Optional<City> popular(List<City> cities){
        Comparator<City> cityComparator = Comparator.comparingLong(City::getPopulation);
        return cities.stream().max(cityComparator);
    }

    public static OptionalLong maxPopulation(List<City> cities){
        return cities.stream().mapToLong(City::getPopulation).max();
    }

    public static Map<Boolean, List<City>> partitionByCapital(List<City> cities){
        return cities.stream().collect(partitioningBy(City::isCapital));
    }

    public static Map<Country, Long> populationOfCountries(List<City> cities){
        return cities.stream().collect(groupingBy(City::getCountry, summingLong(City::getPopulation)));
    }

    public static Map<Country, City> crowdedCityByCountry(List<City> cities){
        return cities.stream().collect(groupingBy(City::getCountry, collectingAndThen(maxBy(Comparator.comparingLong(City::getPopulation)), Optional::get)));
    }

}
