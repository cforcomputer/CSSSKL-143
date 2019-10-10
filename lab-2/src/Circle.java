/**
 * @author Patrick O'Brien
 * @version 1.0
 * 10/07/2019
 * Class design - Deeper Class Design - the Circle Class
 * */
public class Circle {
    // Q: What's a good type of primitive for this? Squares are flat, so an int
    // may be easier than a float.
    private int x;
    private int y;
    private double radius;
    private double area;
    private String represent = "O";

    public Circle() // default constructor
    {
    }

    public Circle(int nx, int ny) // overloading
    {
        this.x = nx;
        this.y = ny;
    }

    public Circle(int nx, int ny, double rad) // overloading
    {
        this.x = nx;
        this.y = ny;
        this.radius = rad;
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
    public double getRadius()
    {
        return radius;
    }
    public void setY(int ny)
    {
        y = ny;
    }
    public void setX(int nx)
    {
        x = nx;
    }
    public void setRadius(double rad)
    {
        radius = rad;
    }
    // Returns the calculated area for the circle
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    // Build a reporting method called toString() that returns the characters
    // associated with that shape.
    @Override
    public String toString()
    {
        return represent;
    }

    // Build an equals function to determine if two squares are the same
    public boolean equals(Circle that)
    {
        return this.radius == that.radius;
    }
}
