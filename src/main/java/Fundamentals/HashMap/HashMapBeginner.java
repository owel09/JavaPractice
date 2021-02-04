package Fundamentals.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapBeginner {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1,"owel");
        hashMap.put(2,"jor");
        hashMap.put(3,"lucas");
        hashMap.put(4,"chelsea");


        //Displaying contents using Iterator and Set
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("key is: " + mentry.getKey() + " & Value is: " + mentry.getValue());
        }

        /*Output
        key is: 1 & Value is: owel
        key is: 2 & Value is: jor
        key is: 3 & Value is: lucas
        key is: 4 & Value is: chelsea

        ginamit yung iterator tsaka set para iprint yun key at value. pero paano?
         */




    }
}
