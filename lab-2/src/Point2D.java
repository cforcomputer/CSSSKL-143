import java.security.cert.PolicyNode;

/**
 * @author Patrick O'Brien
 * @version 1.0
 * 10/07/2019
 * Class design - Point2D
 * */

public class Point2D {

    // Class will store two integers, x and y
    private int x;
    private int y;
    // Question: what effect does "private" have for methods trying to use x or y inside this class file?
    // Answer: It makes it so that the x and y variables can only be used inside the class file. Beyond that,
    // the effect of x and y inside methods is nearly the same as if they were public.
    // Question: What about methods trying to use x and y outside this class?
    // Answer: Methods outside the class would no longer be able to use the x and y variables without
    // getters and setters.
    // Question: can you x and y without an associated instance?
    // Question: Only within the class (object/instance) that they are declared in. As private instance variables,
    // they could not be used in an unassociated object/instance.
    public static void main(String[] args)
    {
        // Sample driver to use as a starting point
        Point2D a = new Point2D();
        a.setX(5);
        a.setY(2);
        System.out.println("Point at (" + a.getX() + "," + a.getY() + ")");
        a.translate(-1,-1);
        System.out.println("Point at (" + a.getX() + "," + a.getY() + ")");
        a.resetToOrigin();
        System.out.println("Point at (" + a.getX() + "," + a.getY() + ")");
        Point2D b = new Point2D();
        Point2D c = new Point2D();
        System.out.println(b.toString());
        System.out.println(c); // Question: why don't I need c.toString() here?
        // A: Because you are demonstrating how it will print the same string once it has been overridden once.
        System.out.println("Are b and c equal:" + b.equals(c));
    }
    // This method set private variable x = nX
    public void setX(int nX)
    {
        x = nX;
    }
    // This method set private variable y = nY
    public void setY(int nY)
    {
        y = nY;
    }
    // This method should return a copy of private integer x
    public int getX()
    {
        return x;
    }
    // This method should return a copy of private integer y
    public int getY()
    {
        return y;
    }
    // This function sets both x and y to zero
    public void resetToOrigin()
    {
        x = 0;
        y = 0;
    }
    // This method adds dx to x, and dy to y
    public void translate(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    @Override //Question: what does override do? A: It tells the compiler that you're overriding the method of a parent
    // class. Will tell you if there is a problem with the override.
    public String toString()
    {
        return x + "," + y;
    }
    //@Override not used here on purpose
    public boolean equals(Point2D that)
    {
        // compare this vs that
        // returns true if this is equal to that, don't just use "this == that"
        // if not this == that, then x.isEqual(toString(that))
        return this.x == that.getX() && this.y == that.getY();
    }
}
