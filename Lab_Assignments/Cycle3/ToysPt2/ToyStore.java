//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.HashMap;

public class ToyStore
{
    private ArrayList<Toy> toyList;

    public ToyStore()
    {
        toyList = new ArrayList<Toy>();
    }

    public void loadToys( String[] toys )
    {
            for (String toyName: toys) {
                boolean exists = false;
                int pos = 0;
                for (Toy toy : toyList) {
                    if (toy.getName().equals(toyName)) {
                        exists = true;
                        break;
                    }
                    pos++;
                }
                if (exists){
                    toyList.get(pos).setCount(toyList.get(pos).getCount() + 1);
                }
                else {
                    toyList.add(new Toy(toyName));
                }
            }

    }

    public Toy getThatToy( String nm )
    {
        for (Toy toy : toyList){
            if (toy.getName().equals(nm))
            {
                return toy;
            }
        }
        return null;
    }

    public String getMostFrequentToy()
    {
        int biggest = 0;
        Toy biggestToy = null;
        for (Toy toy : toyList){
            if (toy.getCount() > biggest){
                biggestToy = toy;
                biggest = toy.getCount();
            }

        }
        return biggestToy.getName();
    }

    public void sortToysByCount()
    {
        for (int i = 0; i < toyList.size() - 1; i++) {
            for (int j = 0; j < toyList.size() - i - 1; j++) {
                if (toyList.get(j).getCount() > toyList.get(j + 1).getCount()) {
                    Toy temp = toyList.get(j);
                    toyList.set(j, toyList.get(j + 1));
                    toyList.set(j + 1, temp);
                }
                else if (toyList.get(j).getCount() == toyList.get(j + 1).getCount() && toyList.get(j).getName().compareTo(toyList.get(j + 1).getName()) > 0){
                    Toy temp = toyList.get(j);
                    toyList.set(j, toyList.get(j + 1));
                    toyList.set(j + 1, temp);
                }
            }
        }



    }

    public String toString()
    {
        return toyList.toString();
    }
}