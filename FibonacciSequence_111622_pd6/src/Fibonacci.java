public class Fibonacci
{
    long[] fibArray;
    public Fibonacci(int size)
    {
        fibArray = new long[size];
        this.setFibo(size);
    }
    public void setFibo(long size)
    {
        if (size == 1){
            fibArray[0] = 1;
        }
        else if (size == 2){
            fibArray[0] = 1;
            fibArray[1] = 1;
        }
        else{
            fibArray[0] = 1;
            fibArray[1] = 1;
            for (int i = 2; i<size; i++){
                fibArray[i] = fibArray[i-1]+fibArray[i-2];
            }
        }
    }
    public String toString()
    {
        String output = "";
        for (int i = 0;i<fibArray.length;i++){
            output += fibArray[i] + " ";
        }
        return output;
    }
}