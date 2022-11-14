public class Horse {
    private String name;
    private int horseWeight;
    public Horse(){
        name="horse";
        horseWeight=660;
    }
    public Horse(String hName, int hWeight){
        name=hName;
        horseWeight=hWeight;
    }
    public String getName(){
        return name;
    }
    public int getHorseWeight(){
        return horseWeight;
    }
    public void setName(String n){
        name=n;
    }
    public void setHorseWeight(int hw) {
        horseWeight = hw;
    }
    public String toString(){
        return name + " and weighs " + horseWeight;
    }
}
