package Fundamentals.MultiThreading;/*
 *Created by User on Sep, 2019 7:55 PM
 */

import java.util.Scanner;



public class TheUltimaeCarRaceRunner {

    public static void main(String[] args) {
        System.out.println("Please pick your car for the Race:\n");
        System.out.println("1 > Ferrrai");
        System.out.println("2 > Porsche");
        System.out.println("3 > Lamborghini");
        System.out.println("4 > McLaren");

            for(int k = 1; k <= 4; k++){
                System.out.println("__________________________________");
                System.out.println(k +
                                    "|##>                             |");
                System.out.println("_____________________________Finish");

            }

        Thread Fer = new Thread(new Ferrari());
        Thread Pors = new Thread(new Porsche());
        Thread Lamb = new Thread(new Lamborghini());
        Thread Mc = new Thread(new McLaren());

        java.lang.Error er = new java.lang.Error();

        Scanner s = new Scanner(System.in);
        int pick;



        try {

            pick = s.nextInt();

            if (pick >= 1 && pick <= 4){

                switch (pick){
                    case 1:
                        System.out.println("\nYour Car is The Ferrari");
                        break;
                    case 2:
                        System.out.println("\nYour Car is The Porsche");
                        break;
                    case 3:
                        System.out.println("\nYour Car is The Lamborghini");
                        break;
                    case 4:
                        System.out.println("\nYour Car is The McLaren");
                        break;
                    default:
                        System.out.println("1-4 Please");
                        break;

                }

                Fer.start();
                Pors.start();
                Lamb.start();
                Mc.start();

                System.out.println("\nThe Race is on its way, who's gonna be the winner?\n");
                System.out.println("Ready? Set, Go!\n");

                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){

                }

                System.out.println("\nIf you enjoyed the race, even if the car you picked hasn't won :)");

            }
            else {
                System.out.println("The Race can not start because you didn't pick your car! Please insert an integer from 1 to 4");
            }


        }catch (Exception e){

            System.out.println("The Race can not start because you didn't pick your car! Please insert an integer from 1 to 4");

        }
    }
}
