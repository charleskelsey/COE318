package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * @author Charles Kelsey
 */
public class ComplexNumber {
    public double real;
    public double imaginary;

    /**
     * Construct a ComplexNumber given its real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double re, double im) {
        this.real = re;
        this.imaginary = im;
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
        return this.real;
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return this.imaginary;
    }

    /**
     * Returns a new ComplexNumber number that is the negative of <em>this</em>.
     * Note: the original ComplexNumber is <b>NOT</b>
     * modified.
     *
     * @return -this
     */
    public ComplexNumber negate() {
        double num1, num2;
        
        num1 = this.getReal();
        num2 = this.getImaginary();
        
        ComplexNumber negate = new ComplexNumber(-num1, -num2);
        return negate;
    }

    /**
     * Returns a new ComplexNumber that is the sum of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
        double num1, num2, num3, num4;
        
        num1 = this.getReal();
        num2 = z.getReal();
        
        num3 = this.getImaginary();
        num4 = z.getImaginary();
        
        ComplexNumber sum = new ComplexNumber(num1 + num2, num3 + num4);
        return sum;
    }

    /**
     * Returns a new ComplexNumber that is the difference of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber subtract(ComplexNumber z) {
        double num1, num2, num3, num4;
        
        num1 = this.getReal();
        num2 = z.getReal();
        
        num3 = this.getImaginary();
        num4 = z.getImaginary();
        
        ComplexNumber difference = new ComplexNumber(num1 - num2, num3 - num4);
        return difference;
    }

    /**
     * Returns a new ComplexNumber that is the product of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
        double num1, num2, num3, num4;
        
        num1 = this.getReal();
        num2 = z.getReal();
        
        num3 = this.getImaginary();
        num4 = z.getImaginary();
        
        ComplexNumber product = new ComplexNumber((num1 * num2) - (num3 * num4), (num1 * num4) + (num3 * num2));
        return product;
    }

    /**
     * Returns a new ComplexNumber that is the reciprocal of <em>this</em>.
     * Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        double num1, num2, denominator;
        
        num1 = this.getReal();
        num2 = this.getImaginary();
        denominator = (num1 * num1) + (-(num2 * -num2));
        
        ComplexNumber reciprocal = new ComplexNumber(num1 / denominator, -num2 / denominator);
        return reciprocal;
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this / z
     */
    public ComplexNumber divide(ComplexNumber z) {
        double num1, num2, num3, num4;
        
        num1 = this.getReal();
        num2 = z.getReal();
        
        num3 = this.getImaginary();
        num4 = z.getImaginary();
        
        ComplexNumber quotient = new ComplexNumber(((num1 * num3) + (num2 * num4)) / ((num3 * num3) + (num4 * num4)), ((num2 * num3) - (num1 * num4)) / ((num3 * num3) + (num4 * num4)));
        return quotient;
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imaginary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}
