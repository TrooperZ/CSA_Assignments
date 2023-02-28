import java.util.*;

public class GoldRush 
{
	// main program logic
	// No student changes are needed.
	public static void main(String[] args) 
	{
		// ask the user for an integer plot number with the Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("What plot number would you like to survey? ");
		int plotNumber = input.nextInt();
		input.close();
		
		// create a new Surveyor object, passing in the plot number
		Surveyor robot = new Surveyor(plotNumber);
		
		// Call surveyPlot() to produce the survey results.
		// There will be 3 elements in the resulting list,
		// each is a 2D array of integers
		ArrayList<int[][]> plot = robot.surveyPlot();

		// Review each 2D grid in the plot, displaying it on the screen.
		// There will be 3 elements in the resulting list,
		// each an integer with the total amount of gold in that grid.
		ArrayList<Integer> gridTotals = reviewPlot(plot);

		// Search the grid totals to find and print the grid with the most gold
		findBestGrid(gridTotals);
	}
	
	// This method will display each grid and return a list containing the total amount of gold in each grid.
	// THE STUDENT WILL COMPLETE THIS METHOD
	private static ArrayList<Integer> reviewPlot(ArrayList<int[][]> survey)
	{
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    for (int[][] plot : survey){
	        int total = reviewGrid(plot);
	        result.add(total);
	    }
	    return result;
	}
	
	// This method will display an individual grid and return the amount of gold in that grid.
	// THE STUDENT WILL COMPLETE THIS METHOD
	private static int reviewGrid(int[][] grid)
	{
	    	int total = 0;
	        for (int[] row : grid){
	            for (int gold : row){
	                System.out.print(gold + " ");
	                total += gold;
	            }
	            System.out.println();
	        }
	        System.out.println("Total ounces: " + total);
	        return total;
        
	}
	
	// algorithm to find and print the best grid with the most gold
	// THE STUDENT WILL COMPLETE THIS METHOD
	private static void findBestGrid(ArrayList<Integer> gridTotals)
	{
	    int biggest = 0;
	    for (int value : gridTotals){
	        if (value > biggest){
	            biggest = value;
	        }
	    }
	    System.out.println("The best grid # " + gridTotals.indexOf(biggest) + " has " + biggest + " ounces of gold!");
	}
}