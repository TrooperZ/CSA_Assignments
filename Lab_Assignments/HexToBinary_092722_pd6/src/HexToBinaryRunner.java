//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class HexToBinaryRunner
{
    public static void main( String args[] )
    {
        HexToBinary prog = new HexToBinary();

        Scanner keyboard = new Scanner(in);

        out.print("Enter a letter :: ");
        char letter = keyboard.next().charAt(0);
        out.println(letter + " is " + prog.getBinary( letter ) + " in binary!");

        //add more test cases
    }
}