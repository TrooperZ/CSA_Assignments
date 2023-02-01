import java.util.Arrays;

public class Sort {

    String[] abc;

    public Sort(String[] abc) {
        this.abc = abc;
    }

    public String[] getArray() {


        return abc;
    }

    public String[] bubbleSort() {
        for (int i = 0; i < abc.length - 1; i++) {
            for (int j = 0; j < abc.length - i - 1; j++) {
                if (abc[j].compareTo(abc[j + 1]) > 0) {
                    String temp = abc[j];
                    abc[j] = abc[j + 1];
                    abc[j + 1] = temp;
                }

            }
        }
        return abc;
    }

    public String[] selectionSort() {
        for (int i = 0; i < abc.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < abc.length; j++) {
                if (abc[j].compareTo(abc[minIndex]) < 0) {
                    minIndex = j;
                }

            }
            String temp = abc[i];
            abc[i] = abc[minIndex];
            abc[minIndex] = temp;


        }
        return abc;

    }

    public String[] insertionSort() {
        for (int i = 1; i < abc.length; i++) {
            for (int j = i; j > 0; j--) {
                if (abc[j].compareTo(abc[j - 1]) < 0) {
                    String temp = abc[j];
                    abc[j] = abc[j - 1];
                    abc[j - 1] = temp;

                }

            }
        }
        return abc;
    }

    public String toString() {
        return Arrays.toString(abc);
    }
}