package SoloLearn.Package0;

import java.util.Scanner;

public class MethodParmScanner {
    static void saySomething(String atr){
        System.out.println("oh really? " +  atr + "?");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Say something..");
        saySomething(s.nextLine());
    }
}
