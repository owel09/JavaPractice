package SoloLearn.ArrayList;/*
 *Created by User on Oct, 2019 7:46 AM
 ArrayList using Iterator Interface para makaloop sa mga elements
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(3);

        list.add("owelcute");
        list.add("jor");
        list.add("lucas");
        list.add("chelsea");

        Iterator itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
            /*
            Output:
            owelcute
            jor
            lucas
            chelsea
             */
        }
    }
}
