package Fundamentals.Loop;

/*
 *Created by Work on 26/10/2021 4:35 PM
 */
public class Nestedloop {
    public static void main(String[] args) {

        for(int i = 0 ; i < 4 ; i++){
            System.out.println("outerloop started");

            for(int x = 0 ; x < 4 ; x++){
                System.out.println("innerloop");
            }
            System.out.println("outerloop ended");
        }

    }
}
