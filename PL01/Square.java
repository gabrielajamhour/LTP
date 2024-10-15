package practica1;


/**
 * class Square.
 * 
 * @author LTP
 * @version 2020-21
 */

public class Square extends Rectangle {
    public Square(double x, double y, double s) {
        super(x, y, s, s);
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Square)) { return false; }
        return super.equals(o);
        // Aquí no haría falta hacer el casting pues no se usa el objeto Square directamente, se usa solo el método equals de Rectangle
    }
    
    public String toString() {
        return "Square:\n\t" +
            super.toString(); // Ya muestra base y height
    }
}
