package SoloLearn.Package0;

import java.util.Scanner;

public class InputMethod {

    static void inputname(String x){
        System.out.println("You name is:");
        System.out.println(x);
    }

    static void inputgender (String x){
        System.out.println("Your gender is:");
        System.out.println(x);
    }

    static void inputage (String x){
        System.out.println("Your age is:");
        System.out.println(x);
    }


    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter your name, gender and age:");
        String name = info.nextLine();
        String gender = info.nextLine();
        String age = info.nextLine();

        inputname(name);
        inputgender(gender);
        inputage(age);

        System.out.println("Thanks for providing your info");

    }

}
