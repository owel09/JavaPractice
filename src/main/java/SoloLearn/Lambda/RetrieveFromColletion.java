package SoloLearn.Lambda;/*
 *Created by owel on 31/10/2019 8:29 AM
 How to Retrieve values in collections
 -Iterator Interface
 -ForEach method


 //todo: https://www.geeksforgeeks.org/retrieving-elements-from-collection-for-each-iterator-listiterator-enumerationiterator/

 */

import java.util.HashSet;
import java.util.Iterator;

public class RetrieveFromColletion {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("tokyo");
        hs.add("nairobi");
        hs.add("lisbon");

        Iterator itr = hs.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
            /*
            Output:
            tokyo
            lisbon
            nairobi

            dapat naka itr.next pala. Mag-infinite loop kasi
             */
        }

        System.out.println("---------------------------------");

        hs.forEach(i -> System.out.println(i));
        /*
        sa forEach method automatic na nagiging element yun i.
        siya yung papasukan ng mga values ng List
         */





    }
}
