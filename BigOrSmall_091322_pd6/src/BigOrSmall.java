import static java.lang.System.*;
import java.util.Scanner;

public class BigOrSmall
{
    public static String check( int a, int b )
    {
        if (a > b){
            return "yes";
        }
        if (b > a){
            return "no";
        }
        if (b == a){
            return "cvhs";
        }
        return "cannot determine";
    }
}