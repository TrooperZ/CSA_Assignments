public class HorseBarn {
    public Horse[] horses;
    public HorseBarn(int size){
        horses = new Horse[size];
    }
    public Horse[] getHorses() {
        return horses;
    }
    public int findHorseSpace(String name){
        for (int i = 0; i<horses.length; i++){
            if (horses[i] != null && horses[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void consolidate(){
        int nullcount = 0;
        for (int x = 0; x<horses.length; x++){
            if (horses[x] == null){
                nullcount++;
            }
        }
        Horse[] newBarn = new Horse[horses.length-nullcount];
        int count = 0;
        for (int i = 0; i<horses.length; i++){
            if (horses[i] != null){
                newBarn[count] = horses[i];
                count++;
            }
        }
    }
    public String toString()
    {
        String result = "";
        Horse h = null;
        for (int i = 0; i < horses.length; i++) {
            h = horses[i];
            result = result + "space " + i + " has ";
            if (h == null) result = result + " null \n";
            else result = result + h.toString() + "\n";
        }
        return result;
    }

}
