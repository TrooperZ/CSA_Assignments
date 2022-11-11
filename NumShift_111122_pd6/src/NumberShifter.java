import java.util.Random;
public class NumberShifter {
    private static Random ng = new Random();
    public static int[] makeLucky7Array( int size)
    {
        int[] arr = new int[size];
        for (int i = 0; i<size; i++) {
            arr[i] = ng.nextInt(1,11);
        }
        return arr;
    }
    public static void shift7(int[] arr)  //The parameter arr contains the same reference as the passing argument ray.
    {
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == 7){
                int move = arr[i];
                int orig = arr[count];
                arr[count] = move;
                arr[i] = orig;
                count++;
            }
        }

    }
}