package JavaBrains.unit1;

/*LESSON 10 - TYPE INTERFACE
meron binding between lambda expression and interface.
Interface provides the input argument type kaya pwede na burahin yung "String" sa lambda

LambdaInterface MyLambda = s -> s.length();
-shortest way to write a lambda expression with 1 input argurment.
-this is a function that takes that takes a String input arg, String kasi String yung input arg sa Interface
-return type is int kasi int yun nasa interface


 *Created by owel on 20/04/2020 8:29 AM
 */
public class TypeInterface {

    public static void main(String[] args) {

        LambdaInterface MyLambda = s -> s.length();
        /*
        When you assign (String s) -> s.length(); to variable MyLambda, java match the type based on LambdaInterface
         */

        printLambda(MyLambda);
        printLambda(s -> s.length());
    }

    public static void printLambda(LambdaInterface lambdaInterface){ //method take takes LambdaInterface. Like greet()
        System.out.println(lambdaInterface.getLength("owel"));
    }


}

interface LambdaInterface {

    int getLength(String s); //getLength() that takes String

}
