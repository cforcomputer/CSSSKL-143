//This class represents a box with a width, height, and depth.
//The variable grade is a measure of the thickness of the cardboard
//used to construct the box.

public class Box { // fixed Box2 to box

	private int width, depth;
	private static int height, grade;

	//class constructor
	public Box(int width, int height, int depth, int grade) // corrected Box2 to Box, removed void
	{
		// change to this. so that it refers to the class and instance variables instead of doing nothing
		this.width = width;
		Box.height = height;
		this.depth = depth;
		Box.grade = grade;
	}

	//Two boxes should be considered equivalent if their volume is
	//the same and they are constructed out of the same grade of cardboard.
	//returns true if they are equivalent and false otherwise
	public boolean equals(Box b)
	{
		return (this.getVolume() == b.getVolume()) && (this.getGrade() == b.getGrade()); //fixed = to ==
	}

	//If this Box is larger than the argument Box b
	//then return this Box - otherwise return b
	public Box larger(Box b)
	{
		// if this Box (b.getVolume) is larger than the argument Box b (Box b param) then
		// return this box
		if(this.getVolume() >= b.getVolume()) // added this. to getVolume()
		{
			return this;
		}
		return b;
	}

	//Simple getter methods
	public int getGrade()
	{
		return grade; // fixed from 'return g'
	}

	public int getVolume()
	{
		return getHeight() * getWidth() * getDepth(); // removed grade from calculation
	}

	public int getWidth()
	{
		return this.width;
	}

	public int getHeight() // changed from double to int
	{
		return height;
	}

	public int getDepth() // removed param int b
	{
		return this.depth;
	}
}

