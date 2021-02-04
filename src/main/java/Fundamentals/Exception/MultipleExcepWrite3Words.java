package Fundamentals.Exception;/*
 *Created by User on Sep, 2019 7:55 PM
 */

import java.util.Scanner;

public class MultipleExcepWrite3Words {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 3 words");
        String str = scanner.nextLine();


        try {
            String str1 = str;
            char myChar = str1.charAt(3);
            String str3 = null;
            System.out.println(str3.charAt(0));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Write at least 3 words");
        } catch (NullPointerException e1){
            System.out.println("There is no data");
        }
        System.out.println("Submit your words");


    }
}
