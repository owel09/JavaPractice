package Fundamentals.Set;

import java.util.HashSet;
import java.util.Set;

/*
 *Created by owel on 08/01/2020 8:16 AM
 */
public class CalliSetCustomerMain {

    public static void main(String[] args) {

        CalliSetCustomer cust1 = new CalliSetCustomer("owel",28);
        CalliSetCustomer cust2 = new CalliSetCustomer("jor",30);
        CalliSetCustomer cust3 = new CalliSetCustomer("lucas",9);


        Set<CalliSetCustomer> calliSetCustomerSet = new HashSet<>();

        calliSetCustomerSet.add(cust1);
        calliSetCustomerSet.add(cust2);
        calliSetCustomerSet.add(cust3);
        calliSetCustomerSet.add(new CalliSetCustomer("jor",30));


        for(CalliSetCustomer i: calliSetCustomerSet){

            System.out.println(i);
        }
        /*
        kahit sinubukan ko mag-add ng jor, 3 pa rin yung na laman ng calliSetCustomerSet kasi di tumatanggap yun Set ng duplicate
         */

        /*
        kapag reference lagi yung lumabas, dahil wala ka kasing toString method sa CalliSetCustomer
        [Set.CalliSetCustomer@653d52e, Set.CalliSetCustomer@31e1b2, Set.CalliSetCustomer@beea9f9e]
         */

        //TODO What is the diff between Collection and Collections?
    }


}
