package practica2;

import practica1.Figure;
import practica2.librerias.implementaciones.QueueAL;

/**
 * class FiguresQueue.
 * 
 * @author LTP 
 * @version 2020-21
 */

public class FiguresQueue<T extends Figure> extends QueueAL<T> { 
    public double area() {
        double totalArea = 0;
        for (int i = 0; i < size(); i++) {
            T figure = this.first(); // Se obtiene la primera figura
            totalArea += figure.area();
            
            this.enqueue(dequeue()); // Elimina el elemento ya procesado y lo añade otra vez al final
        }
        return totalArea;
    }
}
