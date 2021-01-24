package SoloLearn.EqualsHashCode;

public class ComplexRunner {

    public static void main(String[] args) {

        Complex c1 = new Complex(1.1,2.2);
        Complex c2 = new Complex(1.1,2.2);

        System.out.println(c1.equals(c2));
        /*
        Output:
        false nung wala pang equal and hashCode overide
         */

        System.out.println(c1 == c2);
        /*
        Output:
        false
         */



    }
}
