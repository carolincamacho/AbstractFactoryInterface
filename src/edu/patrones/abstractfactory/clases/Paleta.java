package edu.patrones.abstractfactory.clases;

/**
 *
 * @author Abstract Team. Clase que establece el tipo de helado Paleta
 */
import edu.patrones.abstractfactory.interfaces.*;

public class Paleta implements IHelado {

    private final String saborOpcion[] = {"Vainilla", "Mora", "Limón"};
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
        System.out.println("El sabor de la Paleta es: " + this.sabor);
    }
}
