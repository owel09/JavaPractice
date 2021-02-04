package Fundamentals.EqualsHashCode;

import java.util.GregorianCalendar;

public class GetClass {

    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();

        System.out.println("" + cal.getTime());

        System.out.println("" + cal.getClass());
        /*
        Output:
        class java.util.GregorianCalendar

        napriprint yung class runtime nya. Inaral ko kasi ginagamit nya sa equals() method
         */

        Integer i = new Integer(5);

        System.out.println(""+i);

        System.out.println(""+ i.getClass());
        /*
        Output:
        class java.lang.Integer
         */
    }
}
