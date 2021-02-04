package Fundamentals.Return;

public class ReturnVariable {

    public static void main(String[] args) {
        myMethod();
        int myInt = 0;
        System.out.println(myInt);

        myInt = myMethod();
        System.out.println(myInt);
        myMethod();
    }


    static int myMethod(){
        System.out.println("My computer is lagging");
        return 4;
    }
}
