package SoloLearn.Enum;

public class OperationRunner {
    public static void main(String[] args) {

        System.out.println(Operation.PLUS);
        System.out.println(Operation.PLUS.calculate(1,1));
        /*
        Output:
        PLUS
        2.0

        di pwedeng gumawa ng instance yun enum kaya tinawag ko agad siya sout
         */


        Operation op = Operation.valueOf("multiply".toUpperCase());
        System.out.println(op.calculate(3,3));
        /*
        Output:
        9.0

        gumuwa ako ng op object para gamitin yun na pang-call calculate method.
        tapos ginamit ko ng toUpperCase methhod para gawing uppercase yun value ng String
         */


    }
}
