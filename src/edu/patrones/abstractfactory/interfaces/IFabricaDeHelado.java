  	package edu.patrones.abstractfactory.interfaces;

/**
 *
 * @author Abstract Team. Interfaz donde se crea el tipo de helado
 */
public interface IFabricaDeHelado {
    public IHelado crearHelado();
    
    /* ejemplo de polimorfismo
    public IHelado crearHelado(String sabor);*/ 
}

