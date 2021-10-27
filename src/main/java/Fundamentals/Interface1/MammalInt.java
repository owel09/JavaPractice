package Fundamentals.Interface1;

public class MammalInt implements Animals {
    @Override
    public void eat() {
        System.out.println("Mammals are eatings");
    }

    @Override
    public void travel() {
        System.out.println("Mammals are travelling");
    }

    @Override
    public void sleep() {
        System.out.println("Mammals are sleeping");
    }

    public void hibernate(){
        System.out.println("Mammals hibernates");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String[] args) {

        MammalInt mammal = new MammalInt();

        mammal.eat();
        mammal.travel();
        mammal.sleep();
        mammal.hibernate(); //may hibernate method sa mammal object kasi local method sya

        mammal.walk();
        /*
        mapprint yung "default method"
         */

        Animals animals = new MammalInt();
        animals.eat();

    }
}
