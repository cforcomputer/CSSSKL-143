/**
 * Output obstructed by ArrayList
 * @author Patrick O'Brien
 * @version 11/25/2019
 * */

public class QuizScore {
    private int score;

    /**
     * Constructor with single arg
     * */
    public QuizScore(int score) {
        this.score = score;
    }

    /**
     * Getter method for score
     * */
    public int getScore() {
        return score;
    }

    /**
     * Setter method for score
     * */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Implementation of cloneable
     * */
    @Override
    protected Object clone() {
        return new QuizScore(score);
    }
}
