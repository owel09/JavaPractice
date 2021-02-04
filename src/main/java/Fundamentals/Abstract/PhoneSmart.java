package Fundamentals.Abstract;

public class PhoneSmart extends Phone{

    @Override
    public void move() {
        System.out.println("Moving..as Smart");
    }

    @Override
    public void dance() {
        System.out.println("Dancing..");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }
}
