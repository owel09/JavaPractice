package Fundamentals.Abstract;

abstract class Phone {

    public void call(){
        System.out.println("Calling Normal");
    }
    /*
    Since alam ko kung paano gagawin yun call method, May body ito which is
    also called method definition
     */

    abstract public void text();

    abstract public void addContacts();

    abstract public void move();

    abstract public void dance();

    abstract public void cook();
    /*
    abstract method declaration ng methods kung di mo pa alam kung paano sila
    gagamitin
     */
}
