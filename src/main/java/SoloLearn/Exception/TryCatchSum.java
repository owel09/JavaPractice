package SoloLearn.Exception;

import java.util.Scanner;

public class TryCatchSum {

    public static void main(String[] args) {
        int  x = 0;

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first num: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second num");
            int num2 = scanner.nextInt();
            int sum = num1 / num2;
            System.out.println(sum);

        }catch (Exception e){
            System.out.println("You can't do that");
        }

    }


}
