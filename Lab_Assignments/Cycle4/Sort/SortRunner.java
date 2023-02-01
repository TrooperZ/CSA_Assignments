import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SortRunner {
    public static void main(String args[]) throws FileNotFoundException {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7}, {8, 9, 10}, {11, 12, 1}};
        System.out.println(Arrays.toString(a[1]));

        System.out.println(a);

        File file = new File("C:\\Users\\troop\\IdeaProjects\\Sort_AminKaric_012023_pd6_v2\\src\\SortingWords.txt");

        Scanner scanner = new Scanner(file);

        int lineNumber = 0;
        int length = Integer.parseInt(scanner.nextLine());
        String words[] = new String[length];

        while(lineNumber<length){
            String line = scanner.nextLine();
            words[lineNumber] = line + "AminKaric";
            lineNumber++;
        }

        System.out.println(Arrays.toString(words));
        Sort sort1 = new Sort(words);
        sort1.insertionSort();
        System.out.println(Arrays.toString(sort1.getArray()));

        Sort sort2 = new Sort(words);
        sort2.selectionSort();
        System.out.println(Arrays.toString(sort2.getArray()));

        Sort sort3 = new Sort(words);
        sort3.bubbleSort();
        System.out.println(Arrays.toString(sort3.getArray()));

    }
}