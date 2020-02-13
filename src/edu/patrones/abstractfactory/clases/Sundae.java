package edu.patrones.abstractfactory.clases;

/**
 *
 * @author Abstract Team. Clase que establece el tipo de helado Sundae
 */
import edu.patrones.abstractfactory.interfaces.*;

public class Sundae implements IHelado {

    private final String saborOpcion[] = {"Fresa", "Maracuya", "Arequipe"};
    private String sabor;

    @Override
    public String crearSabor() {
        int codigoSabor = (int) (Math.random() * 3);
        return saborOpcion[codigoSabor];
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;

    }

    @Override
    public void mostrarSabor() {
        System.out.println("El sabor del Sundae es: " + this.sabor);
    }
}
