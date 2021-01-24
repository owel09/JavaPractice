package SoloLearn.Upcasting;

public class Lion extends Animal{

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping");
    }
    /*
    overriding the sleep method in Animal class
     */

    public void roar(){
        System.out.println("Lion is roaring");
    }


}
