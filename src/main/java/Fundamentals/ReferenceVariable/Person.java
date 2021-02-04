package Fundamentals.ReferenceVariable;

public class Person {
    String name;
    int age;


    public Person(String name, int age) { //constructor
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "name: " + name +" "+ "age: " + age;
    }

    public void changeDetails(String name, int age){ //halos kaparehas nga sya ng Constructor
        this.name = name;
        this.age = age;
    }

}
