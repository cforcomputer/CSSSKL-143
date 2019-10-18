/**
 * @author Patrick O'Brien
 * @version 1.0
 * Math2 Class
 * Lab 3
 * */

// All methods & data must be static
public class Math2 {
    // not instance variables, just static shared data
    public static final double pi = Math.PI;
    public static final double e = Math.E;
    // Question: Should we make this data private? public?
    // Answer: public

    public static int max(int a, int b)
    {
        return Math.max(a, b);
    }

    public static double max(double a, double b)
    {
        return Math.max(a, b);
    }

    public static int pow(int base, int exp)
    {
        return (int) Math.pow(exp, base); // cast is temp fix
    }

    //    Sample Output
    //
    //    The larger of the two is 20.0
    //    And the larger of the two is 10.34
    //            2^8 is 256

}
