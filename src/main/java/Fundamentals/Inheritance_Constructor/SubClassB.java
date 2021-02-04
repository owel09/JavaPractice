package Fundamentals.Inheritance_Constructor;

public class SubClassB extends SuperClassA{
    int num1 = 100;

    public SubClassB(){
        System.out.println("New B");

        System.out.println(num1);       //kukunin nya yun value sa SubClass w/c is 100
        System.out.println(super.num1); //kukunin nnya yun value sa SuperClass w/c 50
    }
}
