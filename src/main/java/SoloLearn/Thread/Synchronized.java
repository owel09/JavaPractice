package SoloLearn.Thread;/*
 *Created by User on Sep, 2019 6:01 PM
 */

public class Synchronized extends Thread{

    @Override
    public void run(){
        display();
    }

    synchronized static void display(){
        /*
        with synchronized the Threads are executed one by one. without it the thread will be
        executed at the same time
         */
        int x = 0;

        while (x < 10){
            System.out.println(x);
            x++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}

class SynchronizedRunnner{
    public static void main(String[] args) {

        Synchronized owelcute1 = new Synchronized();

        owelcute1.start();
        /*
        Output:
        0
        1
        2
        3
        4
        5
        6
        7
        8
        9
         */


    }
}
