package Fundamentals.Inheritance_Constructor;

/*
Tinawag yung constructor ng SuperClassA nung naginstantiate ako ng sa SubClassB
kaya magpprint yun
New A
New B

PERO BAKIT NAGPRINT AGAD?
-------------------------
because he created a constructor for class A and B. in the line:
public A()
public B()
constructor is special method. when an object of a class is created ,
automatically the constructor method is executed without calling it .
so when he created obbject for class B ,
its constructor is executed and also the constructor of class
A executed because class B is subclass from class A .
 */
public class Runner {

    public static void main(String[] args) {
        SubClassB B = new SubClassB();
    }


}
