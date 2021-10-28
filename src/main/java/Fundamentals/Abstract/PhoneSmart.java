package Fundamentals.Abstract;

public class PhoneSmart extends Phone{

    @Override
    public void text() {
        System.out.println("texting as Smart");
    }

    @Override
    public void addContacts() {
        System.out.println("adding contacts as Smart");
    }

    @Override
    public void move() {
        System.out.println("Moving as Smart");
    }

    @Override
    public void dance() {
        System.out.println("Dancing as Smart");
    }

    @Override
    public void cook() {
        System.out.println("Cooking as Smart");
    }
}
