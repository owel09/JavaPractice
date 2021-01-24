package SoloLearn.Package0;

public class StaticvsNonStatic {

    static void sayHello(){
        System.out.println("Hello im static Method Bro");
    }

    void sayHello2(){
        System.out.println("Ako naman si non static Method sir");
    }

    public static void main(String[] args) {
        sayHello();

        StaticvsNonStatic owel = new StaticvsNonStatic();
        owel.sayHello2();

    }
}
