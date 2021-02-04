package Fundamentals.Exception;/*
 *Created by User on Sep, 2019 2:05 PM
 */

public class NullPointerExpception {
    public static void main(String[] args) {

        try {
            String a = null;
            System.out.println(a.charAt(0));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("NullPointer Exception...");
        }
    }
}
