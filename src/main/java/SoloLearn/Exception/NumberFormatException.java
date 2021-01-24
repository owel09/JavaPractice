package SoloLearn.Exception;/*
 *Created by User on Sep, 2019 2:16 PM
 */

public class NumberFormatException {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("Owel");
        /*
        di naman number yung Owel
         */
            System.out.println(num);
        } catch (java.lang.NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Number format exception");
        }
    }
}
