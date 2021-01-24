package SoloLearn.Package0;

import java.util.Scanner;

public class ReturnSumInput {

    static int sum(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("Input 2 numbers to sum:");
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();

        System.out.println(sum(num1,num2));
    }

}
