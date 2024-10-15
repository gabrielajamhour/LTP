package practica1;

/**
 * class FiguresGroup.
 * 
 * @author LTP 
 * @version 2020-21
 */

public class FiguresGroup {
    private static final int NUM_FIGURES = 10;
    private Figure[] figuresList = new Figure[NUM_FIGURES];
    private int numF = 0;

    public void add(Figure f) { figuresList[numF++] = f; }

    public String toString() {
        String s = "";
        for (int i = 0; i < numF; i++) {
            s += "\n" + figuresList[i];
        }
        return s;
    }

    private boolean found(Figure f) {            // Verifica si la figura recibida como argumento se encuentra o no en el grupo de figuras que invoca el método
        for (int i = 0; i < numF; i++) {
            if (figuresList[i].equals(f)) return true;
        }
        return false;
    }

    private boolean included(FiguresGroup g) {   // Verifica si el grupo g recibido como argumento está incluido o no en el grupo de figuras que invoca al método
        for (int i = 0; i < g.numF; i++) {
            if (!found(g.figuresList[i])) return false;
        }
        return true;
    }

    public boolean equals(Object o) {
        if (!(o instanceof FiguresGroup)) { return false; }
        FiguresGroup fg = (FiguresGroup) o;
        return this.included(fg) && fg.included(this);   // Verifica si fg está incluido en this y viceversa
    }
    
    public void print(FiguresGroup g) {
        System.out.println(g);
    }
}
