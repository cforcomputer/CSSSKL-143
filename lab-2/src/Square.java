/**
 * @author Patrick O'Brien
 * @version 1.0
 * 10/07/2019
 * Class design - Deeper Class Design - the Square Class
 * */
public class Square {
    // Q: What's a good type of primitive for this? Squares are flat, so an int
    // may be easier than a float.
    private int x;
    private int y;
    private double sideLength;
    private String represent = "[]";

    public Square() // default constructor
    {
    }

    public Square(int nx, int ny) //overloading
    {
        this.x = nx;
        this.y = ny;
    }

    public Square(int nx, int ny, double side)
    {
        this.x = nx;
        this.y = ny;
        this.sideLength = side;
    }
    // Build a draw method that outputs to the console the characters representing shape
    public void draw()
    {
        System.out.println(represent);
    }
    // Getters and setters
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public double getSideLength()
    {
        return sideLength;
    }
    public void setY(int ny)
    {
        y = ny;
    }
    public void setX(int nx)
    {
        x = nx;
    }
    public void setSideLength(int sl)
    {
        sideLength = sl;
    }

    public double getArea() // returns the calculated area of the square
    {
        return sideLength * sideLength;
    }
    // Build a reporting method called toString() that returns the characters
    // associated with that shape.
    @Override
    public String toString()
    {
        return represent;
    }

    // Build an equals function to determine if two squares are the same
    public boolean equals(Square that)
    {
        return this.sideLength == that.sideLength;
    }
}
