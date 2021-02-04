package Fundamentals.MultiThreading;/*
 *Created by User on Sep, 2019 7:37 PM
 */

public class Ferrari extends TheUltimateCarRace {
    @Override
    public void makeSound() {
        System.out.println("The Ferrari is taking off on path No. 1");
        System.out.println("_______________________________________");
        System.out.println("1| :::##>");
        System.out.println("_______________________________________");

            for(int i = 0; i < 3 * Math.random() ; i++){

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Ferrari");
                }
            }
        System.out.println("Ferr Ferr Ferrariii");
        System.out.println("The Ferrari has crossed the finish line!");
        System.out.println("_______________________________________");
        System.out.println("1| :::::::::::::::::::::::::::::::::##>");
        System.out.println("_______________________________________");


    }
}

