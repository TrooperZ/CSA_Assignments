import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedHashMap;
public class FlowerGarden
{
    private LinkedHashMap<String, Integer> fgarden;
    private ArrayList<String> flowers;

    public FlowerGarden(){
        fgarden = new LinkedHashMap<String, Integer>();
        flowers = new ArrayList<String>();
    }

    public void addFlower(String name){
        if (!fgarden.containsKey(name)){
            fgarden.put(name, 1);
            flowers.add(name);
        }
        else {
            int value = fgarden.get(name) + 1;
            fgarden.remove(name);
            fgarden.put(name, value);
            flowers.remove(flowers.indexOf(name));
            flowers.add(name);
        }
    }

    public int getCount(String name){
        if (fgarden.get(name) == null){
            return 0;
        }
        return fgarden.get(name);
    }

    public String getFlowerName(int index){
        if (!inRange(index)){
            return "out of range";
        }
        return flowers.get(index);
    }

    public boolean inRange(int index){
        return (index >= 0 && index < flowers.size());
    }

    public int findFlower(String flower){
        return flowers.lastIndexOf(flower);
    }

    public String wrapIntToString(int i){
        String result = "";
        if (i < 10){
            result = "0" + i;
        }
        else{
            result = String.valueOf(i);
        }
        return result;
    }
    public String maxFlower(){
        int largest = 0;
        String largestkey = "";
        for (String key : fgarden.keySet()){
            if (fgarden.get(key) > largest){
                largestkey = key;
                largest = fgarden.get(key);
            }
        }
        return wrapIntToString(largest) + " " + largestkey;
    }

    public String toString() {
        int count = 0;
        String str = "[";
        for (String key : fgarden.keySet()){
            str += wrapIntToString(fgarden.get(key)) + " " + key;
            if (count < fgarden.size()-1) {
                str += ", ";
            }
            count++;
        }
        return str + "]";
    }

}