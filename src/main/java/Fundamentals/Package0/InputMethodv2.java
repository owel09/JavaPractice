package Fundamentals.Package0;

import java.util.Scanner;

public class InputMethodv2 {

    public static void InputName(String x){

        System.out.println("My name is:" + x);
    }

    public static void InputGender(String x){
        System.out.println("My gender is:" + x);
    }

    public static void InputAge(int x){
        System.out.println("My age is:" + x);
    }

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Please Input your name, gender and age.");

        String getname = info.nextLine();
        String getgender = info.nextLine();
        int getage = info.nextInt();

        InputName(getname);
        InputGender(getgender);
        InputAge(getage);

    }

}
