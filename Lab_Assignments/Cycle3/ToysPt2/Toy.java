public class Toy {
    private String name;
    private int count = 1;
    public Toy(String str) {
        name = str;
    }
    public int getCount(){
        return count;
    }
    public String getName(){
        return name;
    }
    public void setCount(int val){
        count = val;
    }
    public String toString(){
        return name + " " + count;
    }

}
