package Fundamentals.Package0;

public class HumanAttribute {
    int age = 27;
    String name = "ROWELL";

     void eat(){
        System.out.println("I eat twice a day");
    }

    static void walk(){
        System.out.println("I walk from Bakti to Wisma LYL");
    }

    public static void main(String[] args) {
        HumanAttribute owel = new HumanAttribute();

        System.out.println("My name is " + owel.name + " and I'm "+ owel.age + " years old");
        owel.eat();
        walk();
    }
}
