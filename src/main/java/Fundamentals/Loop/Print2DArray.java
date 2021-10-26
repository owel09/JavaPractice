package Fundamentals.Loop;

/*
 *Created by Work on 26/10/2021 4:47 PM
 */
public class Print2DArray {
    public static void main(String[] args) {

        int twoDimen [][] = {
                {1,2,3,4},
                {5,6,7},
                {8,9},
                {10}
        };

        for (int b[]:twoDimen) {
            for (int c:b) {
                System.out.print(" " +c);
            }
            System.out.println(" ");

        }

    }
}
