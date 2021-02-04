package Fundamentals.MultiThreading;/*
 *Created by User on Sep, 2019 7:46 PM
 */

public class Lamborghini extends TheUltimateCarRace{
    @Override
    public void makeSound() {
        System.out.println("The Lamborghini is taking off on path No. 1");
        System.out.println("_______________________________________");
        System.out.println("1| :::##>");
        System.out.println("_______________________________________");

        for(int i = 0; i < 3 * Math.random() ; i++){

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Lamborghini");
            }
        }
        System.out.println("Lambrr Lambrr Lamborrrghini");
        System.out.println("The Lamborghini has crossed the finish line!");
        System.out.println("_______________________________________");
        System.out.println("1| :::::::::::::::::::::::::::::::::##>");
        System.out.println("_______________________________________");


    }
}



