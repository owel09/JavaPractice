package Fundamentals.Abstract;

public class TestPhone {

    public static void main(String[] args) {

        Phone phoneSmart = new PhoneSmart();
        phoneSmart.text();
        phoneSmart.addContacts();

        phoneSmart.cook();
        phoneSmart.dance();
        phoneSmart.move();

        phoneSmart.call(); //as Normal

    }
}
