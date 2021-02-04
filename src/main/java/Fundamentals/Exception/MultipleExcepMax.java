package Fundamentals.Exception;/*
 *Created by User on Sep, 2019 7:24 PM
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExcepMax {

    public static void main(String[] args) {

        int a,b,c,large;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter 3 digits for max number:");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            large=a;
            large = (large<b) ? b:large;
        /*
        Ternary Operator. testCondition ? trueValue : falseValue
        testCondition - (large<b) evaluation part
        trueValue - if non-zero ito yun eevaluate
        falseValue - if zero ito yun eevaluate
         */
            large = (large<c) ? c:large;

            System.out.println("Largest number is: " + large);
        } catch (InputMismatchException e) {
            System.out.println("Provide Valid Input");
        } catch (Exception e2){
            e2.printStackTrace();
        }


    }
}
