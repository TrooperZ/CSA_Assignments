//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
    public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
            "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
    private String name;
    private int val;

    public Card(String n, int a) {
        name=n;
        val=a;
    }

    public int getFace(){
        return val;
    }

    public String getSuit(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public void setFace(int a){
        val = a;
    }

    public String toString() {
        return FACES[val] + " of " + name;
    }

    //instance variables
    //String suit
    //int face

    //constructors


    // modifiers - mutators
    //set methods


    //accessors
    //get methods


    //toString

}
