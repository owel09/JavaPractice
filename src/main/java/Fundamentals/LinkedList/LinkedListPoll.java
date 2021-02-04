package Fundamentals.LinkedList;

import java.util.LinkedList;

public class LinkedListPoll {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("Geeks1");
        list.add("4");
        list.add("Geeks2");
        list.add("8");

        System.out.println("initial look of the list: " + list);
        System.out.println("list poll(): " +list.poll());
        System.out.println("list after using poll():" +list);

        /*
        Output
        initial look of the list: [Geeks1, 4, Geeks2, 8]
        list poll(): Geeks1
        list after using poll():[4, Geeks2, 8]
         */


    }
}
