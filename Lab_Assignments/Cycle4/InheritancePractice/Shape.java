public abstract class Shape{
    private double area;
    public Shape(){}
    public void setArea(double x){
        area = x;
    }
    public double getArea(){
        return area;
    }
    public abstract void calculateArea();
    public String toString(){
        return "Shape... its area = "+getArea();
    }

}
