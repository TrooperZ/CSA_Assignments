public class Sphere extends Shape{
    private double radius;
    public Sphere(double r) {
        radius = r;
    }

    @Override
    public void calculateArea(){
        setArea(Math.PI * 4 * radius * radius);
    }

    public String toString(){
        return "Sphere is "+ super.toString();
    }
}
