package Fundamentals.HashMap;

import java.util.HashMap;

/**
 * Created by 1528394 on 12/12/2019.
 */
public class DuplicateKey {

    public static void main(String[] args) {
        HashMap<String, Integer> points = new HashMap<String, Integer>();

        points.put("Amy",154);
        points.put("Dave",42);
        points.put("Dave",733);

        System.out.println(points.get("Dave"));
        /*
        Output:
        733
        Kapag dinoble mo yung Dave as the key, maooverwrite niya yung value
        na 42
         */

        System.out.println(points.get("Rane"));
        /*
        Output:
        null

        kasi wala naman yung key na Rane
         */
    }
}