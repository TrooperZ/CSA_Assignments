//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Random;
import static java.lang.System.*;

public class RockPaperScissors
{
    private String playChoice;
    private String compChoice;

    public RockPaperScissors(String player)
    {
        playChoice = player;

        Random generator = new Random();
        int genInt = generator.nextInt(3);
        if (genInt == 0){
            compChoice = "R";
        }
        else if (genInt == 1){
            compChoice = "P";
        }
        else if (genInt == 2){
            compChoice = "S";
        }
        out.println("player had " + playChoice);
        out.println("computer had: " + compChoice);
    }

    public String determineWinner()
    {
        String winner="";
        if (playChoice.equals(compChoice)) {
            winner = "!Draw Game!";
        }
        else if (playChoice.equals("P") && compChoice.equals("S")) {
            winner = "!Computer wins <<Scissors Cuts Paper>>!";
        }
        else if (playChoice.equals("R") && compChoice.equals("S")) {
            winner = "!Player wins <<Rock Breaks Scissors>>!";
        }
        else if (playChoice.equals("S") && compChoice.equals("R")) {
            winner = "!Computer wins <<Rock Breaks Scissors>>!!";
        }
        else if (playChoice.equals("R") && compChoice.equals("P")) {
            winner = "!Computer wins <<Paper Covers Rock>>!";
        }
        else if (playChoice.equals("P") && compChoice.equals("R")) {
            winner = "!Player wins <<Paper Covers Rock>>!";
        }
        else if (playChoice.equals("S") && compChoice.equals("P")){
            winner = "!Player wins <<Scissors Cuts Paper>>!";
        }

        return winner;
    }

    public String toString()
    {
        String output="";
        return output;
    }
}