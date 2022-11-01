import java.util.Random;

public class Level {
    private int score = 0;
    private int goal = 0;

    public Level (int srng, int grng){
        Random rg = new Random();
        score = rg.nextInt(srng);
        goal = rg.nextInt(grng);
        System.out.println("Score: " + score + " Goal: " + goal);
    }
    /** Returns true if the player reached the goal on this level and returns false otherwise */
    public boolean goalReached()
    { /* implement this in your code */
        return score >= goal;
    }


    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints()
    { /* implement this in your code */
        return score;
    }

} //end of class Level



