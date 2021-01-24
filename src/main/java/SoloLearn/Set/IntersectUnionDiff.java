package SoloLearn.Set;/*

/**
 * Created by 1528394 on 12/17/2019.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectUnionDiff {

    public static void main(String[] args) {

        Set <Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer []{1, 3, 2, 4, 8, 9, 0}));
        Set <Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer []{1, 3, 7, 5, 4, 0, 7, 5}));

        //To find union
        Set <Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union of the two Set");
        System.out.println(union);

        //To find intersection
        Set <Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of two Set");
        System.out.println(intersection);

        //To find difference
        Set <Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Difference of two Set");
        System.out.println(difference);

        /*
        Output:
        Union of the two Set
        [0, 1, 2, 3, 4, 5, 7, 8, 9]
        Intersection of two Set
        [0, 1, 3, 4]
        Difference of two Set
        [2, 8, 9]
         */
    }
}