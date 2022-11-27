//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
    private int randNumber;
    private int upperLimit;
    private int guesses = 0;
    public boolean playing = true;

    public GuessingGame(int stop)
    {
        Random rng = new Random();
        randNumber = rng.nextInt(stop+1);
        upperLimit = stop;
    }

    public void playGame()
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Enter a number between 1 and " + upperLimit);
        int guessedNum = keyboard.nextInt();
        if (guessedNum <= upperLimit && guessedNum >= 1){
        guesses++;
            if (guessedNum == randNumber){
                out.println("It took " + guesses + " guesses to guess " + randNumber + ".");
                double percent = ((float) guesses-1.0)/ (float) randNumber * 100.0;
                out.println("You guessed wrong " + percent + " percent of the time.");

            }
            else {
                playGame();
            }
        }
        else {
            out.println("Out of range!");
            playGame();
        }


    }

    public String toString()
    {
        String output="";
        return output;
    }
}