package Basic.DataTypes;

import java.util.Iterator;

/*
REFERENCE DATA TYPE / NON-PRIMITVE / OBJECT REFERENCE VARIABLE
- used to call methods
- normally created by programmers to do operations na wala pa sa java
- can be null
- Starts with Uppercase
- (Class, Object, String, Array, Interface) size varies
- sa stack memory, address sa heap memory lang laman nya
- passing non-primitive data type to a method, is actually passing an address of that object where data is stored
- Reference variable vs Object - youtube.com/watch?v=uysP1bCjgTU
- What is non-primitive - https://www.scientecheasy.com/2020/06/non-primitive-data-types-in-java.html/
 */
public class ReferenceDataType {
    public static void main(String[] args) {

        String greeting = "Hello World";
        System.out.println(greeting);

        School referenceVariable;
        //School - name of the class
        //referenceVariable - reference variable, that store the address in the heap memory

        School referenceVariable1 = new School();
        System.out.println(referenceVariable1);
        //referenceVariable1 - siya yung reference variable. nirerefer nya yung object created by "new"
        //new School - ito yun object na nirerefer ng referenceVariable1
        //Basic.DataTypes.Object1@63947c6b - kasi address yan sa heap memory
    }
}

class School {


}
