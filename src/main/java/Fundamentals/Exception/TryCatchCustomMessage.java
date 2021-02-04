package Fundamentals.Exception;/*
 *Created by User on Sep, 2019 11:41 AM
 */

public class TryCatchCustomMessage {

    public static void main(String[] args) {

        try {
            int data = 50/0;
            System.out.println("nasa try block ako");
            /*
            di ma-pprint ito kasi nagkaroon ng exception sa line 10 at di na nya ma-eexecute yung next line
             */
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Can't divided by zero");
//            int data = 50/0;
            /*

             */
            /*
            custom message error sa catch block
             */
        }

        System.out.println("rest of the code");
        /*
        kapag walang exception, lahat code after exception ay di ma-execute
         */
    }
}
