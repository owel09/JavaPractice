/*
Map Interface
Entry Interface - this will hold the value of the entry. This is a interface in map. Interface inside interface
 */

package SoloLearn.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TeluskoPhonebook {

    public static void main(String[] args) {

        HashMap<String,String> phonebook = new HashMap<String, String>();

        phonebook.put("professor","111-111"); //this is an entry
        phonebook.put("tokyo","222-222");
        phonebook.put("moscow","333-333");

        System.out.println(phonebook.get("professor"));


        //As map how can I get the keys? keySet() will give all the keys

        //Using Set to get all the keys in the map
        Set <String> keys = phonebook.keySet();

        //Displays keys and values using enhanced for loop
        for(String i:keys)
            System.out.println(i + ":" + phonebook.get(i));
        /*
        tokyo:222-222
        professor:111-111
        moscow:333-333
         */


        //Map.Entry interface using entrySet() method that will give you the set of entry yung key at value na agad
        Set <Map.Entry<String,String>> values = phonebook.entrySet();

        for(Map.Entry<String,String> e :values){

            System.out.println(e.getKey() + " : " + e.getValue()    );
            e.setValue("III");
        }


    }
}
