package Fundamentals.Inheritance_Overloading;

public class DiffParameters {

    public static double max(double a, double b){
        if(a>b){
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }

    public static int max(int a, int b, int c){
        if ((a>b) && (a>c)){
            return a;
        } else if ((b>a)&&(b>c)){
            return b;
        } else {
            return c;
        }

    }

    public static void main(String[] args) {
        System.out.println(max(1,2));
        System.out.println(max(1.2,3.4));
        System.out.println(max(5,6,7));
    }
}
