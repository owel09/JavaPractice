package SoloLearn.Lambda;/*
 *Created by owel on 02/11/2019 8:38 AM

 Vector vs ArrayList
 https://www.youtube.com/watch?v=4BWmtZQSedU

 Demo kung paano gamitin yung ListIterator na may reverse direction
 si Iterator kasi forward direction lang siya
 */

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorEnumInterface {

    public static void main(String[] args) {

        Vector <Integer> vector =  new Vector<Integer>();

        vector.add(1);
        vector.add(2);
        vector.add(3);

        ListIterator lit = vector.listIterator();

        System.out.println("In Forward direction");

        while (lit.hasNext()){
            System.out.print(lit.next() + " ");
        }
        /*
        Output:
        In Forward direction
        1 2 3
        kapag wala yung .next() mag-iinfinite loop
         */

        System.out.println("\nIn Backward direction");

        while (lit.hasPrevious()){
            System.out.print(lit.previous() + " ");
        }

        System.out.println("\nEnumeration Interface");

        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement() + " ");
            /*
            Output:
            Enumeration Interface
            1 2 3
            Iterator can remove elements na wala sa Enumeration. Parang wala syang masyadong
            use kasi one by one yun pagretrive ng element
             */
        }

    }
}
