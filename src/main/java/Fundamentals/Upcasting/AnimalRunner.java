package Fundamentals.Upcasting;

public class AnimalRunner {


    public static void main(String[] args) {

        Animal a = new Animal();
        a.eats();
        a.sleep();
        /*
        Output:
        Animal is eating
        Animal is sleeping

        normal na pag-call ng method sa Animal class
         */

        Animal b = new Lion();
        /*
        |Stack|         |Heap|
        Animal b  ->    Instance of Lion

        yung mga normal data type naka-store yun sa stack

        upcasting kasi yun b which is instance of Lion is cast up to reference Animal
        Animal - variable type, dito mo malalaman kung anong methods ang pwede tawagin. kaya eats and sleep lang ang
        pwede mo gamitin.
        Lion - object type, dito mo malalaman kung anong version ng method ang maeexecute. kaya maeexecute yung
        sleep method ng Lion kasi si b pointing to an instance of Lion

         */

        b.eats();
        b.sleep();
        /*
        pwede mo matawag yung eats and sleep method kasi parehas naman sila nasa Animal class
         */

        //b.roar();
        /*
        Error. kahit b is pointing in an instance of Lion, reference type siya ng class Animal at wala doon yung
        method roar.
         */

        //Downcasting

        //Lion c = b;
        /*
        Error. b is reference type variable na ng Animal class, tapos gusto mo pa sya ilagay sa c na reference type
        variable na Lion. di sila compatible Reference type
         */

        ((Lion) b).roar();
        /*
        downcasting. actually muka lang kumplikado yan pero b.roar(); lang tinype ko dyan tapos alt Enter lang.
        b reference variable is casted to Lion. Kaya mejo maraming parethesis yan to ensure b is casted as Lion
        bago pa tawagin yun roar() method
         */

        Lion c = (Lion) b;
        /*
        b is reference type variable ng Animal class pero sa
        (Lion) b - sinabi ko na b is as a Lion
         */



    }

}
