package Fundamentals.MultiThreadingRunable;/*
 *Created by User on Sep, 2019 10:47 PM
 */

public class StartVsRun extends Thread {

    public void run(){
        System.out.println("Current thread name:" + Thread.currentThread().getName());
        System.out.println("run() method called");
    }

}

class StartVsRunRunner{
    public static void main(String[] args) {

        StartVsRun t = new StartVsRun();
//        t.start();
        /*
        Output:
        Current thread name:Thread-0
        run() method called
        nung ginamit ko yung start() may nacreate na bagong thread na Thread-0 ang name
         */


        t.run();
        /*
        Output:
        Current thread name:main
        run() method called

        no multi-threading dito kasi main thread yung current thread. Normal function call
         */
    }
}
