package SoloLearn.Exception;/*
 *Created by User on Sep, 2019 2:12 PM
 */

import java.io.File;
import java.io.FileReader;

public class FileNotFoundException {
    public static void main(String[] args) {

        try {
            File file = new File("E://file.txt");
            /*
            di naman talaga nag-eexist talaga ito
             */

            FileReader fr = new FileReader(file);
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File does not exist");
        }

    }
}
