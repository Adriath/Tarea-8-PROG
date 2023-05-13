
package maestre.electrodomesticos;

import maestre.general.interfaces.Reparable;
import utilidades.Utilidades;

/**
 *
 * @author Adrián Arjona
 * @version Mayo 2023
 */
public class Aspirador implements Reparable{
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 8: utilización avanzada de clases.
    */
    
    // ----------------- DECLARACIÓN DE ATRIBUTOS -------------------------
    
    private int potencia ;
    private String marca ;
    private boolean enchufado ;
    
    
    // ----------------- MÉTODOS --------------------------
    
        // ---------- CONSTRUCTOR ------------

    
        /**
         * Constructor por defecto de la clase Aspirador.
         */
        public Aspirador() {
         
            this.potencia = 0 ;
            this.marca = "" ;
            this.enchufado = false ;
        }
    
    
        /**
         * Constructor con parámetros de la clase Aspirador.
         * 
         * @param potencia Potencia en W.
         * @param marca Marca.
         * @param enchufado Si está enchufado.
         */
        public Aspirador(int potencia, String marca, boolean enchufado) {
            this.potencia = potencia;
            this.marca = marca;
            this.enchufado = enchufado;
        }
    
        
        
        // ----------- GETTERS & SETTERS -------------

        
            // POTENCIA
        
            /**
             * Método que devuelve la potencia del aspirador.
             * 
             * @return Devuelve la potencia del aspirador.
             */
            public int getPotencia() {
                return potencia;
            }

            
            /**
             * Método que modifica la potencia del aspirador.
             * 
             * @param potencia Potencia.
             */
            public void setPotencia(int potencia) {
                this.potencia = potencia;
            }
            
            
            // MARCA

            
            /**
             * Método que devuelve la marca del aspirador.
             * 
             * @return Devuelve la marca del aspirador.
             */
            public String getMarca() {
                return marca;
            }

            
            /**
             * Método que modifica la marca del aspirador.
             * 
             * @param marca Marca.
             */
            public void setMarca(String marca) {
                this.marca = marca;
            }
            
            
            // ENCHUFADO

            
            /**
             * Método que devuelve el estado del aspirador.
             * 
             * @return Devuelve true si está enchufado, false si no.
             */
            public boolean isEnchufado() {
                return enchufado;
            }

            
            /**
             * Método que modifica el estado del aspirador (enchufado o no)
             * 
             * @param enchufado Si está enchufado (true) o no (false).
             */
            public void setEnchufado(boolean enchufado) {
                this.enchufado = enchufado;
            }
        
        
        // ----- TO STRING ------

    
        /**
         * Método toString() de la clase Aspirador.
         * 
         * @return Devuelve las características del aspirador.
         */
            @Override
        public String toString() {
            
            StringBuilder sb = new StringBuilder();
            
            sb.append("\nASPIRADOR:");
            sb.append("\n----------------");
            sb.append("\nPotencia = ").append(potencia) ;
            sb.append("\nMarca = ").append(marca) ;
            sb.append("\nEnchufado = ").append(enchufado ? "Sí" : "No") ;
            
            return sb.toString() ;
        }
        
        
        // -------- MÉTODOS PERSONALIZADOS -----------
        
        
        /**
         * Método que limpia la superficie.
         */
        public void limpiar(){
            
            System.out.println(Utilidades.coloreaCadena("\nToda la superficie ha sido limpiada.\n", Utilidades.verde)) ;
        }
        
        
        /**
         * Método implementado por la interface Reparable. Indica con un mensaje 
         * por pantalla que el aspirador está siendo reparado.
         */
            @Override
        public void reparar(){
            
            System.out.println(Utilidades.coloreaCadena("\n#########################################", Utilidades.cyan)) ;
            System.out.println(Utilidades.coloreaCadena("     El aspirador está siendo reparado     ", Utilidades.cyan)) ;
            System.out.println(Utilidades.coloreaCadena("#########################################\n", Utilidades.cyan)) ;
        }
}
