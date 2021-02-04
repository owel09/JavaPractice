package Fundamentals.ArrayList;/*
 *Created by User on Oct, 2019 8:25 AM

 User-defined class objects in ArrayList
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentArrayList {

    public static void main(String[] args) {

        Student s1 = new Student(1,"owelcute",28);
        Student s2 = new Student(2,"lucas",2);
        Student s3 = new Student(3,"jor",30);

        ArrayList <Student> studentList = new ArrayList<Student>();
        /*
        declaring class Student in ArrayList
         */

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Iterator itr = studentList.iterator();

        while(itr.hasNext()){

            Student st = (Student)itr.next();
            System.out.println(st.rollno + " "+ st.name + " "+ st.age);
        }

        System.out.println("-----------------------------------------");
        //declare subList using studentList
        List<Student> subStudentList = studentList.subList(0,1);

        //USING ITERATOR IN THE SUBLIST
        Iterator iterator = subStudentList.iterator();

        while (iterator.hasNext()){
            //ito mejo diko maget yung pagdeclare ng (Student)iterator.next();
            Student student = (Student)iterator.next();
            System.out.println(student.rollno + " "+ student.name + " "+ student.age);
        }






    }

}
