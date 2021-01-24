package SoloLearn.Arrays;

import java.util.Scanner;

public class SumUpNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many numbers would you like to sum?");
        int numSum;
        int sum = 0;
        numSum = scan.nextInt();

        if (numSum > 0){

            int numList[] = new int[numSum];
            System.out.println("Enter the Numbers for Summation");
            for (int x = 0 ; x <= numList.length-1 ; x++){

                numList[x] = scan.nextInt();
                sum = sum + numList[x];
            }

            System.out.println("The sum is "+ sum);
        }

        else if (numSum <= 0)
        {
            System.out.println("Invalid Input. Please input more than 1");

        }




    }
}
