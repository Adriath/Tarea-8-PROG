
package maestre.ordenadores.modelo;

/**
 * Clase que crea objetos de tipo portátil. Hereda de Ordenador.
 * 
 * @author Adrián Arjona
 * @version Mayo 2023
 */
public class Portatil extends Ordenador{
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 8: utilización avanzada de clases.
    */
    
    
    // ---------- DECLARACIÓN DE ATRIBUTOS ----------------
    
    byte pulgadas ; //Núemro entero de 2 dígitos.
    final short DURACION_BATERIA= 300 ;
    
    
    // ----------------- MÉTODOS ----------------
    
        // ----- CONSTRUCTOR ------
    
        
        /**
         * Constructor por defecto de la clase Portatil
         */
        public Portatil(){
            
            super() ;
            this.pulgadas = 0 ;
        }
        

        /**
         * Constructor con parámetros de la clase Portatil
         * 
         * @param pulgadas Pulgadas de la pantalla. Permite 2 dígitos.
         * @param num_serie Número de serie.
         * @param marca Marca.
         * @param modelo Modelo.
         * @param memoriaRam Memoria RAM.
         * @param procesador Procesador.
         * @param nucleos Númeor de núcleos.
         * @param tipoDiscoDuro Tipo de disco duro. SSD o HDD.
         * @param arrancado Estado, true si arrancado false si no.
         */
        public Portatil(byte pulgadas, String num_serie, String marca, String modelo, byte memoriaRam, String procesador, byte nucleos, String tipoDiscoDuro, boolean arrancado){
        
        super(num_serie, marca, modelo, memoriaRam, procesador, nucleos, tipoDiscoDuro, arrancado);
        this.pulgadas = pulgadas;
    }
        
        
        
}
