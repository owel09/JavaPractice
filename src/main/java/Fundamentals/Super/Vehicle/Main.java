package Fundamentals.Super.Vehicle;

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        System.out.println(c.maxSpeed); //100

        c.display(); //120 kasi ginamit yung super sa method

    }

}
