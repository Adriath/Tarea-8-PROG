
package maestre.general.app;

import java.util.Arrays;
import maestre.electrodomesticos.Aspirador;
import maestre.general.interfaces.Reparable;
import maestre.ordenadores.modelo.Portatil;
import maestre.ordenadores.modelo.Sobremesa;
import utilidades.Utilidades;

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
    
    /**
     * Método main de la clase Psrte2App
     * 
     * @param args args
     */
    public static void main(String[] args) {
        
        
        Reparable[] lista = new Reparable[6] ;
        Portatil[] listaPortatiles = new Portatil[3] ;
        
        Portatil portatil1 = new Portatil((byte)17, "jmt69d3bccde", "Sony", "Vaio", (byte)8, "Snapdragon", (byte)3, "HDD", false) ;
        Portatil portatil2 = new Portatil((byte)11, "kke888jje86ms", "LG", "Bicharraco", (byte)64, "Turbobestia", (byte)10, "SSD", false) ;
        Portatil portatil3 = new Portatil((byte)15, "añj33432aiityye", "Teclast", "Barricude", (byte)2, "A4", (byte)2, "HDD", false) ;
        
        Sobremesa sobremesa1 = new Sobremesa("Motherboard", "NGula", "iiiiiiiiuuuuueeeee", "Nintendo", "Nicomprendo", (byte)4, "MediaTek", (byte)6, "HDD", false) ;
        Sobremesa sobremesa2 = new Sobremesa("not found", "pantalla LCD", "S/N", "Clónico", "--", (byte)1, "What?", (byte)1, "HDD", false) ;
        
        Aspirador aspirador1 = new Aspirador(1600, "Phillips", false) ;
        Aspirador aspirador2 = new Aspirador(2000, "Kirby", false) ;
        
        
        lista[0] = portatil1 ;
        lista[1] = portatil2 ;
        lista[2] = sobremesa1 ;
        lista[3] = sobremesa2 ;
        lista[4] = aspirador1 ;
        lista[5] = aspirador2 ;
        
        listaPortatiles[0] = portatil1 ;
        listaPortatiles[1] = portatil2 ;
        listaPortatiles[2] = portatil3 ;
        
        reparaTodo(lista) ;
        
        
        
        for (int i = 0; i < listaPortatiles.length; i++) 
        {
            System.out.println(Utilidades.coloreaCadena("\n // Ordenador portátil " + (i + 1) + " //", Utilidades.verde));
            System.out.println(listaPortatiles[i].toString());
        }
        
        System.out.println(Utilidades.coloreaCadena("\nAHORA VAMOS A MOSTRAR EL ARRAY ORDENADOR POR PULGADAS\n", Utilidades.cyan)) ;
        
        Arrays.sort(listaPortatiles) ;
        
        for (int i = 0; i < listaPortatiles.length; i++) 
        {
            System.out.println(Utilidades.coloreaCadena("\n // Ordenador portátil " + (i + 1) + " //", Utilidades.verde));
            System.out.println(listaPortatiles[i].toString());
        }
    }
    
    
    
    /**
     * Método privado que repara todos los objetos pasados por parámetro.
     * 
     * @param cosas Array de tipo Reparable.
     */
    private static void reparaTodo(Reparable cosas[]){
        
        for (int i = 0; i < cosas.length; i++) 
        {
            cosas[i].reparar() ;
        }
        
        System.out.println(Utilidades.coloreaCadena("\nTodos los objetos están en reparación.\n", Utilidades.cyan)) ;
    }
    
    
}
