package Fundamentals.Interface3;

/*Pass interface as parameter with anonymous inner class
 *Created by owel on 29/02/2020 7:59 AM
 */
public class PassInterface
{
    void catchInterface(PassInterfaceInt intObj){
        intObj.foo();   //accessing all the function of interface. kaya natawag natin yun method foo
    }

    public static void main(String[] args)
    {
        //HOW TO PASS INTERFACE?
        PassInterface passInterface = new PassInterface();
        passInterface.catchInterface(new PassInterfaceInt()
        {
            @Override
            public void foo()
            {
                System.out.println("Inside the anonymous class");
            }
        }); //to pass interface, kailangan mo mag new PassInterfaceInt tapos automatic syang gagawa ng anonymous class

        //WALANG CLASS ANONYMOUS KASI GUMAWA TAYO NG BAGONG CLASS NA INIMPLEMENT YUNG PASSINTERFACEINT
        PassInterfaceImplementer passInterfaceImplementer = new PassInterfaceImplementer(); //ito yun magsisilbing new PassInterfaceInt()

        passInterface.catchInterface(passInterfaceImplementer); //inoveride nya yung foo method dito

    }
}

/*
output:
Inside the anonymous class
sa loob ng Implementer
 */
