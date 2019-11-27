import java.util.ArrayList;

/**
 *
 * @author Patrick O'Brien
 * @version 11/25/2019
 * */

public class QuizTracker implements Cloneable {
    ArrayList<QuizScore> scores;

    /**
     * Default constructor
     * */
    public QuizTracker() {
        scores = new ArrayList<QuizScore>();
    }

    /**
     * Getter method for scores
     * */
    public ArrayList<QuizScore> getScores() {
        return scores;
    }

    /**
     * Setter method for scores
     * */
    public void setScores(ArrayList<QuizScore> scores) {
        this.scores = scores;
    }

    /**
     * This method adds the score to the tracker
     * */
    public void add(QuizScore qs) {
        // adding a clone of the passed in input value
        QuizScore score = (QuizScore) qs.clone();
        scores.add(score);
    }

    /**
     * This method overrides clone
     * to properly implement cloneable
     * */
    protected Object clone() {
        // creating the new QuizTracker
        QuizTracker tracker = new QuizTracker();
        // adding the clone of all quiz scores to new QuizTracker
        for (QuizScore score : scores) {
            tracker.add((QuizScore) score.clone());
        }
        return tracker;
    }

}
