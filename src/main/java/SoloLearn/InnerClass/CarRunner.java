package SoloLearn.InnerClass;

public class CarRunner {


    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.printCar();

        Car.FlyingCar myFlyingCar = myCar.new FlyingCar();
        /*
        Car.FlyingCar - FlyingCar class belongs to Car class kaya Car.FlyingCar. para maaccess mo yun FlyingCard
        myCar.new - para maka-create ng object ng FlyingCar. Kailangan yun object ng Car class which is yung kaka-create
        ko pa lang na myCar sa line 7
         */
        myFlyingCar.printFlyingCar();


        Car.FastCar myFastCar = new Car.FastCar();
        myFastCar.printFastCar();
        /*
        kapag static inner class di mo na kailangan ng object (myCar) ng class
        halos kaparehas lang sya ng declaration ng reference variable
        nagkaiba lang sa new at sa object
         */


    }
}
