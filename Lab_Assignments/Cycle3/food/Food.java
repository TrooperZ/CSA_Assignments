import java.util.Locale;

public class Food {
    private String kind;
    private double price;
    public Food(String kind, double price){
    this.kind = kind;
    this.price = price;
    }
    public String getKind(){
        return kind;
    }
    public double getPrice(){
        return price;
    }
    public String toString(){
        return kind + ": $" + price;
    }
    public String compareThis(Food f){
        if (kind.toLowerCase().compareTo(f.getKind().toLowerCase()) != 0){
            if (kind.toLowerCase().compareTo(f.getKind().toLowerCase()) < 0){
                return "less than";
            }
            else if (kind.toLowerCase().compareTo(f.getKind().toLowerCase()) > 0){
                return "greater than";
            }
        }
        else if (kind.toLowerCase().compareTo(f.getKind().toLowerCase()) == 0) {
            if (price != f.getPrice()) {
                if (price > f.getPrice()){
                    return "greater than";
                }
                else if (price < f.getPrice()){
                    return "less than";
                }
            }

        }
        return "equal to";
    }
}
