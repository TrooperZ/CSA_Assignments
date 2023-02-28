public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double w, double h){
        width = w;
        height = h;
    }

    @Override
    public void calculateArea(){
        setArea(width * height);
    }

    public String toString(){
        return "Rectangle is "+ super.toString();
    }
}