package Fundamentals.MultiThreadingRunable;/*
 *Created by User on Sep, 2019 11:20 PM
 */

public class InterruptedExp implements Runnable {

    public void run(){

        try {
            Thread.sleep(1000);
            System.out.println("I completed my sleep and I am ready to do my next task");
        } catch (InterruptedException e) {
            System.out.println("My sleep is interuptted:( due to exception" + e.getMessage() +
                    "\nTherefore I wont ableto complete my remaining task");
        }

    }
    /*
    laging kailangan ng run method kapag ginamin mot yung Runnable interface
     */
}

class InterruptedExpRuner{
    public static void main(String[] args) {
        Thread t = new Thread(new InterruptedExp());
        t.start();
        t.interrupt();
        /*
        Output:
        My sleep is interuptted:( due to exceptionsleep interrupted
        Therefore I wont ableto complete my remaining task

        Yung Thread.sleep kailangan laging may try catch para may error message kung naginterupt
        during the delay

         */
    }
}
