import java.util.Locale;
import java.util.Scanner;

public class ConeFrustumRunner {
    public static void main(String[] args) {
        System.out.println("Cone Frustum Calculator");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Radius");
        String radius = myObj.nextLine();

        System.out.println("Angle of Elevation");
        String aoe = myObj.nextLine();

        System.out.println("Height");
        String height = myObj.nextLine();

        double r = Double.parseDouble(radius);
        double a = Double.parseDouble(aoe);
        double h = Double.parseDouble(height);



        ConeFrustum cf = new ConeFrustum(r, a, h);
        System.out.println("Surface area is: " + cf.getTotalSurfaceArea());
    }

}
