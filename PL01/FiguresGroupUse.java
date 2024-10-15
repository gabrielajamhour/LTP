package practica1;


/**
 * class FiguresGroupUse.
 * 
 * @author LTP 
 * @version 2020-21
 */
public class FiguresGroupUse {
    public static void main(String[] args) {
        FiguresGroup g = new FiguresGroup();
        Circle c = new Circle(10, 5, 3.5);
        g.add(c);
        Triangle t = new Triangle(10, 5, 6.5, 32);
        g.add(t);
        System.out.println(g);
        System.out.println("\nArea of the circle: " + c.area());
        System.out.println("Area of the triangle: " + t.area());
    }
}
