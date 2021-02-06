package Fundamentals.FileReader;

import java.io.File;
import java.util.Scanner;

public class readfile {

    private Scanner x;

    public void openFile(){
        try {
            x = new Scanner(new File("src/test/resources/chinese.txt"));
        } catch (Exception e){
            System.out.println("could not find file");

        }
    }

    public void readFile(){
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();

            System.out.printf("%s %s %s\n", a,b,c);
        }
    }

    public void closeFile(){
        x.close();
    }

    public static void main(String[] args) {
        readfile r = new readfile();
        r.openFile();
        r.readFile();
        r.closeFile();
    }

}
