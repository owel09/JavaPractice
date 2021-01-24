package SoloLearn.Casting;

/*
passing smaller type to larger size
int -> double
Automatic daw ito pero bakit?

 */

public class WideningCasting {

    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        /*
        Output:
        9
        9.0

        nagkaroon ng decimal point yun myInt ko
         */
    }

}
