package JavaBrains.unit1;

/*LESSON 11- Runnable interface and Lambda
 *Created by owel on 21/04/2020 9:21 AM
 */
public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() { //anonymous innerclass
            @Override
            public void run() {
                System.out.println("Printing inside Runnable interface");
            }
        });

        myThread.run();

        Runnable myLambdaRunnable = () -> System.out.println("Printing in myLambdaRunnable");
        myLambdaRunnable.run();
    }

}
