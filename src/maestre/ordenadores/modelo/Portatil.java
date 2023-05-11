
package maestre.ordenadores.modelo;

import utilidades.Utilidades;

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
    
    private byte pulgadas ; //Número entero de 2 dígitos.
    
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
         * @param pulgadas Pulgadas de la pantalla.
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
        this.setPulgadas(pulgadas) ;
    }
        
        
        // ---- GETTERS & SETTERS -------

        
        /**
         * Método que devuelve las pulgadas del portátil.
         * 
         * @return Devuelve las pulgadas.
         */
        public byte getPulgadas() {
            return pulgadas;
        }

        
        /**
         * Método que modifica las pulgadas del portátil. Controla que tenga un 
         * máximo de 17 pulgadas.
         * 
         * @param pulgadas Pulgadas.
         */
        public void setPulgadas(byte pulgadas) {
            
            boolean validador = false ;
            
            do 
            {
                if (( pulgadas > 0 ) && ( pulgadas <= 17)) 
                {
                    this.pulgadas = pulgadas ;
                    validador = true ;
                }
                else
                {
                    System.out.println(Utilidades.coloreaCadena("\nLos portátiles actuales no suelen tener más de 17 pulgadas.", Utilidades.rojo));
                    pulgadas = Utilidades.leerByteConLimiteDeDigitos("\nIntroduce el número de pulgadas:", 2) ;
                }
                
            } while (!validador);
            
            this.pulgadas = pulgadas;
        }
        
        
        // ------ TO STRING -------
        

        @Override
        public String toString() {
            return super.toString() + "Portatil{" + "pulgadas=" + pulgadas + '}'; // TENGO QUE MODIFICARLO
        }        
        
        
        // ------ MÉTODOS PERSONALIZADOS ------
        
        public void cargar(int minutos){
            
            
        }
        
        
        public void dibujar(){ // ---------------- PUESTO PARA FUNCIONA LA EJECUCIÓN ---------
            System.out.println("Dibujado");
        }
        
        public static void main(String[] args) { // --------------------- MAIN DE PRUEBAS ----------------------------------------------------
        
            Portatil portatil1 = new Portatil() ;
            
            System.out.println(portatil1.toString());
    }
}
