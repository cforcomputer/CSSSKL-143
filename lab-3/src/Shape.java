import java.awt.*;

/**
 * @author Patrick O'Brien
 * @version 1.0
 * Shape Class
 * Lab 3
 * */

public class Shape {
    // Declare 4 class invariants for the Shape class as comments and submit them.
    // A class invariant is simply a property that holds for all instances of a class, always,
    // no matter what other code does
    // Ex: class X { final Y y = new Y();)}

    public Shape() {} // Default constructor
    public Shape(int x, int y, Color color) // remember imports from class Color
    {

    }
    public Shape(Shape other)
    {

    }
    @Override
    public String toString()
    {
        return "";
    }
    public double getArea() // to be replaced by subclasses, return -1 here
    {
        return -1;
    }
    public void draw(Graphics g) // to be used by the paint program, empty for now
    {

    }

    //    Sample Output
    //
    //    a: Shape (120,0) and color:null and area: -1
    //    b: Shape (10,140) and color:java.awt.Color[r=64,g=64,b=64] and area: -1
    //    c: Shape (10,10) and color:java.awt.Color[r=64,g=64,b=64] and area: -1
}
