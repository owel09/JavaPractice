package SoloLearn.Interface;

public class MammalInt implements Animals {
    @Override
    public void eat() {
        System.out.println("Mammals are eatings");
    }

    @Override
    public void travel() {
        System.out.println("Mammals are travelling");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String[] args) {

        MammalInt mammal = new MammalInt();

        mammal.eat();
        mammal.travel();

        mammal.walk();
        /*
        mapprint yung "default method"
         */
    }
}
