package SoloLearn.LinkedList;

import java.util.LinkedList;

public class LinkedListReverseString {

    public static void main(String[] args) {

        LinkedList <String> linkedList = new LinkedList<String>();

        linkedList.add("Owel");
        linkedList.add("cute");
        linkedList.add("talaga");

        System.out.println("linkedList before reverse: " + linkedList);
        linkedList = reverseLinkedList(linkedList);
        System.out.println("linkedList after reverse: " + linkedList);
        /*
        Output
        linkedList before reverse: [Owel, cute, talaga]
        linkedList after reverse: [talaga, cute, Owel]
         */
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> revList){

        LinkedList <String> revLinkedList = new LinkedList<String>();

        for(int i=revList.size()-1 ; i>=0 ; i--){
            revLinkedList.add(revList.get(i));

        }

        return revLinkedList;

    }
}
