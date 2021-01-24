package SoloLearn.Lambda;/*
 *Created by owel on 30/10/2019 7:36 AM
 */

import java.util.ArrayList;

public class ForEachLambda {

    public static void main(String[] args) {

        ArrayList <Integer> values = new ArrayList<>();

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        System.out.println(values);
        /*
        Output:
        [1, 2, 3, 4, 5]
         */

        System.out.println("---------------------------------");

        /*
        External Loops - outside siya ang Collections at sa outside kinukuha natin
        yung mga values
         */
        for (int i=0 ; i<=values.size()-1 ; i++){
            System.out.println(values.get(i));
            /*
            Output:
            1
            2
            3
            4
            5
             */
        }

        System.out.println("---------------------------------");

        for (int o: values
             ) {
            System.out.println(o);
            /*
            Output:
            1
            2
            3
            4
            5
             */

        }


        System.out.println("---------------------------------");

        /*
        forEach method is internal part looping in collection kaya mas mabilis sya kesa
        sa mga normal looping
         */
        values.forEach(p -> System.out.println(p));

    }
}
