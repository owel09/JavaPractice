package Fundamentals.Exception;/*
 *Created by User on Sep, 2019 2:24 PM
 */

import java.util.Arrays;

public class UserDefinedExcepAccBal extends Exception{

    private static int accountNum[] = {1111,2222,3333,4444};

    private static String name [] = {"Owel","Jori","Nata","Raqu"};

    private static double balance [] = {10000.00,12000.00,5600.00,999.00};

    public UserDefinedExcepAccBal() {
    }
    /*
    default constructor
     */

    public UserDefinedExcepAccBal(String message) {
        super(message);
    }
    /*
    parameterized constructor
     */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(accountNum));
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(balance));
        /*
        Simple way to display all the values in Array
         */


        try {
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
            for (int i = 0; i<accountNum.length ; i++){

                System.out.println(accountNum[i] + "\t" + name[i] + "\t" + balance[i]);

                if (balance[i] < 1000){
                    UserDefinedExcepAccBal me = new UserDefinedExcepAccBal("Balance is less than 1000");
                    throw me;

                }

            }
        } catch (UserDefinedExcepAccBal e) {
            e.printStackTrace();
        }
    }


}
