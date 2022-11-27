import java.text.DecimalFormat;
public class Point {
    private double x;
    private double y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(double xpoint, double ypoint) {
        x = xpoint;
        y = ypoint;
    }

    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public void setX(double xpoint) {
        x = xpoint;
    }

    public void setY(double ypoint) {
        y = ypoint;
    }

    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }

    public String getQuadrant(){
        if (x > 0 && y > 0){
            return "Quadrant 1";
        }
        else if (x > 0 && y < 0){
            return "Quadrant 4";
        }
        else if (x < 0 && y > 0){
            return "Quadrant 2";
        }
        else if (x < 0 && y < 0){
            return "Quadrant 3";
        }
        else if (x == 0 && y > 0){
            return "Positive Y-Axis";
        }
        else if (x == 0 && y < 0){
            return "Negative Y-Axis";
        }
        else if (x > 0 && y == 0){
            return "Positive X-Axis";
        }
        else if (x < 0 && y == 0){
            return "Negative X-Axis";
        }
        return "Origin";
    }

    public Point reflectOnX(){
        return new Point(x, -y);
    }

    public Point reflectOnY(){
        return new Point(-x, y);
    }

    public Point inverse(){
        return new Point(y, x);
    }

    public double distanceTo(Point point){
        DecimalFormat d = new DecimalFormat("#.####");
        return Double.parseDouble(d.format(Math.sqrt(Math.pow(point.getX() - x, 2)+ Math.pow(point.getY() - y, 2))));
    }

    public void moveVertical(double amt){
        y += amt;
    }

    public void moveHorizontal(double amt){
        x += amt;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
