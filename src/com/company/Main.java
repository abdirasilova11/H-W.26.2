package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    private static Object City;

    public static void main(String[] args) {

        Set<City> citySet = new TreeSet<>();
        citySet.add(new City(6, "Canada"));
        citySet.add(new City(9,"Bishkek"));
        citySet.add(new City(3, "Moscow"));
        citySet.add(new City(99, "New-York"));
        citySet.add(new City(5, "Boston"));
        citySet.add(new City(2," Dubai"));
        for (City c: citySet) {
            if (c.getCode() % 2 == 1){
                Set<City> citySet0 = new TreeSet<>();
                citySet0.add(c);
                System.out.println(citySet0);
            }
        }
    }
}
