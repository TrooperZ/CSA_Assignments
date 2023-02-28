
public class Circle extends Shape{
    private double radius;
    public Circle(double r){
        radius = r;
    }

    @Override
    public void calculateArea(){
        double area = Math.PI * radius * radius;
        setArea(area);
    }
    public String toString(){
        return "Circle is "+ super.toString();
    }
}


