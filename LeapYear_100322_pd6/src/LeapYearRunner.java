import static java.lang.System.*;
import java.util.Scanner;

public class LeapYearRunner
{
    public static void main( String args[] )
    {
        Scanner keyboard = new Scanner(System.in);

        out.print("Enter a year :: ");
        int year = keyboard.nextInt();
        if( LeapYear.isLeapYear( year ) )
            out.println(year + " is a Leap Year." );
        if( !LeapYear.isLeapYear( year ) )
            out.println(year + " is NOT a Leap Year." );
    }
}