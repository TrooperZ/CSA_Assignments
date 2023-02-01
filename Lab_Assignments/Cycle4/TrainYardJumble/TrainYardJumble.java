// The student should add their logic in the required areas.
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TrainYard 
{
	// these constant strings describe each type of car
    private static final String ENGINE = "Engine";
    private static final String CARGO = "Cargo";
    private static final String CABOOSE = "Caboose";

	// This method is provided complete in the activity starter.
	// No student changes are needed.
	public static void main(String[] args) 
	{
		// initialize user input
		Scanner input = new Scanner(System.in);
        
		// get puzzle number from user and seed Random generator
		System.out.print("Enter puzzle number: ");
        int seed = input.nextInt();
		Random rand = new Random(seed);
		
		// create and print ArrayList of jumbled cars
		ArrayList jumbledCars = createJumbledCars(rand);
		System.out.print("STARTING ORDER: ");
		printCars(jumbledCars);
	
		boolean isSolved = false;  // flag will be set to true if puzzle is solved
		int moves = 0;             // track number of moves
		do
		{
			moves++;  // count this move

			// prompt user for pair of cars to switch
			System.out.print("Enter index (0-2) of first car in pair to switch: ");
			int firstIndex = input.nextInt();

			// switch the chosen car and the one after it
			switchCars(jumbledCars,firstIndex);
			
			// print the new order of cars
			printCars(jumbledCars);
			
			// check to see if puzzle is solved
			isSolved = carsInOrder(jumbledCars);
			
			// continue looping until puzzle is solved or 3 moves completed
		} while (!isSolved && (moves < 3));
		
		// print success or failure message
		if (isSolved)
		{
			System.out.println("You solved the puzzle in " + moves + " moves!");
		}
		else
		{
			System.out.println("You failed to solve the puzzle");
		}
		
		input.close();
	}
	
	// THE STUDENT WILL COMPLETE THIS METHOD
	static private ArrayList createJumbledCars(Random rand)
	{
	    ArrayList<TrainCar> originalList = new ArrayList<TrainCar>();
        originalList.add(new TrainCar(ENGINE));
        originalList.add(new TrainCar(CARGO));
        originalList.add(new TrainCar(CARGO));
        originalList.add(new TrainCar(CABOOSE));
        
        ArrayList<TrainCar> jumbledList = new ArrayList<TrainCar>();
        
        for (int i = 0; i < 4; i++) {
            int randomIndex = rand.nextInt(originalList.size());
            jumbledList.add(originalList.get(randomIndex));
            originalList.remove(randomIndex);
        }

        return jumbledList;
	}

	// THE STUDENT WILL COMPLETE THIS METHOD
	static private void printCars(ArrayList<TrainCar> cars)
	{
        for(TrainCar i : cars){
            System.out.print(i.getType() + " ");
        }
        System.out.println();
	}
	
	// THE STUDENT WILL COMPLETE THIS METHOD
	static private void switchCars(ArrayList<TrainCar> cars, int firstIndex)
	{
        TrainCar a = cars.get(firstIndex);
        TrainCar b = cars.get(firstIndex+1);
        cars.set(firstIndex, b);
        cars.set(firstIndex+1, a);
	}
	
	// THE STUDENT WILL COMPLETE THIS METHOD
	static private boolean carsInOrder(ArrayList<TrainCar> cars)
	{
		ArrayList<TrainCar> listy = new ArrayList<TrainCar>();
        listy.add(new TrainCar(ENGINE));
        listy.add(new TrainCar(CARGO));
        listy.add(new TrainCar(CARGO));
        listy.add(new TrainCar(CABOOSE));
        boolean status = true;
        for(int i =0; i <listy.size(); i++){
            if(!cars.get(i).isType(listy.get(i).getType())){
                status = false;
            }
        }
        return status;
	}
}