package Fundamentals.Set;

import java.util.HashSet;
import java.util.Set;

/*
Set Using methods
-isEmpty()
-size()
-contains()

 *Created by owel on 07/01/2020 8:09 AM
 */
public class CalliSetSimpleOperation {

    public static void main(String[] args) {

        Set<String> city = new HashSet<>();

        System.out.println("Is the city empty? " + city.isEmpty());

        city.add("Manila");
        city.add("Kuala Lumpur");
        city.add("Tokyo");
        city.add("Rio Grande");
        city.add("Paris");

        System.out.println("The size of the city is: " + city.size());

        String cityName = "Moscow";

        if (city.contains(cityName)){
            System.out.println("City of " + cityName + " is in the list");
        } else {
            System.out.println(cityName + " is not in the list");
        }
    }
}
