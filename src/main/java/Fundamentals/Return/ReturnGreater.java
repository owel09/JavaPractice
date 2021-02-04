package Fundamentals.Return;

import java.util.Scanner;

public class ReturnGreater {

    static int greater(int num1, int num2){
        return (num1>num2)?num1:num2;

    }

    public static void main(String[] args) {
        System.out.println("Input two numbers to know what is greater");
        Scanner s = new Scanner(System.in);
        int input1 = s.nextInt();
        int input2 = s.nextInt();

        int res = greater(input1,input2);
        System.out.println("The larger number is: "+ res);

    }
}
