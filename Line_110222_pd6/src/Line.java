import java.text.DecimalFormat;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point a, Point b){
        p1 = a;
        p2 = b;
    }

    public Line(double x1, double y1, double x2, double y2){
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public Line(Line l){
        this.p1 = l.getP1();
        this.p2 = l.getP2();
    }

    public void setP1(Point p){
        p1 = p;
    }

    public void setP2(Point p){
        p2 = p;
    }

    public void setP1(double x, double y){
        p1 = new Point(x, y);
    }

    public void setP2(double x, double y){
        p2 = new Point(x, y);
    }

    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p1;
    }

    public double slope(){
        if (p2.getX() - p1.getX() != 0){
            double calc = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
            DecimalFormat d = new DecimalFormat("#.####");
            return Double.parseDouble(d.format(calc));
        }
        return Double.MAX_VALUE; // double max value is used to represent an undefined slope (division by zero)
    }

    public double length(){
        return p1.distanceTo(p2);
    }

    public Point midpoint(){
        double x = (p1.getX()+p2.getX())/2;
        double y = (p1.getY()+p2.getY())/2;
        return new Point(x, y);
    }

    public String rateOfChange(){
        if (slope() != Double.MAX_VALUE) {
            if (slope() > 0) {
                return "increasing";
            }
            else if (slope () < 0) {
                return "decreasing";
            }
            else if (slope() == 0){
                return "none";
            }

        }
        return "undefined";
    }

    public Point xIntercept(){
        double x = 0;
        if (slope() != Double.MAX_VALUE && slope() != 0) {
            x = (0 - p1.getY()) / slope() + p1.getX();
        }
        else if (p1.getY() == p2.getY()){
            x = p1.getX();
        }
        else if (slope() == 0){
            if (p1.getX() == 0) {
                System.out.println("Infinite X Intercepts. Returning (0, 0).");
            }
            else {
                System.out.println("No X Intercepts found. Returning (0, 0)");
            }
        }
        return new Point(x, 0);
    }

    public Point yIntercept(){
        double y = 0;
        if (slope() != Double.MAX_VALUE && slope() != 0) {
            y = (0 - p1.getX()) / slope() + p1.getY();
        }
        else if (slope() == 0){
            y = p1.getY();
        }
        else if (p1.getY() == p2.getY()){
            if (p1.getX() == 0){
                System.out.println("Infinite Y Intercepts. Returning (0, 0)");
            }
            else {
                System.out.println("No Y Intercepts found. Returning (0, 0)");
            }
        }
        return new Point(0, y);
    }

    public boolean onLine(Point p){
        if (p1.getX() == p2.getX()){
            return p.getX() == p1.getX();
        }
        else if (p1.getY() == p2.getY()){
            return p.getY() == p1.getY();
        }
        double calc = (p.getX() - p1.getX()) * (p2.getY() - p1.getY()) - (p.getY() - p1.getY()) * (p2.getX() - p1.getX());
        /* Cool vector math, get cross product of point 1 and chosen point's vector and point 1 and point 2's vector
        * if the value of the cross-product is == to 0, it's a point on the line.*/
        return calc == 0;
    }

    public boolean onLine(double x, double y){
        Point p = new Point(x, y);
        if (p1.getX() == p2.getX()){
            return p.getX() == p1.getX();
        }
        else if (p1.getY() == p2.getY()){
            return p.getY() == p1.getY();
        }
        double calc = (p.getX() - p1.getX()) * (p2.getY() - p1.getY()) - (p.getY() - p1.getY()) * (p2.getX() - p1.getX());
        /* Cool vector math, get cross product of point 1 and chosen point's vector and point 1 and point 2's vector
         * if the value of the cross-product is == to 0, it's a point on the line.*/
        return calc == 0;
    }

    public boolean isParallelTo(Line l){
        return (l.slope() == slope());
    }

    public boolean isPerpendicularTo(Line l){
        if (l.slope() != Double.MAX_VALUE && slope() != Double.MAX_VALUE) {
            return slope() * l.slope() == -1;
        }
        else return l.slope() == 0 && slope() == Double.MAX_VALUE || l.slope() == Double.MAX_VALUE && slope() == 0;
    }

    public String toString(){
        return p1.toString() + "---" + p2.toString();
    }



}
