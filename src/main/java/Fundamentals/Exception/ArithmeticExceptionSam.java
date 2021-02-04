package Fundamentals.Exception;/*
 *Created by User on Sep, 2019 2:03 PM
 */

public class ArithmeticExceptionSam {
    public static void main(String[] args) {

        try {
            int a = 30;
            int b = 1;
            int c = b/a;
            System.out.println(c);
        } catch (Exception e) {
            /*
            Object e carries the information about the exception
             */
            e.printStackTrace();
            System.out.println("Can't divide number by 0");
        }

        finally{
            System.out.println("Inside the finally block");
            /*
            finally block is executed even an exception is raised

            Output:
            0
            Inside the finally block

            kahit di nagexecute yung exception nag run pa rin ito
             */

        }
    }
}
