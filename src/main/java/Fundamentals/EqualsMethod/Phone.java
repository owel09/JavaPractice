package Fundamentals.EqualsMethod;

public class Phone {
    private int x;

    public static void main(String[] args) {

        Phone myPhone = new Phone();
        myPhone.x = 5;
        Phone yourPhone = new Phone();
        yourPhone.x = 5;
        System.out.println(myPhone == yourPhone);
        /*
        Output:
        false

        parehas na object kaya yung cinocompare dyan
         */
        System.out.println(myPhone.x == yourPhone.x);
        /*
        true

        kasi isa lang yun x na nirerefer nilang 2.
         */

    }
}
