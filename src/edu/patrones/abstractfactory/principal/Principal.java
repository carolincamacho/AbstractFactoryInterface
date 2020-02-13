package edu.patrones.abstractfactory.principal;

/**
 *
 * @author Abstract Team. Cliente principal, petición de helados a través de
 * instancias de fábricas de helados
 */
import edu.patrones.abstractfactory.fabricas.*;
import java.util.Scanner;
import edu.patrones.abstractfactory.fabricas.Cliente;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        FabricaConos conos = new FabricaConos();
        FabricaSundaes sundae = new FabricaSundaes();
        FabricaPaletas paletas = new FabricaPaletas();
        boolean iniciar = true;

        String cad = "", salida = "";
        cad += "Ingrese la opción correspondiente para obtener el Helado\n";
        cad += "1. Sundae\n";
        cad += "2. Cono\n";
        cad += "3. Paleta\n\n";

        do {

            System.out.println(cad);
            String opcC = teclado.next();

            switch (opcC) {
                case "1":
                    Cliente.crearHelado(sundae);
                    break;
                case "2":
                    Cliente.crearHelado(conos);
                    break;
                case "3":
                    Cliente.crearHelado(paletas);
                    break;
                default:
                    System.out.println("No tenemos ese tipo de helado");
                    continue;
            }
            System.out.println("Desea otro helado (S/N)?");
            salida = teclado.next();

            if (salida.toUpperCase().equals("N")) {
                System.out.println("Hasta Luego!!!!");
                iniciar = false;
            } else if (salida.toUpperCase().equals("S")) {
                iniciar = true;

            } else if (!salida.toUpperCase().equals("S") || !salida.toUpperCase().equals("N")) {
                System.out.println("No es una opción válida");
                iniciar = true;
            }

        } while (iniciar);

    }
}
