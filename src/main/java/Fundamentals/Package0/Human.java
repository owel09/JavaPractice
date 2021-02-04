package Fundamentals.Package0;

public class Human {

    static void Name(){
        System.out.println("Owel");
    }

    static void Gender(){
        System.out.println("Male");
    }

    static void Height(){
        System.out.println("5.3");
    }
    //nagamit ko agad yun mga method na name, gender at height kahit
    // walang instance sa class Human kasi nga available sya sa buong class Human.

    public static void main(String[] args) {
        Name();
        Gender();
        Height();
    }
}
