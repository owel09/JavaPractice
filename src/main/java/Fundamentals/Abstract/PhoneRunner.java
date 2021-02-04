package Fundamentals.Abstract;

public class PhoneRunner {

    public static void main(String[] args) {

        Phone phone = new PhoneSmart();
        phone.call();
        phone.cook();
        phone.dance();
        phone.move();

    }
}
