package Fundamentals.EqualsMethod;

public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;

        Animal horse = new Animal("Makibao");
        Animal horse1 = new Animal("Makibao");

        System.out.println(horse==horse1);
        /*
        Output:
        false

        Magkaparehas na "Makibao" yung nakalagay sa object horse at horse1
        pero false yun lumabas kasi magkaiba ng memory location yung horse at horse1
        Kung gusto mo talaga magcompare ng array at object, use compareTo method
         */

        System.out.println(horse);
        System.out.println(horse1);
        /*
        Output:
        EqualsMethod.Animal@6acbcfc0
        EqualsMethod.Animal@5f184fc6

        magkaiba nga talaga
         */

        System.out.println(num1==num2);
        /*
        Output:
        true

        ang ibig sabihin talaga ng == is your telling the compiler to check if both objects are pointing in the same
        location in the memory. So talagang nagwowork ito ng maayos sa object comparison.
        Pero kapag ginamit mo yung == sa regural variables tulad ng int, double. Chinecheck mo talaga kung parehas yung
        value ng variable.
         */

        System.out.println(horse +" "+horse1);
        /*
        Output:
        EqualsMethod.Animal@6acbcfc0 EqualsMethod.Animal@5f184fc6
         */

        System.out.println(horse.name == horse1.name);
        /*
        Output:
        true

         */



    }
}
