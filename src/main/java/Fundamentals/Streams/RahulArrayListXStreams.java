package Fundamentals.Streams;

import org.junit.Test;

import java.util.ArrayList;

/*
 *Created by owel on 16/06/2021 10:26 AM
 * Comparison between for loop iteration and streams filter method
 * JUnit lang pang run ko. Walang main method
 * Count the number of names starting with A
 */
public class RahulArrayListXStreams {

    @Test
    public void countA(){

        ArrayList<String> names = new ArrayList<>();

        names.add("Adam");
        names.add("Asiong");
        names.add("Anton");
        names.add("Cardo");

        int count = 0;

        for(int i=0; i<names.size(); i++){

            //kailangan mo ng pang grab ng element
            String grab = names.get(i);
            if (grab.startsWith("A")){
                count++;
            }

        }

        System.out.println(count);

    }

    @Test
    public void streamFilter(){

        ArrayList<String> names = new ArrayList<>();

        names.add("Adam");
        names.add("Asiong");
        names.add("Anton");
        names.add("Cardo");

        /*
        s - parameter scans all the list in the ArrayList
        .filter - intermediate operator
        .count - terminal operator
         */

        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);
    }
}
