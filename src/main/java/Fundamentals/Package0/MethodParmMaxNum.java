package Fundamentals.Package0;

import java.util.Scanner;

public class MethodParmMaxNum {

    static void maxNum(int x, int y){
        System.out.println("the max is:");

        if(x>y){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input 2 numbers:");
        int input1 = s.nextInt();
        int input2 = s.nextInt();

        maxNum(input1,input2);
    }
}
