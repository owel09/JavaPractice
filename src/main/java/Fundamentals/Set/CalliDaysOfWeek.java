package Fundamentals.Set;
/*
PRINT DAYS OF THE WEEK USING ITERATOR
 *Created by owel on 07/01/2020 7:13 AM
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CalliDaysOfWeek {
    public static void main(String[] args) {

        Set<String> daysOfWeek = new HashSet<>();

        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        System.out.println(daysOfWeek);

        Iterator itr = daysOfWeek.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
