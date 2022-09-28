//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        char response;
        String player = "";
        boolean keepplaying = true;
        while (keepplaying == true) {
            //add in a do while loop after you get the basics up and running

            out.print("type in your prompt [R,P,S] :: ");
            response = keyboard.next().charAt(0);
            player += response;

            //read in the player value

            RockPaperScissors game = new RockPaperScissors(player);
            out.println(game.determineWinner());

            out.print("play again? [y,n] :: ");
            String playagain = keyboard.next().toLowerCase();

            if (playagain.equals("n")) {
                keepplaying = false;
            }
            else if (playagain.equals("y")){
                keepplaying = true;
            }
        }
    }
}
