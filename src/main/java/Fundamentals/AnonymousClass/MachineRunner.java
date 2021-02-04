package Fundamentals.AnonymousClass;

public class MachineRunner {

    public static void main(String[] args) {

        //Member Inner Class
        Machine m = new Machine(){
            public void start(){
                System.out.println("Start Override");
            }
        };
        /*
        Output:
        Start Override

        sa line na
        Machine m = new Machine();
        naglagay agad ako ng curly braces sa sa gitna ng ); para ipasok yung method override
        si m1 daw ay object na nacreate sa on the fly class that extends Machine.
        yung mga on the fly class tinawag din na Anonymous class
        Pero bakit siya tinawag na "on the fly class" or Anonymous class?
        Kasi yung object m1 lang na nacreate yun naapektuhan nya at di nya naapektuhan yun ibang object at class.
        parang sa lambda na pwede ka magcreate ng function on they fly to execute in a specific place
        Paano gamitin yun Anonymous Class?
        Machine -
         */
        m.start();

        //Static Inner Class
        Machine m2 = new Machine();
        m2.start();
        /*
        Output:
        Engine start

        gumana yung modification sa loob lang ng object kaya nung nag-create ako ng bagong object
        gumagana na ulit
         */


    }



}
