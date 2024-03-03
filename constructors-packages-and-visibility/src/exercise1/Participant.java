package exercise1;

import java.util.Objects;

public class Participant {

    static final int INITIAL_SCORE= 10;

    private String name;
    private int score;

    public Participant(String name) {
        this(name, 0);
    }

    private Participant(String name, int initialScore) {
        Objects.requireNonNull("Name is required");
        if (initialScore < 0) {
            throw new IllegalArgumentException("Score must not be negative");
        }

        this.name = name;
        this.score = initialScore;
    }

    public void addScore(int scoreAdded) {
        if(scoreAdded < 0) {
            throw new IllegalArgumentException("Score to be added cannot be negative.");
        }

        this.score += scoreAdded;
    }

}
