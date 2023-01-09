import java.util.*;

public class Journey
{
    public static void main(String[] args)
    {
        // create an ArrayList where each element is, itself, another ArrayList
        ArrayList<ArrayList<String>> journey = new ArrayList<ArrayList<String>>();
        initialize(journey);	// populate journey with countries and locations

        // Student code here!
        // Traverse the journey, one country at a time, printing out each location
        for (ArrayList<String> country : journey)
        {
            for (String location : country)
            {
                System.out.println(location);
            }
        }
    }

    static private void initialize(ArrayList<ArrayList<String>> journey)
    {
        // populate the journey with some countries and a
        // variety of locations within each country
        ArrayList<String> usa    = new ArrayList<String>();
        usa.add("Yellowstone Park");
        usa.add("Washington DC");
        usa.add("Grand Canyon");

        ArrayList<String> mexico = new ArrayList<String>();
        mexico.add("Catedral Metropolitana");
        mexico.add("Zócalo");
        mexico.add("Ángel de la Independencia");
        mexico.add("Castillo Chapultepec");

        ArrayList<String> canada = new ArrayList<String>();
        canada.add("Niagra Falls");
        canada.add("Banff National Park");

        journey.add(usa);
        journey.add(mexico);
        journey.add(canada);
    }
}