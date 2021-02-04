package Fundamentals.Thread;/*
 *Created by User on Sep, 2019 8:15 AM
 */

class Hi extends Thread{

    public void run(){
        /*
        run is an internal method of Thread class
         */

        for(int i=1; i <= 5 ; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(500);
                /*
                may delay yun pagpprint ng method ng .5 second
                 */
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Hello extends Thread{

    public void run(){

        for(int i=1; i <= 5 ; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


public class TeluskoMultiThread {
    public static void main(String[] args) {

        Hi obj1 = new Hi();
        Hello obj2 =  new Hello();

//        obj1.start();
//        obj2.start();
        /*
        Output:
        Hi
        Hello
        Hi
        Hello
        Hello
        Hi
        Hi
        Hello
        Hello
        Hi

        when you call start method, it will call run
        kaya ang output neto ay di magkakasunod
         */

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
        /*
        Output:
        Hi
        Hello
        Hi
        Hello
        Hi
        Hello
        Hi
        Hello
        Hi
        Hello

        naglagay ako ng delay ng delay sa gitna para walang magiging clash between
        classes kung sino yung unang mag-eexecute.
         */




    }
}
