package SoloLearn.ReferenceVariable;

public class RefVar {
    public static void main(String[] args) {

        int a; //initializing primitive data type
        Box x; //initializing object data type


        a = 0; //declaring default value for a primitive variable
        System.out.println("a = " + a);

        x = null; //declaring default value for a reference variable
        System.out.println("x = " + x);

        x = new Box();
        System.out.println("x(Box) = " + x);


    }
}
