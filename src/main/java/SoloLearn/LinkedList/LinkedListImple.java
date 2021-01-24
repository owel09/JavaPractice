package SoloLearn.LinkedList;/*
 *Created by owel on 04/12/2019 9:01 AM

ArrayList vs LinkedList
->Sa ArrayList pwede mo baguhin yung size ng Array during runtime
->this is better for storing and accessing data

->Sa LinkedList di mo pwede initialize yung size each node is linked to the other node,
meaning it contains the address of the next and previous node.
->better for manipulating data
 */


import java.util.LinkedList;

public class LinkedListImple {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        //Adding elements in LinkedList
        list.add("A");
        list.add("B");
        list.addLast("C");
        list.addFirst("D");
        list.add(0,"E");


        System.out.println(list);
        /*
        [E, D, A, B, C]
         */

        //Finding if element E is in the LinkedList
        boolean status = list.contains("E");

        if (status)
            System.out.println("LinkList contains the element E");
        else
            System.out.println("LinkList doesn't contain E");

        //Size of the LinkList
        int size = list.size();
        System.out.println("The size of the LinkedList is: " + size);

        //Get the element and set a new value
        Object objGetter = list.get(2);
        System.out.println("Element returned by get(): " + objGetter);

        list.set(2,"Y");
        System.out.println("LinkedList after change" + list);

    }
}
