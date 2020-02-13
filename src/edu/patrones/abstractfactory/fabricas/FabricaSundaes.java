package edu.patrones.abstractfactory.fabricas;

import edu.patrones.abstractfactory.interfaces.*;
import edu.patrones.abstractfactory.clases.*;

/**
 *
 * @author Abstract Team. Clase que define la fabrica específica
 * la creación de cada tipo de helado, implementa la Frabica de Helado general.
 */

public class FabricaSundaes implements IFabricaDeHelado {

    @Override
    public IHelado crearHelado() {
        Sundae miSundae = new Sundae();
        miSundae.setSabor(miSundae.crearSabor());
        System.out.println("Se ha creado un nuevo helado tipo Sundae");
        return miSundae;
    }
}
