public class Prime
{
    private int number;

    //constructor methods go here

    public Prime(int num){
        number = num;
    }

    public void setPrime(int num)
    {
        number = num;
    }

    public boolean isPrime(){
        if(number <= 1)
        {
            return false;
        }
        for(int i=2; i<=number/2; i++)
        {
            if((number%i) == 0)
                return false;
        }
        return true;
    }

    //boolean isPrime() goes here


    public String toString()
    {
        return "";
    }
}// end of Prime