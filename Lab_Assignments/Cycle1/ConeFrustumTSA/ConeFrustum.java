public class ConeFrustum {
    private double bigRadius;
    private double angleOfElevation;
    private double height;
    private double slantheight;
    private double smallradius;

    public ConeFrustum(double R, double z, double h) {

        bigRadius=R;
        angleOfElevation=Math.toRadians(z);
        height=h;
        smallradius=R-(h/Math.tan(angleOfElevation));
        slantheight=h/Math.sin(angleOfElevation);
    }

    public double getTotalSurfaceArea() {
        return (Math.PI*slantheight*(bigRadius+smallradius))+(Math.PI*(Math.pow(bigRadius, 2)+ Math.pow(smallradius, 2)));
    }


}

// pi*slantheight(bigcircle+smallcirlce)