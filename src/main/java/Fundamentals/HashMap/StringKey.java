package Fundamentals.HashMap;

import java.util.HashMap;
/*
Simple sample ng HashMap kung saan ginamit ko yung String "owel" as key para ma-idisplay yung value
ng owel
 */

public class StringKey {
    public static void main(String[] args) {

        HashMap<String, Integer> points = new HashMap<>();

        points.put("owel",1);
        points.put("jor",2);
        points.put("lucas",3);

        System.out.println(points.get("owel"));
        /*Output
        1
         */
    }
}
