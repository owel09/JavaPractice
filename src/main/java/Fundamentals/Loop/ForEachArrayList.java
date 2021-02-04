package Fundamentals.Loop;/*
 *Created by User on Oct, 2019 7:54 AM
 
 ArrayList elements using for-each loop
 */

import java.util.ArrayList;

public class ForEachArrayList {

    public static void main(String[] args) {

        ArrayList <String> list1 = new ArrayList<>(3);
        
        list1.add("owelcuteparin");
        list1.add("jor");
        list1.add("lucas");
        list1.add("chelsea");

        //Enhance for loop
        for (String obj: list1) {
            System.out.println(obj);

            /*
            Output:
            owelcuteparin
            jor
            lucas
            chelsea
             */
            
        }
    }
}
