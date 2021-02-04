package Fundamentals.EqualsHashCode;

import java.util.Objects;

public class Complex {

    private double re,im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        /*
        If the object compared with itself then return true;
         */

        if (!(o instanceof Complex)) return false;
        /*
        Check if o is an instance of Complex of not
        return false
         */

        Complex complex = (Complex) o;
        /*
        typecast o to Complex so we could compare data members
         */

        return Double.compare(complex.re, re) == 0 &&
                Double.compare(complex.im, im) == 0;
        /*
        compare data members and return accordingly
         */
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
