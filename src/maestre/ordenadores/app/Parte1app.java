
package maestre.ordenadores.app;

import maestre.ordenadores.modelo.Ordenador;
import maestre.ordenadores.modelo.Portatil;
import maestre.ordenadores.modelo.Sobremesa;

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
   
    }
}
