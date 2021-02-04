package Fundamentals.Interface;

public interface Animals {

    public void eat();

    public void travel();

    default void walk(){
        System.out.println("default method");
    }
    /*
    method ng interface na may body pero
     dapat naka default method mode sya
     */

}
