package SoloLearn.Exception;

import java.io.*;

/*
Checked exception are checked when compiled
    ->Isang example is yung Thread.sleep() which throw an InterruptedException
    code will not compiled until you've handled the exception
    -> represent invalid conditions in areas outside the immediate control of the program,  often invalid user input,  database problems, network,  absent files.
    -> you must establish a policy for them by a try/catch block.
 */

public class CheckedException extends Throwable {

    public static void main(String[] args) throws CheckedException {
        /*
        throws keyword to avoid compilation error
         */

        FileInputStream fis = null;


        try {
            fis = new FileInputStream("C:\\Users\\AdminASUS\\Documents\\myfile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        int k;

        try {
            while ((k=fis.read())!= -1)
            {
                System.out.print((char)k);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
