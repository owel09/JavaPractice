package SoloLearn.MultiThreading;/*
 *Created by User on Sep, 2019 7:43 PM
 */

public class Porsche extends TheUltimateCarRace {
    @Override
    public void makeSound() {
        System.out.println("The Porsche is taking off on path No. 1");
        System.out.println("_______________________________________");
        System.out.println("1| :::##>");
        System.out.println("_______________________________________");

        for(int i = 0; i < 3 * Math.random() ; i++){

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Porsche");
            }
        }
        System.out.println("Porr Porr Porrschee");
        System.out.println("The Porsche has crossed the finish line!");
        System.out.println("_______________________________________");
        System.out.println("1| :::::::::::::::::::::::::::::::::##>");
        System.out.println("_______________________________________");


    }
}
