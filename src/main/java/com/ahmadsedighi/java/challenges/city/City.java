package com.ahmadsedighi.java.challenges.city;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 09/06/2022
 * Time: 18:21
 */

public class City {
    private final String name;
    private final boolean capital;
    private final long population;
    private final Country country;

    public City(String name, boolean capital, long population, Country country) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public boolean isCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public Country getCountry() {
        return country;
    }
}
