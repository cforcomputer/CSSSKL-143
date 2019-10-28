/**
 * @author Patrick O'Brien
 * @version 10/27/2019
 * */

public class ColorException extends RuntimeException {

    public static void main(String[] args) {
        throw new ColorException("A test in main");
    }
    /**
     * Build a default, no-arg constructor that contains only one line.
     * */
    public ColorException() {
        super("An error occurred in color");
    }

    /**
     * Overload your constructor with a second constructor that takes a String
     * "msg" as input.
     * */
    public ColorException(String msg) {
        super(msg);
    }

}
