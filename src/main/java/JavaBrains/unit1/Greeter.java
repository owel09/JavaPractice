package JavaBrains.unit1;

/*
LESSON 6 - Passing behavior
Passing a behavior in the greet method using Greeting interface and perform method
greeter.greet(helloWorldGreeting);  //pwede mo lang magamit yung greet()
                                    // kung makakagawa ka ng implementation
                                    // ng Greeting interface which is HelloWorldGreeting
                                    // greeter can pass that instance "helloWorldGreeting" to the greet method
                                    // greet method calls perform in HelloWorldGreeting

LESSON 7 - Practice lambda
greetingFunction = () -> System.out.println("Hello world");

        greet(greetingFunction);

        doubleNumber = (int a) ->  a * 2;

        addFunction = (int a, int b) -> a + b;

        safeDivideFunction = (int a, int b) -> {
            if ( b == 0)
                return 0;
            else
                return a / b;
        };

        stringLengthFunction = (String s) -> s.length();

LESSON 8 - LAMBDA AS INTERFACE TYPE

Paano magcreate ng Lambda interface type
1. Create interface -"myLambdaInterface"
2. Create method in the interface with same signature - void foo()
3. Declare the interface in your Lambda variable

MyLambdaInterface myLambdaVar = () -> System.out.println("Hello World Greeting");

LESSON 9 - Lambda vs Interface Implementation
What is the difference?
    Greeting helloWorldGreeting = new HelloWorldGreeting();
    vs
    Greeting lambdaGreeting = () -> System.out.println("Hello World Greeting");

    -Greeting helloWorldGreeting = new HelloWorldGreeting();
    helloWorldGreeting is instance of an implementation "HelloWorldGreeting" class

    -helloWorldGreeting.perform();
    kaya pwede nya magamit yung perform() kasi may perform naman talaga si "HelloWorldGreeting" class

    -Greeting lambdaGreeting = () -> System.out.println("Hello World Greeting");
    "() -> System.out.println("Hello World Greeting");" is behaving like implementation of Greeting interface
    in short nag-iimplement ka ng function instead na gagawa kapa ng class

    *Created by owel on 14/04/2020 7:50 AM
 */

public class Greeter {
    //greet method takes the Greeting interface
    public void greet(Greeting greeting){
        greeting.perform();
    }


    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello World Greeting");

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World innerclass");
            }
        };

        innerClassGreeting.perform();

        /*

         */



    }
}

