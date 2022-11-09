import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RayMostFreq
{
    //method go will return the value
//that appears the most
//if several numbers all appear
//the same number of times
//return the first number found
    public static int go(int[] ray) {
        int maxval = 0;
        int maxvalkey = 0;
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < ray.length; i++) {
            if (map.containsKey(ray[i])) {
                map.put(ray[i], map.get(ray[i]) + 1);
            } else {
                map.put(ray[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > maxval){
                maxval = entry.getValue();
                maxvalkey = entry.getKey();
            }
        }


        return maxvalkey;
    }
}