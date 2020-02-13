
package edu.patrones.abstractfactory.fabricas;

/**
 *
 * @author Abstract Team. Clase que define la fabrica específica
 * la creación de cada tipo de helado, implementa la Frabica de Helado general.
 */
import edu.patrones.abstractfactory.interfaces.*;
import edu.patrones.abstractfactory.clases.*;


public class FabricaPaletas implements IFabricaDeHelado {

   @Override
   public IHelado crearHelado() {
        Paleta miPaleta = new Paleta();
        miPaleta.setSabor(miPaleta.crearSabor());
        System.out.println("Se ha creado un nuevo helado tipo Paleta");
        return miPaleta;
    }
}
