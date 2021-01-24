package SoloLearn.Arrays;

import java.util.Scanner;

public class IfElseEqualsAnimalSounds {

    static void animal (String a){
        System.out.println( "Your favorite animal is a:" + a);

        if (a.equals("cat")) {
            System.out.println("Meow");
        }

            else if (a.equals("dog")){
                System.out.println("Aww");
            }

            else if (a.equals("lion")){
                System.out.println("Roar");
            }

            else{
                System.out.println("Enter a different pet");
            }
        }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the name of your favorite pet?");
        String pet = s.nextLine();

        animal(pet);

    }
}
