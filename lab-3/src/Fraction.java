/**
 * @author Patrick O'Brien
 * @version 1.0
 * Fraction Class
 * Lab 3
 * */

public class Fraction {

    public final int numerator = 5; // Question: Why don't we make this data private?
                                    // Answer: Because it is immutable and cannot be changed, making it safe
    public final int denominator = 10;

    // Define a constructor that takes a numerator and a denominator
    public Fraction(int num, int denom)
    {
        // Question: Do not define a no-argument constructor. Why?
        // Answer: Because the instance variables are final and will always be defined, thus there is no need to handle
        // a call with no arguments.
    }
    // Define a constructor that takes a Fraction object and makes a copy of it
    public Fraction(Fraction other)
    {

    }

    /**
     * Overrides toString to return the results as a concatenated string
     * */
    @Override
    public String toString()
    {
        return "";
    }

    /**
     * Define an add function that takes a fraction, adds it to this, then returns a new Fraction object that is
     * the result of the addition of the two.
     * */
    public void add(Fraction that) //add this and that together; remember to consider the denominator here!
    {

    }

    /**
     * Define an equals(Object o) function
     * */
    public boolean equals(Object other) {
        if( other != null && ! (other instanceof Fraction ) ) return false;
        //what does this code do?
        Fraction that = (Fraction) other;
        //and this code?
        //todo: code goes here
        return false; // placeholder
    }

    //    Sample Output
    //
    //    a:1\2
    //    b:3\4
    //    c:3\4
    //    a:10\8
    //    b:3\4
    //    c:3\4
    //    a.equals(b):false
    //    b.equals(c):true


}
