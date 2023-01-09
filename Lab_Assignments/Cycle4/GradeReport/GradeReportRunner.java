import java.util.ArrayList;

public class GradeReportRunner {
    public static void main(String[] args)
    {
        // create ArrayList of Integers
        ArrayList<Integer> grades = new ArrayList<Integer>();

        // add several grades and calculate the average each time
        grades.add(90);
        GradeReport.calculateAverage(grades);

        grades.add(76);
        GradeReport.calculateAverage(grades);

        grades.add(95);
        GradeReport.calculateAverage(grades);
    }

}
