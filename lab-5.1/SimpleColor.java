/**
 * @author Patrick O'Brien
 * @version 10/27/2019
 * SimpleColor Class
 * */
//TODO: if you use this class because you dont have your
//previous SimpleColor, you must document the code with comments
//and fix the setters so they don't invalidate the [0-255] rule
public class SimpleColor{
// Declare instance variables rgb
	private int r;
	private int g;
	private int b;


	/**
	 * Getter for red var
	 * */
	public int getR() {
		return r;
	}

	/**
	 * Setter for red var
	 * @param r = red value, 0-255 inclusive
	 * */
	public void setR(int r) {
		if (this.r < 0 || this.r > 255) {
			throw new ColorException();
		}
		this.r = r;
	}

	/**
	 * Getter for green var
	 * */
	public int getG() {
		return g;
	}

	/**
	 * Setter for green var
	 * @param g = gree value, 0 to 255 inclusive
	 * */
	public void setG(int g) {
		if (this.g < 0 || this.g > 255) {
			throw new ColorException();
		}
		this.g = g;
	}

	/**
	 * getter for blue value
	 * */
	public int getB() {
		return b;
	}

	/**
	 * Setter for blue value
	 * @param b = blue value, 0 to 255 inclusive
	 * */
	public void setB(int b) {
		if (this.b < 0 || this.b > 255) {
			throw new ColorException();
		}
		this.b = b;
	}

	/**
	 * Color setter method for rgb vals
	 * Calls the setter methods
	 * @param a = red val
	 * @param b = green val
	 * @param c = blue val
	 * */
	public void setColor(int a, int b, int c) {
		setR(a);
		setG(b);
		setB(c);
	}

	/**
	 * Default constructor, no vals
	 * */
	public SimpleColor() {}

	/**
	 * Override constructor
	 * @param r = red val
	 * @param g = green val
	 * @param b = blue val
	 * */
	public SimpleColor(int r, int g, int b) {
		setR(r);
		setG(g);
		setB(b);
	}

	/**
	 * Copy constructor
	 * Takes a SimpleColor object
	 * and sets the instance var values
	 * of that object to be the vals of this object.
	 * */
	public SimpleColor(SimpleColor b) {
		this(b.r,b.g,b.b);
	}
	
}
