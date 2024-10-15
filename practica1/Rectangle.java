package practica1;


/**
 * class Rectangle.
 * 
 * @author LTP
 * @version 2020-21
 */

public class Rectangle extends Figure {
    private double base; 
    private double height;

    public Rectangle(double x, double y, double b, double h) {
        super(x, y);
        base = b;
        height = h;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Rectangle)) { return false; }
        Rectangle r = (Rectangle) o;      // Convierte el objeto genérico Object al tipo específico, en este caso Rectangle
        return super.equals(r) && this.base == r.base && this.height == r.height;
    }
    
    public String toString() {
        return "Rectangle:\n\t" +
            super.toString() +
            "\n\tBase: " + base +
            "\n\tHeight: " + height;
    }
}
