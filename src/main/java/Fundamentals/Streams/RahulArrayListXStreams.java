package Fundamentals.Streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 *Created by owel on 16/06/2021 10:26 AM
 * Comparison between for loop iteration and streams filter method
 * JUnit lang pang run ko. Walang main method
 * Count the number of names starting with A
 * Print all the names in the ArrayList
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

        there is no life in intermediate operation if there is no terminal operation
        terminal operation will execute only inter intermediate operation (filter) returns true
         */

        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);

        Long d = Stream.of("Adam","Asiong","Anton","Cardo").filter(s->s.startsWith("A")).count();
        System.out.println(d);
    }

    @Test
    public void printNames(){
        ArrayList<String> names = new ArrayList<>();

        names.add("Gojo");
        names.add("Kusigaki");
        names.add("Megumi");
        names.add("Yuji");
        names.add("Oy");
        names.add("Ron");

        //print all names
        for(int i = 0; i < names.size(); i++){

            String s = names.get(i);
            System.out.println(s);
        }

        System.out.println("-------");

        //filter and print names that is greater than 4
        names.stream().filter(s->s.length()>4).forEach(s-> System.out.println(s));

        System.out.println("-------");
        //printing only single result
        names.stream().filter(s->s.length()>4).limit(1).forEach(s-> System.out.println(s));
    }

    @Test
    public void streamMap(){

        //print all names with last letter "a" and capitalize
        Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        System.out.println("------");

        //print all names with first letter "a" and sorted
        //converting Array to List para magamit yung streams
        List<String> nameList = Arrays.asList("Abhijeet","Don","Alekhya","Adam","Rama");
        nameList.stream().filter(s->s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s-> System.out.println(s));

        System.out.println("------");

        Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
                .forEach(s-> System.out.println(s));
    }

    @Test
    public void mergedStream(){

        ArrayList <String> knights = new ArrayList<>();

        knights.add("Asta");
        knights.add("Yuno");
        knights.add("Yami");

        knights.stream().forEach(s-> System.out.println(s));

        String[] ninja = {"Naruto","Sasuke","Sakura"};
        List<String> ninjaList = Arrays.asList(ninja);
        ninjaList.stream().forEach(s-> System.out.println(s));

        System.out.println("------");

        //merging 2 streams and print it sorted alphabetically
        Stream.concat(knights.stream(),ninjaList.stream()).sorted().forEach(s -> System.out.println(s));

        System.out.println("------");

        //check if stream contains string "Naruto"
        Stream<String> newStream = Stream.concat(knights.stream(),ninjaList.stream());
        boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Naruto"));
        System.out.println(flag);
        Assert.assertTrue(flag);
    }

    @Test
    //collect the result returned by the map method or the previous method
    public void streamCollect(){
        List <String> ls = Stream.of("Ichigo","Rukia","Renji").filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(ls.get(0));


    List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
    //get the unique number in the array and sort
    values.stream().distinct().sorted().forEach(s-> System.out.println(s));

    System.out.println("------");

    //get the 3rd index of the sorted list
    List<Integer> sortedList = values.stream().distinct().sorted().collect(Collectors.toList());
    System.out.println(sortedList.get(2));

    }



}
