//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner
{
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        boolean playing = true;
        while (playing) {
            out.println("Guessing Game - how many numbers?");
            int numamt = keyboard.nextInt();
            GuessingGame ng = new GuessingGame(numamt);
            ng.playGame();
            out.println("Play again? (y/n)");
            String playagain = keyboard.next();
            if (playagain.equalsIgnoreCase("n")){
                playing = false;

            }

        }
    }
}