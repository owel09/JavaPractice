package SoloLearn.Wrapper;/*
 *Created by User on Oct, 2019 8:46 AM
 */

public class WrapperSam {

    public static void main(String[] args) {
        int i = 5;
        Integer iObj = new Integer(i);
        System.out.println(iObj);
        /*
        Output:
        5

        wrapping, converting variable i into object that contains 5
         */

        int j = iObj.intValue();
        System.out.println(j);
        /*
        Output:
        5

        unwrapping, taking out the value from the object
         */

    }



}
