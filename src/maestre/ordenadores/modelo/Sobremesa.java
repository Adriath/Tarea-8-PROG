
package maestre.ordenadores.modelo;

import java.awt.Color;
import maestre.general.interfaces.Reparable;
import utilidades.Utilidades;

/**
 * Clase que crea objetos de tipo ordenador de sobremesa. Hereda de Ordenador.
 * 
 * @author Adrián Arjona
 * @version Mayo 2023
 */
public class Sobremesa extends Ordenador implements Reparable{
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 8: utilización avanzada de clases.
    */
    
    // ---------------- DECLARACIÓN DE VARIABLES -----------------
    
    private String placaBase ;
    private String tarjetaGrafica ;
    
    
    // ---------------- MÉTODOS -------------------------
    
        // ------ CONSTRUCTORES ----------

        /**
         * Constructor por defecto de la clase Sobremesa.
         */
        public Sobremesa(){
            
            super() ;
            this.placaBase = "" ;
            this.tarjetaGrafica = "" ;
        }

        
        /**
         * Constructor con parámetros de la clase Sobremesa.
         * 
         * @param placaBase Placa base.
         * @param tarjetaGrafica Tarjeta gráfica.
         * @param num_serie Número de serie.
         * @param marca Marca.
         * @param modelo Modelo.
         * @param memoriaRam Memoria RAM.
         * @param procesador Procesador.
         * @param nucleos Númerod de núcleos.
         * @param tipoDiscoDuro Tipo de disco duro.
         * @param arrancado Estado arrancado.
         */
        public Sobremesa(String placaBase, String tarjetaGrafica, String num_serie, String marca, String modelo, byte memoriaRam, String procesador, byte nucleos, String tipoDiscoDuro, boolean arrancado) {

            super(num_serie, marca, modelo, memoriaRam, procesador, nucleos, tipoDiscoDuro, arrancado);
            this.placaBase = placaBase;
            this.tarjetaGrafica = tarjetaGrafica;
        }
    
        
        // ------ GETTERS & SETTERS --------

        
            // PLACA BASE
        
            
            /**
             * Método que devuelve la placa base.
             * 
             * @return Devuelva la placa base.
             */
            public String getPlacaBase() {
                return placaBase;
            }

            
            /**
             * Método que modifica la placa base.
             * 
             * @param placaBase Placa base.
             */
            public void setPlacaBase(String placaBase) {
                this.placaBase = placaBase;
            }

        
            // TARJETA GRÁFICA

            
            /**
             * Método que devuelve la tarjeta gráfica.
             * 
             * @return Devuelve la tarjeta gráfica.
             */
            public String getTarjetaGrafica() {
                return tarjetaGrafica;
            }

            
            /**
             * Método que modifica la tarjeta gráfica.
             * 
             * @param tarjetaGrafica Tarjeta gráfica.
             */
            public void setTarjetaGrafica(String tarjetaGrafica) {
                this.tarjetaGrafica = tarjetaGrafica;
            }
        
            
        // ------- TO STRING --------
            
        
        /**
         * Método toString() de la clase Sobremesa.
         * 
         * @return Devuelve los datos del ordenador de sobremesa.
         */
            @Override
        public String toString() {
            
            StringBuilder sb = new StringBuilder();
            
            sb.append("\nSOBREMESA:");
            sb.append("\n----------------");
            sb.append(super.toString());
            sb.append("\nPlaca base = ").append(placaBase) ;
            sb.append("\nTarjeta gráfica = ").append(tarjetaGrafica) ;
            
            return sb.toString();
        }
        
        // -------- MÉTODOS PERSONALIZADOS -------------
        
        
        /**
         * Método que muestra los datos del ordenador y, si está arrancado, 
         * mostrará también una serie de asteriscos que representan los núcleos (filas) 
         * y los GB de memoria RAM (columnas).
         */
            @Override
        public void dibujar(){
            
            final String ASTERISCO = "*" ;
            
            System.out.println(this.toString());
            
            if (this.isArrancado())
                // Si el ordenador está arrancado haz el gráfico de asteriscos.
            {
                for (int i = 0; i < this.getNucleos(); i++) 
                {
                    System.out.println("");
                    
                    for (int j = 0; j < this.getMemoriaRam(); j++) 
                    {
                        System.out.print(ASTERISCO);
                    }
                }
                
                System.out.print("\n");
            }
            else
                // Si no está arrancado indícalo con un mensaje.
            {
                System.out.println(Utilidades.coloreaCadena("\nEl ordenador no está arrancado.", Utilidades.rojo)) ;
            }
        }
        
        
        
        /**
         * Método implementado por la interface Reparable. Indica con un mensaje 
         * por pantalla que el ordenador está siendo reparado.
         */
            @Override
        public void reparar(){
            
            System.out.println(Utilidades.coloreaCadena("\n*****************************************", Utilidades.cyan)) ;
            System.out.println(Utilidades.coloreaCadena("     El ordenador está siendo reparado     ", Utilidades.cyan)) ;
            System.out.println(Utilidades.coloreaCadena("*****************************************\n", Utilidades.cyan)) ;
        }
}
