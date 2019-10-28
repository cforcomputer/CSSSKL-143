//TODO: if you use this class because you dont have your
//previous SimpleColor, you must document the code with comments
//and fix the setters so they don't invalidate the [0-255] rule
public class SimpleColor{
	private int r;
	private int g;
	private int b;


	public int getR() {
		return r;
	}

	public void setR(int r) {
		if (this.r < 0 || this.r > 255) {
			throw new ColorException();
		}
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		if (this.g < 0 || this.g > 255) {
			throw new ColorException();
		}
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		if (this.b < 0 || this.b > 255) {
			throw new ColorException();
		}
		this.b = b;
	}

	public void setColor(int a, int b, int c) {
		setR(a);
		setG(b);
		setB(c);
	}
	public SimpleColor() {}
	
	public SimpleColor(int r, int g, int b) {
		setR(r);
		setG(g);
		setB(b);
	}
	public SimpleColor(SimpleColor b) {
		this(b.r,b.g,b.b);
	}
	
}
