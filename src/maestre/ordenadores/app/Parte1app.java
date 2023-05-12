
package maestre.ordenadores.app;

import maestre.ordenadores.modelo.Ordenador;
import maestre.ordenadores.modelo.Portatil;
import maestre.ordenadores.modelo.Sobremesa;
import utilidades.Utilidades;

/**
 * Primera parte de la aplicación de gestión de ordenadores para la 
 * tarea 8 de programación.
 * 
 * @author Adrián Arjona
 * @version Mayo 2023
 */
public class Parte1app {
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 8: utilización avanzada de clases.
    */
    
    
    // ------------------------------------------------------------
    // -------------------- MÉTODO MAIN ---------------------------
    // ------------------------------------------------------------
    
    
    public static void main(String[] args) {
        
        
    Ordenador[] lista = new Ordenador[6] ;
    
    Portatil portatil1 = new Portatil((byte)15, "ej38jj3o8jf", "HP", "Pavilion", (byte)8, "Intel i5 4800U", (byte)2, "HDD", false) ;
    Portatil portatil2 = new Portatil((byte)17, "jñol83m8mñas", "MSI", "Firefly", (byte)16, "Intel i7 9800H", (byte)6, "SSD", false) ;
    Portatil portatil3 = new Portatil((byte)14, "ajañj-34j3lk8", "Chromebook", "Pixel", (byte)2, "Tensor", (byte)2, "SSD", true) ;
    
    Sobremesa sobremesa1 = new Sobremesa("Gygabyte", "ATI Radeon 7500", "añsoejo8787ñl", "Medion", "Capsule", (byte)6, "AMD Tyzon", (byte)4, "SSD", true) ;
    Sobremesa sobremesa2 = new Sobremesa("IBM", "NVidia GTX 4800", "jñaolj8ki3jijim3", "Microsoft", "Norface", (byte)16, "AMD Tyzon", (byte)10, "SSD", false) ;
    Sobremesa sobremesa3 = new Sobremesa("Gygabyte", "placa de tostadora", "jja83mnh88hn233", "Taurus", "Xtreme", (byte)1, "KillerPatient", (byte)1, "HDD", false) ;
    
    lista[0] = portatil1 ;
    lista[1] = portatil2 ;
    lista[2] = portatil3 ;
    lista[3] = sobremesa1 ;
    lista[4] = sobremesa2 ;
    lista[5] = sobremesa3 ;
    
    System.out.println("\n¡BIENVENIDO/A A LA APLICACIÓN DE GESTIÓN DE ORDENADORES!");
    System.out.println("--------------------------------------------------------\n");
    
    for (int i = 0; i < lista.length; i++) 
        {
            System.out.println(Utilidades.coloreaCadena("\n // Ordenador " + (i + 1) + " //", Utilidades.verde));
            System.out.println(lista[i].toString()); ;
        }
    
    menu();
    
    }
    
    
    // ------------------- OTROS MÉTODOS ------------------------
    
    
    /**
     * Método privado que muestra el menú de la aplicación.
     */
    private static void menu(){
        
        System.out.println("\n\t" + Utilidades.coloreaCadena("--------------------------------------", Utilidades.cyan));
        System.out.println("\t" + Utilidades.coloreaCadena("---------------- MENÚ ----------------", Utilidades.cyan));
        System.out.println("\t" + Utilidades.coloreaCadena("--------------------------------------\n", Utilidades.cyan));
        
        System.out.println("\ta. Listar todos los ordenadores mezclados (portátiles y sobremesa).") ;
        System.out.println("\tb. Listar sólo los portátiles.") ;
        System.out.println("\tc. Listar sólo los ordenadores de sobremesa.") ;
        System.out.println("\td. Encender un ordenador.") ;
        System.out.println("\te. Apagar un ordenador.") ;
        System.out.println("\tf. Dibujar un ordenador") ;
        System.out.println("\tg. Cargar portátiles.") ;
        System.out.println("\th. Descargar portátiles.\n");
    }
}
