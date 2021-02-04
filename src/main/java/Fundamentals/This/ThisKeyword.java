package Fundamentals.This;

public class ThisKeyword {

    private int x;
    /*x is instance variable.Ibig sabihin variable o pagmamay-ari sya ng ThisKeyword class
    */


    public ThisKeyword(int x) {
        this.x = x;
    }
    /*
    Constructor para mai-initialize yun value ng x kapag gumawa tayo ng instance sa main method
    x is local variable. yung "int x" at "x;" magkaparehas sila.
    sinadya kong gawin parehas na x para magamit yun "this"
    "this.x" ay tumutukoy sa instance variable.
     */

    public void show(){
        System.out.println("The value of x is:" + x);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(7);
        obj.show();

        ThisKeyword obj1 = new ThisKeyword(8);
        obj1.show();

    }
}
