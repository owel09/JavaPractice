package Fundamentals.Super.Vehicle;

class SuperVehicle {
    int maxSpeed = 120;

    SuperVehicle(){
        System.out.println("Vehicle constructor");
    }
}

class Car extends SuperVehicle{
    int maxSpeed = 100;

    public void display(){
        System.out.println(super.maxSpeed);
    }

    Car(){
        System.out.println("Car constructor");
    }
}