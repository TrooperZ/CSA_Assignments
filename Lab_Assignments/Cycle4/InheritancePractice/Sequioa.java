public class Sequioa extends Tree{
    double x;
    double age;
    public Sequioa(double x) {
        this.x = x;
    }

    @Override
    void calculateAge(){
        age = x*ageDiameterRatio;
    }

    public String toString() {
        calculateAge();
        return "Sequioa tree is " + (int)age + " years old";
    }
}
