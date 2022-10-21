import static java.lang.System.out;

public class ARunner {
    public static void main(String[] args) {
        Alligator gator = new Alligator();
        Alligator gatuh = new Alligator(3,76);
        Alligator mean = new Alligator(55,24);
        out.println("gator = " + gator);
        out.println("gator hungry = " +  gator.isHungry());
        out.println("gatuh = " + gatuh);
        out.println("gatuh hungry = " +  gatuh.isHungry());
        out.println("mean = " + mean);
        out.println("mean hungry = " +  mean.isHungry());

    }
}
