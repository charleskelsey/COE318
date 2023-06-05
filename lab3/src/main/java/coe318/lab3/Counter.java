/**
 *
 * @author Charles Kelsey
 */
package coe318.lab3;
public class Counter {
    private int mod;
    private Counter lef;
    private int dig;
    
    //Instance variables here
    public Counter(int modulus, Counter left) {
        this.mod = modulus;
        this.lef = left;
    }

    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.mod;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        if (this.lef == null) {
            return null;
        } else {
            return this.lef;
        }
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return this.dig;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        while (this.dig > 0) {
            this.increment();
            this.dig--;
        }
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        this.dig += 1;
        if (this.dig == this.mod) {
            this.dig = 0;
            if (this.lef != null) {
                this.lef.increment();
            }
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if (this.lef == null) {
            return this.dig;
        } else {
            return this.dig + this.mod * this.lef.dig; //mod * count of lef
        }
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
