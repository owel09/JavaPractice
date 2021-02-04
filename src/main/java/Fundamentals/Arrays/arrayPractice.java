package Fundamentals.Arrays;

import java.util.Scanner;

public class arrayPractice {

    public static void main(String[] args) {

        int req [] = {200,500};

        Scanner scan = new Scanner(System.in);
        System.out.println("\nIn order to calculate your calcium requirements, Please input your age:");

        int user_age = scan.nextInt();

        if (user_age < 16){
            System.out.println(req[0]+"mg");
        }
        else if (user_age > 16 ){
            System.out.println(req[1]+"mg");
        }
        else if (user_age < 0 ){
            System.out.println("Invalid input, please re-input your age.");
        }

        else{
            System.out.println("Error");
        }

    }

}
