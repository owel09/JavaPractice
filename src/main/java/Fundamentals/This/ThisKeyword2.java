package Fundamentals.This;

public class ThisKeyword2 {
    private int a;
    private int b;

    public void setData(int a, int b){
        this.a=a;
        this.b=b;
    }

    public void show(){
        System.out.println("The value of a is: " + a +
                         "\nThe value of b is: " + b);
    }

    public static void main(String[] args) {
        ThisKeyword2 obj = new ThisKeyword2();
        obj.setData(1,2);
        obj.show();

    }
}
