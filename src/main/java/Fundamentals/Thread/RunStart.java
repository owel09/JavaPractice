package Fundamentals.Thread;/*
 *Created by User on Sep, 2019 7:46 AM
 */

public class RunStart  extends Thread{
    private String Name;

    public RunStart(String name) {
        Name = name;
        System.out.println(Name + "is created");
    }

    public void run(){
        System.out.println(Name + "is running");
    }
}

 class Learn{

    public static void main(String[] args) {

        RunStart r1 = new RunStart("Thread 1 ");
        RunStart r2 = new RunStart("Thread 2 ");
        RunStart r3 = new RunStart("Thread 3 ");
        RunStart r4 = new RunStart("Thread 4 ");


        r1.start();
        r2.start();
        r3.start();
        r4.start();

        /*
        Output:
        Thread 1 is created
        Thread 2 is created
        Thread 3 is created
        Thread 4 is created
        Thread 3 is running
        Thread 4 is running
        Thread 2 is running
        Thread 1 is running

        notice that magkakasunod yung pagcreate nya ng object pero hindi magkakasunod yung
        pag-run nya
         */


    }
}
