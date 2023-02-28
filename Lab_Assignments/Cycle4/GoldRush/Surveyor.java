
import java.util.*;

public class Surveyor 
{
	// each grid will be a square with this many cells
	public final int GRID_SIZE = 3;
	public final int NUM_GRIDS = 3;
	
	// random number generator used to create survey samples
	private Random rand;
	
	// The constructor will use the plot number to initialize the random number generator.
	// No student changes are needed.
	public Surveyor(int plot)
	{
		rand = new Random(plot);
	}
	
	// The surveyPlot() method will produce the survey results for the current plot of land.
	// No student changes are needed.
	public ArrayList<int[][]> surveyPlot()
	{
		// create a new ArrayList that holds a 2D integer array in each element
		ArrayList<int[][]> survey = new ArrayList<int[][]>();
		
		// loop NUM_GRIDS times to create each grid
		for (int i=0; i<=NUM_GRIDS; i++)
		{
			// create a new 2D integer array with GRID_SIZE rows and columns
			int[][] grid = surveyGrid();

			// add the grid to the survey ArrayList
			survey.add(grid);
		}
		
		// return the survey results to the calling program
		return survey;
	}
	
	// This method will create one 2D grid filled with ounces of gold in each cell.
	// THE STUDENT WILL COMPLETE THIS METHOD
	private int[][] surveyGrid()
	{
	    int[][] grid = new int[GRID_SIZE][GRID_SIZE];
	    for (int i = 0; i < grid.length; i++){
	        for (int j = 0; j < grid[i].length; j++){
	            grid[i][j] = sample();
	        }
	    }
	    return grid;

	}
	
	// This method will return the number of ounce of gold found at the current location.
	// No student changes are needed.
	private int sample()
	{
		// return a random number between 0 and 9, inclusive
		return rand.nextInt(10);
	}
}