// Copyright CompuScholar, Inc.
// Do not distribute or post in any public or private venue.

// The student should add their logic in the required areas.
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Ducklings 
{
	// This method is provided complete in the activity starter.
	// No student changes are needed.
	public static void main(String[] args) 
	{
		// get user input for number of ducks
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of ducks: ");
		int numDucks = input.nextInt();
      
        // initialize random number generator with known seed
    	Random rand = new Random(numDucks);

		// create list of random ducks
		ArrayList<Integer> ducks = createRandomDucks(rand,numDucks);
		printDucks(ducks,"RANDOM");
      
		// sort the list of ducks
		selectionSort(ducks);
		printDucks(ducks,"SORTED");
      
		// ask user which duck to find
		System.out.print("Enter duck number to find: ");
		int target = input.nextInt();
		input.close();

		// perform sequential search of ducks
		int foundIndex = sequentialSearch(ducks,target);
      
		// display results
		if (foundIndex >= 0)
		{
			System.out.println("Duck " + target + " found at position " + foundIndex);
		}
		else
		{
			System.out.println("Duck " + target + " not found");
		}
	}
   
	// This method is provided complete in the activity starter.
	// No student changes are needed.
	public static void printDucks(ArrayList<Integer> ducks, String prefix)
	{
		// print out the prefix
		System.out.print(prefix + " DUCKS: ");
		
		// iterate over all ducks, printing each number and a space
		for (Integer duck : ducks)
		{
		   System.out.print(duck + " ");
	    }
	    System.out.println();  // end of line
    }

	// THE STUDENT WILL COMPLETE THIS METHOD
	public static ArrayList<Integer> createRandomDucks(Random rand, int numDucks)
    {
        ArrayList arr =  new ArrayList<Integer>();
        for (int i = 0; i < numDucks; i++){
            arr.add(rand.nextInt(100));
        }
	    return arr;  // replace this line with student logic
    }
   
	// THE STUDENT WILL COMPLETE THIS METHOD
    public static void selectionSort(ArrayList<Integer> ducks)
    {
		// DO NOT CHANGE THIS STARTING VARIABLE
		int iterations = 0;   // will count number of loop iterations		

		// STUDENT CODE HERE
		for (int i = 0; i < ducks.size()-1; i++)
        {
            
            int min = i;
            for (int j = i+1; j < ducks.size(); j++){
                if (ducks.get(j) < ducks.get(min)){
                    min = j;
                }
                iterations++;
            }
 
            int p = ducks.get(min);
            ducks.set(min, ducks.get(i));
            ducks.set(i, p);
            
        		// ENSURE THIS LINE IS WITHIN YOUR LOOP
        	

        } 

		// NO STUDENT CHANGES BELOW THIS LINE
		System.out.println("Selection Sort completed in " + iterations + " iterations");
    }

	// THE STUDENT WILL COMPLETE THIS METHOD
	public static int sequentialSearch(ArrayList<Integer> ducks, int target)
	{
		// DO NOT CHANGE THESE TWO STARTING VARIABLES
		int iterations = 0;   // will count number of loop iterations		
		int foundIndex = -1;  // will hold found index; -1 means not found

		// STUDENT CODE HERE
		for (int i = 0; i < ducks.size(); i++)
		{
		    iterations++;
		    if (ducks.get(i) == target){
		        foundIndex = i;
		        break;
		    }
        		// ENSURE THIS LINE IS WITHIN YOUR LOOP
    	  

		}
      
		// NO STUDENT CHANGES BELOW THIS LINE
		System.out.println("Sequential Search completed in " + iterations + " iterations");
      
		return foundIndex;
	}
}		