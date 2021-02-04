package Fundamentals.Thread;

public class Runnable2 implements Runnable{

    public void run(){
        for (int i = 0; i < 10 ; i ++ ){
            System.out.println(Thread.currentThread().getId() + " value" + i);
            /*
            Thread.currentThread().getId() gives you the current thread Id
            To check these threads run in concurrency we use delay of 1000sec
             */

            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
                /*
                printStackTrace();
                ->What’s the difference between e.printStackTrace();
                and System.out.println(e.toString());   ?

                The output stream is different. The first one shows:
                - name of exception (example: arithmeticException)
                - Description: (example: Division by zero)
                - Stack trace: (example: First.main(First:java:7)
                while System.println(e.toString()); won’t show the stack trace

                laging may exception handing yung sleep method.
                e.printStackTrace() writes that information to System.err (not System.out)
                and also a stack trace, that is, the chain of methods that led to the exception
                 */
            }
        }

    }
}

class RunnerRunnable2{
    public static void main(String[] args) {
        Thread owelcute1 = new Thread(new Runnable2());
        Thread owelcute2 = new Thread(new Runnable2());


        owelcute1.start();
        owelcute2.start();
    }
}
