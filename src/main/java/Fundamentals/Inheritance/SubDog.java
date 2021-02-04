package Fundamentals.Inheritance;

public class SubDog extends SuperDog {
    String color = "Black";

    void printColor(){
        System.out.println("The color of the Dog is: " + color);
        System.out.println("The color of the Dog is: " + super.color);

    }
}
