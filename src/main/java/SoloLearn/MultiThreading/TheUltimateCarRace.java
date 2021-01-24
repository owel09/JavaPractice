package SoloLearn.MultiThreading;/*
 *Created by User on Sep, 2019 7:13 PM
 */

public class TheUltimateCarRace implements Runnable{
    /*
    TheUltimateCarRace implement Runnable para yung mga subclasses ay makagawa din
    ng thread nila
     */
    public void run(){
        makeSound();
    }

    public void makeSound(){
        System.out.println("Brr....");
    }
    /*
    makeSound method will use polymorphism para mavisualize yung mga events sa code.
    All car classes will inherit the run method from TheUltimateCarRace super class,
    using polymorph different makeSound will be executed
     */
}



