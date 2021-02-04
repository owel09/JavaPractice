package Fundamentals.ArrayList;

import java.util.ArrayList;

/*
ArrayList
-> store object lang talaga
primitive type kasi yung "int" at class yung "Integer"
kung gusto mo magstore ng int sa ArrayList gamitin mo yung wrapper class
-> can contain dupliacate values
 */


public class ArrayListSample {

    public static void main(String[] args) {

        int normalArray [] = {1,2,3};

        ArrayList <Integer> arrayListSample = new ArrayList<Integer>(5);
        /*
        generic declaration ng ArrayList where naka-specify yung type ng Array. Dito naka Integer mode sya
        kaya generic declaration kasi madaling gamitin sa typecasting
         */

        arrayListSample.add(1);
        arrayListSample.add(3);
        arrayListSample.add(341);
//        arrayListSample.add(34);
//        arrayListSample.add(12);

        for (Integer x : arrayListSample){
            System.out.println(x);
        }
        /*sample ng arrayList na gumamit ng for loop na
        functional programing para maprint lahat ng value sa arrayList
        Output:
        1
        3
        341
        34
        12
         */

        System.out.println("size = " + arrayListSample.size());
        /*size ng arrayList: 5
        size ito ng current values na nasa array at hindi yun
        initial "5" na dineclare natin
         */

        arrayListSample.remove(2);

        for (Integer x : arrayListSample){
            System.out.println(x);
        }
        System.out.println("size = " + arrayListSample.size());
        /*Ipprint lang ulit yun mga value pero 4 na lang sila
         */

        arrayListSample.set(0,100);
        for (Integer x : arrayListSample){
            System.out.println(x);
        }
        System.out.println("size = " + arrayListSample.size());
        /*Papalitan yun value sa index 0 ng 100
         */

        arrayListSample.trimToSize();
        for (Integer x : arrayListSample){
            System.out.println(x);
        }
        System.out.println("size = " + arrayListSample.size());
        /*
        Trimming is cutting the size of array depende kung ilang elements meron sya.
        If you initialize it as 5. At nagbura ka ng element. Magiging 3 na lang
         */

    }
}
