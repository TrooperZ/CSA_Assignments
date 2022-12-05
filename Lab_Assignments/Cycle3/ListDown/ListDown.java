//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ListDown
{
    //go() will return true if all numbers in numArray
    //are in decreasing order [31,12,6,2,1]
    public static boolean go( List<Integer> numArray)
    {
        if (numArray.stream().distinct().count() <= 1 && numArray.size() != 1) {
            return false;
        }
        List<Integer> newarr = new ArrayList<Integer>(numArray);
        Collections.sort(newarr, Collections.reverseOrder());
        return newarr.equals(numArray);
    }
}