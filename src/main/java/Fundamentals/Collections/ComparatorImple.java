package Fundamentals.Collections;/*
 *Created by owel on 27/12/2019 7:25 AM
 */

import java.util.Comparator;

public class ComparatorImple implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        if(o1%10>o2%10){

            //return 1 means exchange, changing the logic (o1<o2) will reverse the sort
            return 1;
        }

        //dati return 0 siya pero ginawa kong -1 para gumana
        return -1;
    }
}
