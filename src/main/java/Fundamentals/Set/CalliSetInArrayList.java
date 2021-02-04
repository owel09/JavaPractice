package Fundamentals.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
COMBINE ARRAYLIST AND SET USING addAll();
Gagamit ng HashSet(Collection c) para maconvert yung List sa HashSet
 *Created by owel on 07/01/2020 7:47 AM
 */
public class CalliSetInArrayList {
    public static void main(String[] args) {

        List<Integer> divisibleBy3 = new ArrayList<>();
        divisibleBy3.add(3);
        divisibleBy3.add(6);
        divisibleBy3.add(9);
        divisibleBy3.add(12);
        divisibleBy3.add(15);

        List<Integer> divisibleBy5 = new ArrayList<>();
        divisibleBy5.add(5);
        divisibleBy5.add(10);
        divisibleBy5.add(15);
        divisibleBy5.add(20);
        divisibleBy5.add(25);

        //Declaring Set combineDivBy5and3 sa Set
        Set<Integer> combineDivBy5and3 = new HashSet<>(divisibleBy5);

        //Gamit yung combineDivBy5and3 set ipapasok natin yun divisibleBy3 using addall()
        combineDivBy5and3.addAll(divisibleBy3);

        System.out.println(combineDivBy5and3);

    }
}
