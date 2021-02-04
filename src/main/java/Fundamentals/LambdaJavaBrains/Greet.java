package Fundamentals.LambdaJavaBrains;

/*
 *Created by owel on 28/02/2020 6:52 AM
 */
public class Greet
{
    public void sayGreetingGreet(Greeting  objGreet){

    }

    public static void main(String[] args)
    {

        //INSTANCE OF GREETING INTERFACE
        Greeting helloWorldGreeting = new HelloWorldGreeting();

        helloWorldGreeting.sayGreeting();

        //INTERFACE LAMBDA EXPRESSION WHICH HAS A METHOD
        Greeting lamdaGreeting = () -> System.out.println("Hello World Lambda"); //this lambda is behaving like the implemention of Greeting interface

        lamdaGreeting.sayGreeting();

        //INLINE IMPLEMENTATION OF INTERFACE
        Greeting innerClassGreeting = new Greeting() //automatic nya nilagay yun method sayGreeting
        {
            @Override
            public void sayGreeting()
            {
                System.out.println("Hello inline interface implementation");
            }
        };

        innerClassGreeting.sayGreeting();
    }
}
