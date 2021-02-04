package Fundamentals.ArrayList;/*
 *Created by User on Oct, 2019 8:12 AM

 ArrayList na gumamit ng iba't ibang traversing methods sa elements
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTraverse {


    public static void main(String[] args) {

        ArrayList <String> traverveList = new <String> ArrayList(3);

        traverveList.add("owelcutetraverse");
        traverveList.add("jor");
        traverveList.add("lucas");
        traverveList.add("chelsea");


        System.out.println("Traversing thru 'List Iterator'");
        /*
        List Iterator para magreverse yung pagprint ng list
         */

        ListIterator <String> itr = traverveList.listIterator(traverveList.size());
        /*
        listIterator - method pala ito sa ArrayList, kala ko variable
         */

        while (itr.hasPrevious()){
            String str = itr.previous();
            System.out.println(str);
            /*
            Output:
            Traversing thru 'List Iterator'
            chelsea
            lucas
            jor
            owelcutetraverse

             */

        }

        System.out.println("---------------------------------------------------");

        System.out.println("Traversing thru loop");

        for(int i=0; i<traverveList.size(); i++){
            System.out.println(traverveList.get(i));
            /*
            method pala yung get() sa ArrayList
             */

        }

        System.out.println("---------------------------------------------------");

        System.out.println("Traversing thru forEach() method");

        traverveList.forEach(a->{
            System.out.println(a);
        });



    }


}
