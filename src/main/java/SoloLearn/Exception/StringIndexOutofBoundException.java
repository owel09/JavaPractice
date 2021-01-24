package SoloLearn.Exception;/*
 *Created by User on Sep, 2019 2:08 PM
 */

public class StringIndexOutofBoundException {
    public static void main(String[] args) {
        try {
            String a = "This is like chipping";
            char c = a.charAt(25);
        /*
        accessing 25 element of the string pero 22 lang yun
         */
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("StringIndexOutofBoundException...");
        }
    }
}
