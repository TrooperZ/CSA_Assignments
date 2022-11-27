import java.util.Arrays;
public class ArrayStats
{
    private int[] array;
    public ArrayStats(String list)
    {
        String[] splitted = list.split("\\s+");
        int[] vals = new int[splitted.length];
        for (int i = 0;i<splitted.length;i++){
            vals[i] = Integer.parseInt(splitted[i]);
        }
        array = vals;
    }
    public void setArray(String list)
    {
        String[] splitted = list.split("\\s+");
        int[] vals = new int[splitted.length];
        for (int i = 0;i<splitted.length;i++){
            vals[i] = Integer.parseInt(splitted[i]);
        }
        array = vals;
    }

    public int numSize( int num  ) {

        int count = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] ==num) {
                count++;
            }
        }
        return count;
    }
    public int getNumGroupsOfSize(int size)
    {
        int count=0;
        int current=array[0];

        if(numSize(array[current])>=size)
        {
            count++;
        }

        for (int i = 0;i<=array.length-1;i++) {
            if (array[i] !=current) {
                if(numSize(array[i])>=size)
                {
                    count++;
                }
                current=array[i];

            }
        }
        return count;
    }
    public String toString()
    {
        String out = "[";
        for (int i = 0;i<array.length;i++){
            if (i == array.length-1){
                out += array[i] + "]";
            }
            else {
                out += array[i] + ", ";
            }
        }
        return out;
    }
}