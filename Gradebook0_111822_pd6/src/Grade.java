public class Grade
{
    private double value;
    public Grade( double v )
    {
        value = v; // assigns grade to value
    }

    public double getNumericGrade()
    {
        return value; // returns grade
    }

    public String getLetterGrade()
    {
        String grade = "";
        int modifiedGrade = (int) (value/10); // divides the grade by ten and casts to int; strips the ones place
        if (value > 100){
            modifiedGrade = 100; // checks if number greater than 100, automatically sets it to 100 and gives a
        }
        switch (modifiedGrade){ // advanced switch case
            case 9, 10 -> grade = "A"; // if grade is 90-100 > A
            case 8 -> grade = "B";
            case 7 -> grade = "C";
            case 6 -> grade = "D";
            default -> grade = "F";
    }
    /* this can be done with an if statement, switch case is simpler
    if statement would look like:
    if (value >= 90){
    grade = "A";
    }
    else if (value >= 80){
    grade = "B";
    }
    ...
    else{
    grade = "F";
    }
     */

    return grade;
    }
    public String toString()
    {
        return getNumericGrade() + " " + getLetterGrade(); // Number grade and letter, EX: 87.3 B
    }
}