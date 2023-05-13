
package maestre.general.app;

import maestre.electrodomesticos.Aspirador;
import maestre.general.interfaces.Reparable;
import maestre.ordenadores.modelo.Portatil;
import maestre.ordenadores.modelo.Sobremesa;

/**
 * Segunda parte de la aplicación de gestión de ordenadores para la 
 * tarea 8 de programación.
 * 
 * @author Adrián Arjona
 * @version Mayo 2023
 */
public class Parte2App {
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 8: utilización avanzada de clases.
    */
    
    
    // ------------------------------------------------------------
    // -------------------- MÉTODO MAIN ---------------------------
    // ------------------------------------------------------------
    
    public static void main(String[] args) {
        
        Reparable[] lista = new Reparable[6] ;
        
        Portatil portatil1 = new Portatil((byte)15, "jmt69d3bccde", "Sony", "Vaio", (byte)8, "Snapdragon", (byte)3, "HDD", false) ;
        Portatil portatil2 = new Portatil((byte)7, "kke888jje86ms", "LG", "Bicharraco", (byte)64, "Turbobestia", (byte)10, "SSD", false) ;
        
        Sobremesa sobremesa1 = new Sobremesa("Motherboard", "NGula", "iiiiiiiiuuuuueeeee", "Nintendo", "Nicomprendo", (byte)4, "MediaTek", (byte)6, "HDD", false) ;
        Sobremesa sobremesa2 = new Sobremesa("not found", "pantalla LCD", "S/N", "Clónico", "--", (byte)1, "What?", (byte)1, "HDD", false) ;
        
        Aspirador aspirador1 = new Aspirador(1600, "Phillips", false) ;
        Aspirador aspirador2 = new Aspirador(2000, "Kirby", false) ;
    }
    
    
    
    private static void reparaTodo(Reparable cosas[]){
        
    }
}
