import java.util.LinkedList;

public class Contact
{
    private String name;
    private String number;

    // Contact constructor
    Contact( String n, String num )
    {
        name = n;
        number = num;
    }

    public String getName()
    {
        return name;
    }

    public String getNumber()
    {
        return number;
    }

    public String toString() {
        return name + " " + number;
    }

}