import java.util.*;
public class Country {
    private String name;
    private ArrayList<City> cities;

    Country(ArrayList<City> cities, String name) {
        this.name = name; 
        this.cities = cities;
    }

    public void showCity(){
        for(City city : cities){
            System.out.println(city);
        }
    }

    public String showName(){
        return name;
    }
}
