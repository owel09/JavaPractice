package Fundamentals.Thread;/*
 *Created by User on Sep, 2019 7:44 AM
 */

public class Runnable1 implements Runnable{
    /*
    Kapag ang class extends Thread yung gamit nya, di na ko
    pwede mag-extend pa
    Kapag interface naman pwede pa ko mag-extendgamit yung ibang
    class
     */


    @Override
    public void run() {

        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

class ThreadRunnableRunner{
    public static void main(String[] args) {

        int n = 8;
        for (int i=0; i < 8 ; i++){
            Thread object = new Thread(new Runnable1());
//            object.start();

//            Runnable1 rc = new Runnable1();
//            Thread object = new Thread(rc);
//            object.start();
            /*
            ito yung pinahabang format kaya nasa loob yung "new Runnable1" ng parameter
             */

        }
    }

}
