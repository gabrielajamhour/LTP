package practica1;


/**
 * class Circle.
 * 
 * @author LTP 
 * @version 2020-21
 */

public class Circle extends Figure { // La palabra reservada 'extends' se utiliza para indicar que Circle hereda de la clase Figura
    private double radius;

    public Circle(double x, double y, double r) {
        super(x, y); // La palabra reservada 'super' se utiliza para referirse a elementos de la clase padre (Figure)
        radius = r;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Circle)) { return false; } // instanceof permite verificar si un objecto es instancia de una determinada clase, en este caso Circle
        Circle c = (Circle) o;      // Convierte el objeto genérico Object al tipo específico (casting o coerción explícita), en este caso Circle 
        return super.equals(c) && this.radius == c.radius;
    }
    
    public String toString() {
        return "Circle:\n\t" +
            super.toString() +
            "\n\tRadius: " + radius;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
    
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
