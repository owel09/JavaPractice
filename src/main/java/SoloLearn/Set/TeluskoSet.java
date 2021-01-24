package SoloLearn.Set;/*
 *Created by owel on 19/12/2019 7:13 AM

 Showing set doesn't support duplicate values
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TeluskoSet {

    public static void main(String[] args) {

        Set<Integer> values = new HashSet<>();

        System.out.println(values.add(5));
        System.out.println(values.add(6));
        System.out.println(values.add(9));
        System.out.println(values.add(6));


        for(int i : values){
            System.out.println(i);
        }
        /*
        Output:
        true
        true
        true
        false
        5
        6
        9

        false kasi di naman nag-accept si Set ng boolean.
         */

        //kung gusto mo ascending order yung ma-print pwede ka gumamit ng treeSet

        Set<Integer> values1 = new TreeSet<>();

        System.out.println(values1.add(2));
        System.out.println(values1.add(1));
        System.out.println(values1.add(3));
        System.out.println(values1.add(2));

        for (int x : values1){
            System.out.println(x);
        }
        /*
        Output:
        true
        true
        true
        false
        1
        2
        3

        naging sunod sunod yung pagprint ng numbers
         */


    }
}
