/**
 * @author Patrick O'Brien
 * @version 10/27/2019
 * */

public class ColorWithAlpha extends SimpleColor {
    // Add a new int called "alpha for use in
    // determining the color's alpha channel
    private int alpha;

    // Define getters and setters for the new alpha channel
    /**
     * Setter for alpha instance var
     * @param al = alpha value
     * */
    public void setAlpha(int al) {
        alpha = al;
    }

    /**
     * Getter for alpha instance var
     * */
    public int getAlpha() {
        return alpha;
    }

    /**
     * Build a constructor that only takes one alpha value
     * Should initialize RGB to 0
     * @param val = alpha value
     * */
    public ColorWithAlpha(int val) {
        this.alpha = val;
        // should initialize RGB to 0
        setColor(0,0,0);
    }

    /**
     * Build a second (overloaded) constructor that takes 4 values
     * (RGBA) and calls the superclass constructor to initialize
     * the RGB values.
     * - The first line of your constructor will be "super(r,g,b)"
     *
     *  Q: What does this line accomplish? What function are we calling?
     * A: super() calls the parent constructor of the inherited class.
     * By calling super(r,g,b) we're setting the rgb values
     * of the SimpleColor constructor.
     * @param a = alpha
     * @param r = red
     * @param g = green
     * @param b = blue
     * */
    public ColorWithAlpha(int r, int g, int b, int a) {
        super(r,g,b); // first line of constructor
        this.alpha = a; // initialize alpha
    }

    /**
     * Build a third (overloaded) copy constructor that takes
     * an existing ColorWithAlpha object as the input
     * @param alphaObj = new ColorWithAlpha class obj
     * */
    public ColorWithAlpha(ColorWithAlpha alphaObj) {
        this.alpha = alphaObj.alpha;
    }

    /**
     * Override the toString() function to print out your "(R,G,B,A)"
     * values as we do below
     * Q: What does the following call to super do?
     * A:
     * */
    @Override
    public String toString() {
        return super.toString() + ", alpha:" + alpha;
    }

    /**
     * Override the equals(Object o) function to determine if two
     * ColorsWithAlpha are equal.
     * @param o = input as ColorsWithAlpha class object
     * */
    @Override
    public boolean equals(Object o) {
        // if the object is empty/null
        if (o == null) {
            return false;
        }
        // if the object input is not ColorsWithAlpha
        if (!(o instanceof ColorWithAlpha)) {
            return false;
        }
        // return true if alpha between both objects are the same
        return this.alpha == ((ColorWithAlpha) o).alpha;
    }
}
