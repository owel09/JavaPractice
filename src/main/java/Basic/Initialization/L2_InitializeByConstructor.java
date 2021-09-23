package Basic.Initialization;

/*
 *Created by Work on 23/9/2021 10:01 AM
 */
public class L2_InitializeByConstructor {

    String name;

    public L2_InitializeByConstructor(String s){ //Constructor na required nya na may String na ipapasa dapat sa kanya
        this.name = s;
    }

    public static void main(String[] args) {
        L2_InitializeByConstructor initializeByConstructor = new L2_InitializeByConstructor("Owel");
        /*
        Initialize By Constructor - like By method pero nasa Instantiation ka naglagay ng value.
         */

        System.out.println(initializeByConstructor.name);
    }
}
