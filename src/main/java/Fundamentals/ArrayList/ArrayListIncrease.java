package Fundamentals.ArrayList;/*
 *Created by User on Oct, 2019 8:23 AM
 */

import java.util.ArrayList;

public class ArrayListIncrease {

    public static void main(String[] args) {

        ArrayList <String> colors = new ArrayList<String>(3);
        /*
        initial size nya is 3 pero pwede ito lumaki
         */

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.remove("Green");
        colors.add("Pink");
        colors.add("Yellow");

        System.out.println(colors.get(1));
        System.out.println(colors.contains("Orange"));
        System.out.println(colors.size());
        System.out.println(colors);

        /*
        Output:
        Blue
        true
        5
        [Red, Blue, Orange, Pink, Yellow]
         */


    }
}
