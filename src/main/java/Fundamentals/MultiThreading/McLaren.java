package Fundamentals.MultiThreading;/*
 *Created by User on Sep, 2019 7:48 PM
 */

public class McLaren extends TheUltimateCarRace{

    @Override
    public void makeSound() {
        System.out.println("The McLaren is taking off on path No. 1");
        System.out.println("_______________________________________");
        System.out.println("1| :::##>");
        System.out.println("_______________________________________");

        for(int i = 0; i < 3 * Math.random() ; i++){

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("McLaren");
            }
        }
        System.out.println("McLarrr McLarrr McLaaaaaaren");
        System.out.println("The McLaren has crossed the finish line!");
        System.out.println("_______________________________________");
        System.out.println("1| :::::::::::::::::::::::::::::::::##>");
        System.out.println("_______________________________________");


    }

}
