package Fundamentals.Maps;/*
 *Created by owel on 07/11/2019 8:39 AM
Hashtable Methods
 -clone() and clear()

 */

import java.util.Hashtable;
import java.util.Map;

public class HashtableMethods {

    public static void main(String[] args) {

        Hashtable <Integer, String> h = new Hashtable<Integer, String>();

        Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();

        h.put(1,"id");
        h.put(2,"name");
        h.put(3,"citizen");

        h1 = (Hashtable<Integer, String>)h.clone();
        /*
        maclone or macocopy yun value ng h table sa h1 table
         */

        System.out.println(h);
        System.out.println(h1);
        /*
        Output:
        {3=citizen, 2=name, 1=id}
        {3=citizen, 2=name, 1=id}
         */

        System.out.println("--------------------------------");
        h.clear();
        System.out.println(h);
        System.out.println(h1);
        /*
        Output:
        {}
        {3=citizen, 2=name, 1=id}

        mawawala yung value ng h table kasi nagclear tayo pero naretain pa rin yun sa h1
         */

        System.out.println("--------------------------------");

        Map<Integer,String> table = new Hashtable<>();

        table.put(10,"books");
        table.put(20,"mouse");
        table.put(30,"keyboard");

        System.out.println("hashtable table: " + table.toString());

        table.computeIfAbsent(15, k -> "newBook");
        table.computeIfAbsent(25, k -> "mouse");

        System.out.println("New hashtable: " + table.toString());


//        todo: what is Hashtable na nagimplement sa map? https://www.geeksforgeeks.org/hashtable-in-java/

    }
}
