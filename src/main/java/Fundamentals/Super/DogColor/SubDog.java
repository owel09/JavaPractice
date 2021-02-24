package Fundamentals.Super.DogColor;

public class SubDog extends SuperDog {
    String color = "Black";

    void printColor(){
        System.out.println("The color of the Dog in SubDog is: " + color);

        //super refers to the Super Class attributes and methods
        System.out.println("The color of the Dog in SuperDog is: " + super.color);


    }
}
