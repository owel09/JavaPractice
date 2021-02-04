package Fundamentals.Exception;/*
 *Created by User on Oct, 2019 8:26 PM
 */

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MultipleExcepDivision extends Throwable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            double value = scanner.nextDouble();
            double num = scanner.nextDouble();

            double result = value/num;

            System.out.println(value+ " / "+num+" = " +result);
//        } catch (ArithmeticException e) {
//            System.out.println("zero is not a valid number");
            /*
            kapag sinali ko ito nagkakaroon ng
            Error:(21, 18) java: incompatible types: Exception.ArithmeticException cannot be converted to java.lang.Throwable
            siguro dahil si ArithmeticExcepion ay runtime
             */

        } catch (InputMismatchException e){
            System.out.println("Please input numbers alone");
        } catch (NoSuchElementException e){
            System.out.println("No input / uncompleted input");
        } catch (Exception e){
            System.out.println("Error Found");
        }

    }
}
