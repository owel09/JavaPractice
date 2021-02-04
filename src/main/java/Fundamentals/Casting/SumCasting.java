package Fundamentals.Casting;

public class SumCasting {

    public static void main(String[] args) {

        double double1 = 9.5;
        double double2 = 10.1;

        System.out.println(sum(double1,double2));

        /*
        Output:
        19.6
         */


        //noCast(double1,double2);
        /*
        Error. naka int kasi yun argument ng method noCast(int x, int y)
        di sila match
         */

        sumCastedInt((int)double1,(int)double2);
        /*
        Output:
        19
        di siya nagerror kasi gumamit ako ng Narrowing Casting.
        Cinonvert yun double variable na double1 at double2 para maging int.
        pagpasok ng method sumCastedInt, naka int na yun. x=9 y=10
        Ibig sabihin yun mapapasa sa kanya is naka-int mode na agad
         */

        sumCastedDouble((int)double1,(int)double2);

        /*
        Output:
        19.0
        mejo weird pero narealize ko na yung papasok sa method sumCastedDouble
        is double mode agad x=9.0 and y=10.0 bakit?
         */

    }

    public static double sum(double x, double y){
        return  x + y;
    }

    public static void noCast(int x, int y){
        System.out.println(x+y);
    }

    public static void sumCastedInt(int x, int y){
        System.out.println(x+y);
    }

    public static void sumCastedDouble(double x, double y){
        System.out.println(x+y);
    }
}
