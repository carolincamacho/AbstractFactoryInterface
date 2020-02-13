package edu.patrones.abstractfactory.clases;

/**
 *
 * @author Abstract Team. Clase que establece el tipo de helado Cono
 */
import edu.patrones.abstractfactory.interfaces.*;

public class Cono implements IHelado {

    private final String saborOpcion[] = {"Pistacho", "Cafe", "Chocolate"};
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
        System.out.println("El sabor del Cono es: " + this.sabor);
    }

}
