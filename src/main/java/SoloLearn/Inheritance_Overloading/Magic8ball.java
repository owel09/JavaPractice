package SoloLearn.Inheritance_Overloading;/*
 *Created by owel on 27/12/2019 10:43 AM
 */


import java.util.Random;
import java.util.Scanner;

public class Magic8ball {

    public static void main(String[] args) {

        System.out.println("Ask your question:");

        Scanner s = new Scanner(System.in);
        String question = s.nextLine();

        Random randomInt = new Random();
        int random = randomInt.nextInt(3)+1;
        String answer;

        if(random == 1){
            answer = "Yes";
        } else if (random ==2){
            answer = "No";
        } else {
            answer = "Ask again Later";
        }

        System.out.println(answer);


    }

}
