import java.awt.*;

/**
 * @author Patrick O'Brien
 * @version 11/4/2019
 *
 * Fractals & depth-limited recursion
 * */

public class FractalFlake extends Shape { // build a new class that extends shape
    // define a private final into to manage snowflake limit
    private final int LIMIT = 10;
    // define a second private final int to manage the number
    // of branches for the flake
    private final int BRANCHES = 7;

    /**
     * 3.
     * Build a suitable constructor for FractalFlake that invokes the superclass constructor as the first
     * line of code.
     * a. In our examples, these flakes will have a size variable, which you should pass to the
     * constructor for your FractalFlake to store
     * b. Our FractalFlake also has a branching factor, which should be handed to the constructor
     * for our class to manage.
     * @param size = size variable
     * @param bFactor = branching factor
     * */
    public FractalFlake(int size, int bFactor) {
        super(size, bFactor);
    }

    /**
     * Override the draw function so that it invokes a second draw function that takes more
     * parameters than just the Graphics object
     * */
    @Override
    public void draw(Graphics g) { // redirect or facade
        draw(g, getX(), getY(), LIMIT);
    }

    /**
     * Overload the draw() function by defining a new draw function that
     * takes a start x,y coordinate pair, a limit, and a graphics object to render to, as in:
     * */
    private void draw(Graphics g, int startX, int startY, int limit) {
        // provides a limit to the number of times the function will call itself
        if (limit >= 3) { // base case is depth < 3
            for ( int i = 0; i < BRANCHES; i++) {
                int x2 = startX + (int) (limit *
                        Math.cos((2* Math.PI / BRANCHES) * i));
                int y2 = startY - (int) (limit *
                    Math.sin((2 * Math.PI / BRANCHES) * i));

                g.drawLine(startX, startY, x2, y2); // do a branch
                draw(g, x2, y2, limit / 3);
            }
        }
    }
    //    public static void main(String[] args) {
//
//        // Build a suitable constructor for FractalFlake that invokes the
//        // superclass constructor as the first line of code
//    }


}
