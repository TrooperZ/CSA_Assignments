

public class Main {
    public static void main(String[] args) {

        Shape s;
        s = new Circle(5);
        s.calculateArea();
        System.out.println(s);

        s = new Rectangle(5, 5);
        s.calculateArea();
        System.out.println(s);

        s = new Sphere(5);
        s.calculateArea();
        System.out.println(s);


    }}