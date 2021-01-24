package SoloLearn.ArrayList;/*
 *Created by owel on 02/11/2019 9:17 AM

 Vector is a dynamic list that will increase automatically 100%
 -this is thread safe because it synchronized
 -since it is thread safe this is slow
 ArrayList will increase automatically 50%
 -fast because not threadsafe
 */

import java.util.ArrayList;
import java.util.Vector;

public class VectorVSArrayList {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>();
        v.add(2);
        v.add(27);
        v.add(22);
        v.add(21);
        v.add(26);
        v.add(22);
        v.add(12);

        v.remove(2);
        /*
        mawawala yung 22
         */
        System.out.println(v.capacity());

        v.forEach(i-> System.out.println(i));

        System.out.println("-----------------------------");

        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(3);
        a.add(23);
        a.add(33);
        a.add(35);
        a.add(36);
        a.add(31);

        a.forEach(i-> System.out.println(i));
    }
}
