package Fundamentals.Exception;/*
 *Created by User on Sep, 2019 7:09 PM
 */

public class ThrowsArithmeticExcep {

    static int divide(int x, int y) {


        if(y == 0){
            throw new ArithmeticException("You cannot divide to Zero");
        } else
            return x/y;

    }

    public static void main(String[] args) {

        System.out.println(divide(25,0));
    }
}
