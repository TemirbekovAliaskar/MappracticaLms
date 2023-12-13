package task2;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {


        Set<City> cityMap = new HashSet<>();
        cityMap.add(new City(100,"Bishkek"));
        cityMap.add(new City(230,"Naryn"));
        cityMap.add(new City(111,"Talas"));

        System.out.println(cityMap);

        TreeSet<City> cities = new TreeSet<>();
        boolean isTrue = false;
        for (City city : cityMap) {
            if (city.getCode() % 2 == 0){
                cities.add(city);
                isTrue = true;
            }
        }
        if (!isTrue){
            System.out.println("НЕ четные !");
        }
        System.out.println(cities);
    }
}
