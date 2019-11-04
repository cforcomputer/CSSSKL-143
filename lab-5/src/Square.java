import java.awt.*;

public class Square extends Shape {

    private final int SIDE = 10;

    public Square(int length) {
        super(length, 10);
    }
    @Override
    public double getArea() {
        return SIDE * SIDE;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(SIDE, SIDE, SIDE, SIDE);
    }
}
