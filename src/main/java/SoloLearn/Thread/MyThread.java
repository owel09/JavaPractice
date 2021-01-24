package SoloLearn.Thread;/*
 *Created by User on Sep, 2019 8:38 AM
 */

public class MyThread extends Thread{

    int[] values = {6,5,1,7,8};
    int result;
    public void run(){

        for(int i = 0; i < 5; i++){

            result = values [i]*2;
            System.out.println(result);

        }
    }

}

class RunnerMyThread{

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
//        t1.run();
        t1.start();
        /*
        Output:
        12
        10
        2
        14
        16
        parehas sila ng output?
         */

        MyThread t2 = new MyThread();
        t2.start();
    }
}


