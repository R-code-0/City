package pkg;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        City[] cities = {
                new City(13,7,"asd",""),
                new City(22,7,"asd",""),
                new City(5,6,"zxc","asd"),
                new City(5,6,"zxc","asd"),
                new City(8,6,"sd","dscc"),
                new City(90,6,"sd","dscc"),
                new City(990,8,"asd","sad")
        };
        TreeSet<City> cityTreeSet = new TreeSet<>();
        for (City city : cities) {
            if (city.getCode()%2==0) cityTreeSet.add(city);
        }
        for (City city : cityTreeSet) {
            System.out.println(city);
        }
    }
}