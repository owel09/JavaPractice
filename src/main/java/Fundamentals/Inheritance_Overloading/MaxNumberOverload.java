package Fundamentals.Inheritance_Overloading;

/*

max method lang yun ginamit ko pero nagamit ko siya sa iba't ibang data type
at number of parameters

Output:
The max number between 2 int: 2
The max number between 2 double: 3.4
The max number between 3 double: 9.0
 */

public class MaxNumberOverload {

    public static int max(int num1, int num2){

        if(num1>num2){
            return num1;
        }
        else
            return num2;
    }

    public static double max(double num1, double num2){

        if(num1>num2){
            return num1;
        }
        else
            return num2;
    }

    public static double max(double num1, double num2, double num3){

        return max(max(num1,num2),num3);
    }

    public static void main(String[] args) {
        System.out.println("The max number between 2 int: " + max(1,2));
        System.out.println("The max number between 2 double: " + max(1.2,3.4));
        System.out.println("The max number between 3 double: " + max(5.6,7.8,9.0));

    }

}
