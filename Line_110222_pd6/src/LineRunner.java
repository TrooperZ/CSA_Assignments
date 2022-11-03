public class LineRunner {
    public static void main(String[] args) {
        Point a = new Point(1,5);
        Point b = new Point(8, 10);

        a.setX(2);
        b.setX(-4);

        System.out.println(a.getX());
        System.out.println(b.getX());

        a.setY(9);
        b.setY(-3);

        System.out.println(a.getY());
        System.out.println(b.getY());

        Point c = new Point(0, 1);
        Point d = new Point(0, 0);
        Point e = new Point(1, 0);
        Point f = new Point(0, -1);
        Point g = new Point(-1, 0);
        Point h = new Point(1, -1);
        Point z = new Point(-1, 1);

        System.out.println(a.getQuadrant());
        System.out.println(b.getQuadrant());
        System.out.println(c.getQuadrant());
        System.out.println(d.getQuadrant());
        System.out.println(e.getQuadrant());
        System.out.println(f.getQuadrant());
        System.out.println(g.getQuadrant());
        System.out.println(h.getQuadrant());
        System.out.println(z.getQuadrant());


        System.out.println(a.reflectOnX().toString());
        System.out.println(b.reflectOnX().toString());

        System.out.println(a.reflectOnY().toString());
        System.out.println(b.reflectOnY().toString());

        System.out.println(a.inverse().toString());
        System.out.println(b.inverse().toString());

        System.out.println(a.distanceTo(new Point(1, 9)));
        System.out.println(b.distanceTo(new Point(-5, 2)));

        a.moveHorizontal(-2);
        b.moveHorizontal(8);

        a.moveVertical(-2);
        b.moveVertical(2);

        System.out.println(a);
        System.out.println(b);

        Line i = new Line(a, b);
        Line j = new Line(3, -2, -8, 5);
        Line k = new Line(5, -1, 0, 0);

        i.setP1(new Point(0, 7));
        i.setP2(4, -1);
        j.setP1(new Point(2, 9));
        j.setP2(6, 1);
        k.setP1(new Point(-2, 6));
        k.setP2(new Point(6, 10));

        System.out.println(i.getP1());
        System.out.println(j.getP1());
        System.out.println(k.getP1());

        System.out.println(i.getP2());
        System.out.println(j.getP2());
        System.out.println(k.getP2());

        System.out.println(i.slope());
        System.out.println(j.slope());
        System.out.println(k.slope());

        System.out.println(i.length());
        System.out.println(j.length());
        System.out.println(k.length());

        System.out.println(i.midpoint());
        System.out.println(j.midpoint());
        System.out.println(k.midpoint());

        System.out.println(i.rateOfChange());
        System.out.println(j.rateOfChange());
        System.out.println(k.rateOfChange());

        System.out.println(i.xIntercept());
        System.out.println(j.xIntercept());
        System.out.println(k.xIntercept());

        System.out.println(i.yIntercept());
        System.out.println(j.yIntercept());
        System.out.println(k.yIntercept());

        System.out.println(i.onLine(new Point(0, 7)));
        System.out.println(j.onLine(new Point(0, 0)));
        System.out.println(k.onLine(new Point(8, -2)));

        System.out.println(i.isParallelTo(j));
        System.out.println(j.isParallelTo(k));
        System.out.println(k.isParallelTo(i));

        System.out.println(i.isPerpendicularTo(k));
        System.out.println(j.isPerpendicularTo(k));
        System.out.println(k.isPerpendicularTo(i));

        System.out.println(i.toString());
        System.out.println(j.toString());
        System.out.println(k.toString());








    }
}
