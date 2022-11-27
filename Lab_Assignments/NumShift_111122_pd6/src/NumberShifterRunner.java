import java.util.Arrays;

public class NumberShifterRunner {
    public static void main(String[] args) {
        int[] ray = NumberShifter.makeLucky7Array(20);
        System.out.println( Arrays.toString( ray ) );
        NumberShifter.shift7( ray );                              // the ray as argument in this method call
        System.out.println( Arrays.toString( ray ) );
    }
}
