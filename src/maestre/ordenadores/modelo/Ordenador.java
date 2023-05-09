
package maestre.ordenadores.modelo;

/**
 *
 * @author Adrián Arjona
 */
public class Ordenador {
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 8: utilización avanzada de clases.
    */
    
    // ------------ DECLARACIÓN DE VARIABLES ----------------
    
    byte memoriaRam ; // Máximo 3 dígitos (GB).
    byte nucleos ; // Máximo 2 dígitos.
    int num_serie ; // Máximo 20 caracteres.
    
    String marca ;
    String modelo ;
    String tipoDiscoDuro ; // HDD / SSD
    String procesador ;    
    
    boolean arrancado ;
    
    
    public enum TipoDiscoDuro{
        // ENUM PARA EL TIPO DE DISCO DURO
        
        HDD("HDD"), SSD("SSD") ;
        
        private final String tipo;
        
        private TipoDiscoDuro(String tipo){
            this.tipo = tipo ;
        }
        
        public String getTipo(){
            return tipo ;
        }
        
    }
    
    // ---------------- DECLARAICÓN DE MÉTODOS -------------------
    
        // ------- CONSTRUCTOR ----------

        public Ordenador() {
            // CONSTRUCTOR POR DEFECTO
            
            this.num_serie = 0 ;
            this.marca = "" ;
            this.modelo = "" ;
            this.memoriaRam = 0 ;
            this.procesador = "" ;
            this.nucleos = 0 ;
            this.tipoDiscoDuro = "" ;
            this.arrancado = false ;
        }

        public Ordenador(int num_serie, String marca, String modelo, byte memoriaRam, String procesador, byte nucleos, String tipoDiscoDuro, boolean arrancado) {
            // CONSTRUCTOR CON PARÁMETROS
            
            this.num_serie = num_serie;
            this.marca = marca;
            this.modelo = modelo;
            this.memoriaRam = memoriaRam;
            this.procesador = procesador;
            this.nucleos = nucleos;
            this.tipoDiscoDuro = tipoDiscoDuro;
            this.arrancado = arrancado;
        }
    
        
}
