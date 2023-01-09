import java.util.*;

public class GradeReport
{
    static void calculateAverage(ArrayList<Integer> grades)
    {
        double sum = 0;   // this will store the running total

        // for each grade
        for (int i=0; i<grades.size(); i++)
        {
            sum += grades.get(i);   // get grade value and add to sum
        }

        // calculate average by dividing sum by number of grades
        double average = sum / grades.size();

        // print results
        System.out.println("Average Grade: " + average);
    }

    // calculate and display the average of the values in the input list

}	