package SoloLearn.Set;/*
 *Created by owel on 20/12/2019 12:39 AM
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        //Set demo using Hashset
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Geeks");
        hashSet.add("For");
        hashSet.add("Geeks");
        hashSet.add("Example");
        hashSet.add("Set");

        System.out.println(hashSet);
        /*
        Output:
        [Set, Example, Geeks, For]

        hindi siya magkakasunod
         */

        //Set demo using treeset
        Set <String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);

        /*
        Output:
        [Example, For, Geeks, Set]

        sorted set using treeset and Geeks is missing
         */

    }

}
