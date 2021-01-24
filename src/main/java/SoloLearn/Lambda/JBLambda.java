package SoloLearn.Lambda;

/*
 *Created by owel on 26/02/2020 7:51 AM
 * Lambda only sends action which is not belong to any class
 * Paano magsulat ng lamba? di mo kailangan modifier (public), return type (int), name
 * arrow  between ng () -> {}
 */
public class JBLambda
{

    public void greet(){
        System.out.println("hello owel");
    }

    public static void main(String[] args)
    {
        JBLambda greeter = new JBLambda();
        greeter.greet();

        /*PASSING THE LAMBDA EXPRESSION
        greetFunc = () -> System.out.println("hello world");
        lambda expression what this does is have a function in line which takes no arguments. this is assigned to greetFunc variable

        greet(greetFunc);
        passing the function of printing the hello world to greet

        greet(() -> System.out.println("hello world"));
         */

        /*CONVERTING METHOD TO LAMBDA EXPRESSION

        doubleNumberFunc = public int doubleName (int a){

            return a * 2;
        }

        -tanggalin public - which is the modifier
        -tanggalin doubleName - which is the name ng method
        -tanggalin int - which is the return type
        -lagyan ng arrow sa gitna ng () at {}
        -tapos ; sa dulo
        -kung one liner lang pwede alisin yun return at {}
        - yung -> represents the return

        doubleNumberFunc = (int a) -> a * 2;

         */

        /*LAMBDA EXPRESSION WITH 2 ARGUMENTS TO ADD
        addFunc = () -> {};

        () - input arguments
        -> - what should return

        addFunc = (int a, int b) -> a + b;

         */

        /*
        safeDivideFunc = (int a, int b) -> a / b;

        paano kung kailangan ng if condition para hindi zero ang result?
        -kailangan mo na ng curly brace para if condition

        safeDivdeFunc = (int a, int b) -> {
            if (b == 0) return 0;
                return a / b;
            };

         */

//        stringCountFunc = (String s) -> s.length();



    }
}
