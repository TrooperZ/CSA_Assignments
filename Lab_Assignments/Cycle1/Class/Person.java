
public class Person {
    private double height;
    private boolean isAlive;

    public Person(double h, boolean a) {
        height = h;
        isAlive = a;
    }

    public void setHeight(double z) {
        height=z;
    }

    public void setAlive(boolean a) {
        isAlive=a;
    }

    public double getHeight() {
        return height;
    }

    public boolean getAlive() {
        return isAlive;
    }
    //4.Auxiliary/Helper method - for printing
    public String toString() { //align the last letters
        String str = "height = "+ getHeight() +"\n"+
                " alive = "+ isAlive +"\n";
        return str;
    }
}//end of class
