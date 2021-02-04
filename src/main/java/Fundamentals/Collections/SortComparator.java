package Fundamentals.Collections;/*
 *Created by owel on 27/12/2019 7:01 AM
 *Comparator - yung magdedefine ng logic kung paano sila magsosort
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortComparator {

    public static void main(String[] args) {

        List<Integer> owelList = new ArrayList<>();

        owelList.add(785);
        owelList.add(234);
        owelList.add(451);
        owelList.add(343);
        owelList.add(452);

        System.out.println(owelList);

        System.out.println("--------------------------------");
        //NORMAL SORTING USING THE LIST

        //Gumamit ako ng Collections class na may sort method
        Collections.sort(owelList);

        //enhanced for loop para maprint siya na walang braces at pababa
        for(int i : owelList){
            System.out.println(i);
        }

        System.out.println("--------------------------------");
        //SORTING THE LAST DIGIT USING COMPARATOR AND MODULUS

        Comparator<Integer> integerComparator = new ComparatorImple();
        /*
        declaring Comparator Interface para maging class at maging object
        kailangan gumawa ka ng class CompImple tapos dun mo Implement yun mga
        methods ng comparator
        */

        Collections.sort(owelList,integerComparator);

        for(int x : owelList){
            System.out.println(x);
        }


    }
}
