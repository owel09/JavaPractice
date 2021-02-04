package Fundamentals.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by 1528394 on 1/7/2020.
 */
public class CalliSetIterate {

    public static void main(String[] args) {

        Set<String> progLang = new HashSet<String>();

        progLang.add("Java");
        progLang.add("Php");
        progLang.add("C++");
        progLang.add("Cobol");
        progLang.add("Phyton");

        System.out.println("--------------------------------");
        System.out.println("ITERATE USING LAMBDA EXPRESSION");

        progLang.forEach(a->{
            System.out.println(a);
        });
        /*
        progLang.forEach(progLang->{
         System.out.println(progLang);
        });
        Variable progLang is already defined in the scope

        dinideclare ko daw yung same variable?
         */

        System.out.println("---------------------------------------------------------------------");
        System.out.println("ITERATE USING ITERATOR");

        Iterator itr = progLang.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.println("ITERATE USING ITERATOR WITH GENERICS AND PRINTER VARIABLE");

        Iterator<String> itr1 = progLang.iterator();
        while (itr1.hasNext()){
            String itr1printer = itr1.next();
            System.out.println(itr1printer);
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.println("ITERATE USING ITERATOR WITH FOREACHREMAINING METHOD WITH LAMBDA");

        Iterator itr3 = progLang.iterator();
        itr3.forEachRemaining(b->{
            System.out.println(b);
        });

        System.out.println("---------------------------------------------------------------------");
        System.out.println("ITERATE USING ENHANCED FOR LOOP");


        for(String c : progLang){
            System.out.println(c);
        }


    }
}