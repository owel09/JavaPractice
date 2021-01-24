package SoloLearn.Exception;/*
 *Created by User on Sep, 2019 6:52 PM
 */

import java.util.Scanner;

public class UserDefinedExcepAge {

    public static void main(String[] args) {

        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = scanner.nextInt();


        try {
            if(age < 18){
                throw new AgeException();
            } else{
                System.out.println("You are a voter");
            }
        } catch (AgeException e) {
            System.out.println("Your not eligible to vote");
        }
    }

    }

    class AgeException extends Exception{

    }

