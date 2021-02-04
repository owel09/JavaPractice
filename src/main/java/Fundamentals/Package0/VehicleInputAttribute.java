package Fundamentals.Package0;

import java.util.Scanner;

public class VehicleInputAttribute {

    int maxspped;
    int wheels;
    String color;
    double fuelCapacity;


    void horn(){
        System.out.println("Beep berip beep");
    }

    public static void main(String[] args) {
        VehicleInputAttribute lambo = new VehicleInputAttribute();

        Scanner s = new Scanner(System.in);

        System.out.println("Input the color of your vehicle");
        lambo.color = s.nextLine();

        System.out.println("Input the the max speed of your vehicle");
        lambo.maxspped = s.nextInt();

        System.out.println("Input the wheels of your vehicle");
        lambo.wheels = s.nextInt();

        System.out.println("Input the fuel capacity of your vehicle");
        lambo.fuelCapacity = s.nextDouble();


        System.out.println("The max speed is " +lambo.maxspped +
                           "\nThe wheels is " + lambo.wheels +
                           "\nThe color is " + lambo.color +
                           "\nThe fuel capacity is " + lambo.fuelCapacity);
        lambo.horn();

    }

}
