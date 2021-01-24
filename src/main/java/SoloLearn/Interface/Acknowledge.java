package SoloLearn.Interface;

public class Acknowledge implements Greets
{
    @Override
    public void show() {
        System.out.println("Hello Acknowledge");
    }

    public void display(){
        System.out.println("Hi Acknowledge");
    }

    public static void main(String[] args) {
        Acknowledge a = new Acknowledge();
        a.show();
        a.display();

        Greets g = new Acknowledge();
        g.show();
        /*
        Output:
        Hello
        Greet is Interface pero gumawa tayo ng reference variable g at gumawa ng obj Acknowlege
        kaya lumabas pa rin yun show method
         */

        //INLINE IMPLEMENTATION OF INTERFACE
        Greets greets = new Greets()
        {
            @Override
            public void show()
            {
                System.out.println("inline implementation of Greets interface");
            }
        };

        greets.show();

        //LAMBDA EXPRESSION
        Greets greetsLambda = () -> {
            System.out.println("lambda expression Greets interface");
        };

        greetsLambda.show();

        System.out.println(Greets.cube(3));
        /*
        Output:
        27
        Yung Greet Interface yun ginamit para matawag cube static method na cube
         */

    }
}
