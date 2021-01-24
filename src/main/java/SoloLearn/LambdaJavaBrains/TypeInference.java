package SoloLearn.LambdaJavaBrains;

/*lambda function that takes a string and returns the length of the string
 *Created by owel on 01/03/2020 6:16 PM
 */
public class TypeInference
{
    public static void printLambda(StringLength sl){
        System.out.println(sl.getLength("hellolength1"));
    }

    public static void main(String[] args)
    {
//        StringLength mylambda = s -> s.length(); //function takes an argument string and return it
        /*
        pinapakita dito kung paano nakakatulog yung interface StringLength para sa lambda
        kumbaga nasa interface lahat ng information
         */
//        System.out.println(mylambda.getLength("hellolength")); //mylambda behaves like an instance of interface kaya nakuha nya yung getLength

//        printLambda(mylambda);

        printLambda(s -> s.length());

    }
}
