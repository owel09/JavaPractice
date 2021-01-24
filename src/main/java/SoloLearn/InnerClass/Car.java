package SoloLearn.InnerClass;


public class Car {
    int i;

    public void printCar(){
        System.out.println("I'm in the Class Car");
    }

    public class FlyingCar{
        int j;

        public void printFlyingCar(){
            System.out.println("I'm in the Class FlyingCar");
        }
    }

    static class FastCar{

        public void printFastCar(){
            System.out.println("I'm in the Class FastCar");
        }

    }

}
