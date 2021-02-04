package Fundamentals.HashMap;

import java.util.HashMap;

public class IterateValuesKey {
    public static void main(String[] args) {

        HashMap<String, Integer> points = new HashMap<>();

        points.put("owel",1);
        points.put("jor",2);
        points.put("lucas",3);

        //Using forEach method
        //Iterating over keys only
        for (String key:points.keySet()
             ) {
            System.out.println("Keys:" +key);
        }
        /*
        Output
        Keys:lucas
        Keys:owel
        Keys:jor
         */

        for (Integer val : points.values()
        ){
            System.out.println("Values:" + val);

        }
        /*
        Output
        Values:3
        Values:1
        Values:2
         */

        //iterate over entries na gumamit ng Entry Interface
        for (HashMap.Entry<String,Integer> entry: points.entrySet()
             ) {
            System.out.println("Key = " + entry.getKey());
            System.out.println("Value = " + entry.getValue());
            /*Output
            Key = lucas
            Value = 3
            Key = owel
            Value = 1
            Key = jor
            Value = 2

             */
        }

    }
}
