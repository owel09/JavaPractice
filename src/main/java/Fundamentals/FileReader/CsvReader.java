package Fundamentals.FileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//https://www.youtube.com/watch?v=-Aud0cDh-J8
public class CsvReader {

    public static void main(String[] args) {

        String path = "src/test/resources/FL_insurance_sample.csv";
        String line = ""; //line variable to store

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            //while loop, babasahin every line hanggang dulo kaya != null
            while((line = bufferedReader.readLine()) != null){

                String [] values = line.split(",");
                System.out.println("policyid1: " + values[0] + " statecode: " + values[1]);
            }

        } catch (FileNotFoundException e) {


            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
