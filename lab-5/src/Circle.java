import java.awt.*;
import java.awt.geom.*;
/**
 * @author Patrick O'Brien
 * @version 10/28/2019
 *
 * getArea
 * */
class Circle extends Shape {

    private double RADIUS = 10;

    public Circle(int x, int y) {
        super(x, y);
    }

    /**
     * Given by pir^2
     * */
    @Override
    public double getArea() {
        return (Math.PI * (getRadius() * getRadius()));
    }

    @Override
    public void draw(Graphics g) {

        g.draw3DRect(10,4,3, 4, true);
//        Graphics2D g2d = (Graphics2D) g;
//
//        final int x = getX();
//        final int y = getY();
//
//        g2d.setColor( Color.GREEN );
//        g2d.setPaint( new GradientPaint( x, y, Color.GREEN, x +
//                RADIUS/4, y + RADIUS/4, Color.BLACK, true) );
//
//        int xOffset = 0;
//        int yOffset = 0;
//
//        for (int i = 0; i < DENSITY; i++) {
//            xOffset = (int) (Math.random()*RADIUS);
//            yOffset = (int) (Math.random()*RADIUS);
//            g2d.draw( new Ellipse2D.Double( x + xOffset, y +
//                    yOffset, x + xOffset+3, y + yOffset+3) );
//        }
    }

    public double getRadius() {
        return RADIUS;
    }
}
