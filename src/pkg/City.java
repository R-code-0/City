package pkg;

import java.util.Objects;

public class City implements Comparable<City>{
    private int code , rating;
    private String name, desc;

    public City(int code, int rating, String name, String desc) {
        this.code = code;
        this.rating = rating;
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "City code = %d, rating = %d, name = %s, desc = %s".formatted(code, rating, name, desc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return code == city.code && rating == city.rating && Objects.equals(name, city.name) && Objects.equals(desc, city.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, rating, name, desc);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    @Override
    public int compareTo(City o) {
        return o.code - code;
    }
}
