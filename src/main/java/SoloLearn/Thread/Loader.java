package SoloLearn.Thread;/*
 *Created by User on Sep, 2019 8:22 PM
 */

public class Loader extends Thread {

    int i = 0;

    public Loader(int i) {
        this.i = i;
    }

    public void run(){
        System.out.println("Hello" + i);
    }
}

class Runner{
    public static void main(String[] args) {

        Loader loader = new Loader(1);
        Loader loader2 = new Loader(2);
        Loader loader3 = new Loader(3);

        loader.start();
        loader2.start();
        loader3.start();
        /*
        Output:
        Hello1
        Hello3
        Hello2
        iba2x every run
         */




    }
}
