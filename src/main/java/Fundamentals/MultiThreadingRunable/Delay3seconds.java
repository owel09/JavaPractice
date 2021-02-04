package Fundamentals.MultiThreadingRunable;/*
using runnable interface tapos may delay na 3 seconds
 */

public class Delay3seconds implements Runnable{

    public void run(){
        System.out.println("Run Hello");
    }

}

class Delay3secondsRunner{
    public static void main(String[] args) {
        Thread owelcute = new Thread(new Delay3seconds());
        /*
        bakit naka (new Delay3seconds) ito?
         */

        owelcute.start();
        owelcute.run();

        /*
        kapag ginamit yung start(), new Thread is created and code inside run() is executed in new Thread
        kapag ginamit yung run(), no new Thread is created
         */



    }
}
