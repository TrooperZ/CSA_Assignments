class Alligator
{
    private int length;
    private double hunger;

    public Alligator()
    {
        length = 0;
        hunger = 0.0;


    }

    public Alligator(int len, double hun)
    {
        length = len;
        hunger = hun;

    }

    //returns true if hunger > 50
    //returns false if hunger <= 50
    public boolean isHungry()
    {
        return (hunger>50);


    }

    public String toString()
    {
        String str = "";
        return str + length + " " + hunger;

    }
}
