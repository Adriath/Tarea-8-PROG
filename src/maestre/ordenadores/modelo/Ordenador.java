
package maestre.ordenadores.modelo;

import utilidades.Utilidades;

/**
 * Clase abstracta que sirve de plantilla para crear objetos de tipo Ordenador.
 * 
 * @author Adrián Arjona
 * @version Mayo 2023
 */
abstract public class Ordenador {
    
    /* Francisco Adrián Arjona Bravo
        UNIDAD 8: utilización avanzada de clases.
    */
    
    // ------------ DECLARACIÓN DE VARIABLES ----------------
    
    private byte memoriaRam ; // Máximo 3 dígitos (GB).
    private byte nucleos ; // Máximo 2 dígitos.
    
    private String num_serie ; // Máximo 20 caracteres.
    private String marca ;
    private String modelo ;
    private String tipoDiscoDuro ; // HDD / SSD
    private String procesador ;    
    
    private boolean arrancado ;

 
    
    
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

        /**
         * Constructor por defecto de la clase Ordenador
         */
        public Ordenador() {
                        
            this.num_serie = "" ;
            this.marca = "" ;
            this.modelo = "" ;
            this.memoriaRam = 0 ;
            this.procesador = "" ;
            this.nucleos = 0 ;
            this.tipoDiscoDuro = "" ;
            this.arrancado = false ;
        }

        
        /**
         * Constructor con parámetros de la clase Ordenador
         * 
         * @param num_serie Número de serie.
         * @param marca Marca.
         * @param modelo Modelo.
         * @param memoriaRam Memoria RAM.
         * @param procesador Procesador.
         * @param nucleos Número de núcleos.
         * @param tipoDiscoDuro Tipo de disco duro.
         * @param arrancado Si está arrancado o no.
         */
        public Ordenador(String num_serie, String marca, String modelo, byte memoriaRam, String procesador, byte nucleos, String tipoDiscoDuro, boolean arrancado) {
                        
            this.setNum_serie(num_serie) ;
            this.marca = marca;
            this.modelo = modelo;
            this.setMemoriaRam(memoriaRam) ;
            this.procesador = procesador;
            this.setNucleos(nucleos) ;
            this.setTipoDiscoDuro(tipoDiscoDuro) ;
            this.arrancado = arrancado;
        }
        
        
        // ------ GETTERS & SETTERS ------
        
        
            // MEMORIA RAM 
        
        
            /**
             * Método que devuelve la memoria RAM.
             * 
             * @return Devuelve la memoria RAM.
             */
            public byte getMemoriaRam() {
                return memoriaRam;
            }

            
            /**
             * Método que modifica la memoria RAM. Sólo se permiten 3 dígitos.
             * 
             * @param memoriaRam Memoria RAM.
             */
            public void setMemoriaRam(byte memoriaRam) {
                
                boolean validador = false ;
                
                do 
                {
                    if (( memoriaRam > 0 ) && ( memoriaRam <= 64)) 
                    {
                        this.memoriaRam = memoriaRam ;
                        validador = true ;
                    }
                    else
                    {
                        System.out.println(Utilidades.coloreaCadena("\nLos ordenadores actuales no sobrepasan los 64 GB de RAM.", Utilidades.rojo)) ;
                        memoriaRam = Utilidades.leerByteConLimiteDeDigitos("\nIntroduce la memoria RAM: ", 3) ;
                    }
                    
                } while (!validador);
            }
        
        
            // NÚMERO DE NÚCLEOS
            
            
            /**
             * Método que devuelve el número de núcleos.
             * 
             * @return Devuelve el número de núcleos.
             */
            public byte getNucleos() {
                return nucleos;
            }

            
            /**
             * Método que modifica el número de núcleos. Sólo permite dos dítigos.
             * 
             * @param nucleos Número de núcleos.
             */
            public void setNucleos(byte nucleos) {
                
                boolean validador = false ;
                
                do
                {
                    if (( nucleos > 0 ) && ( nucleos <= 99)) 
                    {
                        this.nucleos = nucleos ;
                        validador = true ;
                    }
                    else
                    {
                        System.out.println(Utilidades.coloreaCadena("\nEl valor sólo puede tener 2 dígitos como máximo.", Utilidades.rojo));
                        nucleos = Utilidades.leerByteConLimiteDeDigitos("\nIntroduce el númeor de núcleos:", 2) ;
                    }
                    
                } while (!validador);
            }

            
            // NÚMERO DE SERIE
            
            
            /**
             * Método que devuelve el número de serie.
             * @return Devuelve el número de serie.
             */
            public String getNum_serie() {
                return num_serie;
            }

            
            /**
             * Método que modifica el número de serie. Permite 20 caracteres como máximo.
             * 
             * @param num_serie Número de serie (tipo cadena).
             */
            public void setNum_serie(String num_serie) {
                
                boolean validador = false ;
                
                do 
                {
                    if (( num_serie.length() > 0 ) && ( num_serie.length() <= 20))
                    {
                        this.num_serie = num_serie ;
                        validador = true ;
                    }
                    else
                    {
                        System.out.println(Utilidades.coloreaCadena("\nEl número de serie no puede tener más de 20 caracteres.", Utilidades.rojo));
                        num_serie = Utilidades.leerStringConLimiteCaracteres("\nIntroduce el número de serie:", 20) ;
                    }
                    
                } while (!validador);
                
            }
            
            
            // MARCA

            
            /**
             * Método que devuelve la marca.
             * 
             * @return Devuelve la marca.
             */
            public String getMarca() {
                return marca;
            }

            
            /**
             * Método que modifica la marca.
             * 
             * @param marca Marca.
             */
            public void setMarca(String marca) {
                this.marca = marca;
            }
            
            
            // MODELO
            

            /**
             * Método que devuelve el modelo.
             * 
             * @return Devuelve el modelo.
             */
            public String getModelo() {
                return modelo;
            }

            
            /**
             * Método que modifica el modelo.
             * 
             * @param modelo Modelo.
             */
            public void setModelo(String modelo) {
                this.modelo = modelo;
            }

            
            // DISCO DURO
            
            
            /**
             * Método que devuelve el tipo de disco duro.
             * 
             * @return Devuelve el tipo de disco duro.
             */
            public String getTipoDiscoDuro() {
                return tipoDiscoDuro;
            }

            
            /**
             * Método que modifica el tipo de disco duro. Permite elegir entre dos constantes: HDD y SSD.
             * Si no se acierta a la priemra sugerirá un menú que limita las opciones.
             * 
             * @param tipoDiscoDuro Tipo de disco duro.
             */
            public void setTipoDiscoDuro(String tipoDiscoDuro) {
                
                int opcion ;
                boolean validador = false ;
                
                // Primero voy a confiar en el/la usuario/a y voy a comparar el valor. Si es válido adelante.
                
                if (tipoDiscoDuro.equals("HDD")) 
                {
                    opcion = 1 ;
                }
                else if (tipoDiscoDuro.equals("SSD"))
                {
                    opcion = 2 ;
                }
                else
                {
                    opcion = 0 ;
                }
                
                // Si no ha resultado le conduciré a un menú para que elija entre una de los dos constantes.
                
                
                if (( opcion != 1 ) || ( opcion != 2 )) 
                {
                    do 
                    {
                        System.out.println("\n¿Qué tipo de disco duro tiene: ");
                        System.out.println("\n1. HDD");
                        System.out.println("2. SSD\n");

                        switch (opcion)
                        {
                            case 1:
                                TipoDiscoDuro tipoDisco = TipoDiscoDuro.HDD ;
                                this.tipoDiscoDuro = tipoDisco.getTipo() ;
                                validador = true ;
                                break ;

                            case 2:
                                tipoDisco = TipoDiscoDuro.SSD ;
                                this.tipoDiscoDuro = tipoDisco.getTipo() ;
                                validador = true ;
                                break ;

                            default:
                                System.out.println("\nElige la opción 1 ó 2.") ;

                        }
                        
                    } while (!validador) ;
                }
                
            }
            
            
            // PROCESADOR
            

            /**
             * Método que devuelve el tipo de procesador.
             * 
             * @return Devuelve el tipo de procesador.
             */
            public String getProcesador() {
                return procesador;
            }

            
            /**
             * Método que modifica el procesador.
             * 
             * @param procesador Procesador.
             */
            public void setProcesador(String procesador) {
                this.procesador = procesador;
            }
            
            
            // ARRANCADO
            

            /**
             * Método que devuelve si el ordenador está arrancado.
             * 
             * @return Devuelve true si está arrancado, false si no.
             */
            public boolean isArrancado() {
                return arrancado;
            }

            
            /**
             * Método que modifica el estado del ordenador, si está arrancado o no.
             * 
             * @param arrancado Si está arrancado. True sí, false no.
             */
            public void setArrancado(boolean arrancado) {
                this.arrancado = arrancado;
            }
            
            
        // --- TO STRING ---

        /**
         * Método toString() de la clase Ordenador.
         * 
         * @return Los atributos del ordenador.
         */
            @Override
        public String toString() {
            return "Ordenador{" + "memoriaRam=" + memoriaRam + ", nucleos=" + nucleos + ", num_serie=" + num_serie + ", marca=" + marca + 
                    ", modelo=" + modelo + ", tipoDiscoDuro=" + tipoDiscoDuro + ", procesador=" + procesador + ", arrancado=" + arrancado + '}';
        }
        
        
        // ----- MÉTODO EQUALS -------
        
        /**
         * Método comparador. Si el objeto pasado es de tipo ordenador lo compara para verificar si los númeors de serie son iguales.
         * 
         * @param obj Objeto que se quiere comparar.
         * @return Devuelve true si son iguales, false si no lo son.
         */
        @Override
        public boolean equals(Object obj){
            
            if (obj != null && !(obj instanceof Ordenador)) 
            {
                return false ;
            }
            
            boolean iguales = false ;
            Ordenador otro = (Ordenador)obj ; // Casting
            
            if (this.num_serie.equals(otro.num_serie)) 
            {
                iguales = true ;
            }
            return iguales ;
        }
       
            
        // --------- MÉTODOS PERSONALIZADOS --------
            
            
        /**
         * Métdo que muestra por pantalla un mensaje y pone arrancado en true
         */
        public void arrancar(){
            
            System.out.println("\nEl ordenador se está arrancando.");
            System.out.println("-");
            System.out.println("-----");
            System.out.println("----------");
            System.out.println("----------------");
            System.out.println("\nPresiona cualquier tecla para continuar..."); 
            Utilidades.leerString("") ;
            
            System.out.println("              _______          _______ _________ _______          \n" +
                            "             /  ___  \\        /  ___  \\\\___   ___\\\\  ___ \\         \n" +
                            "            /  /   \\  \\      /  /   \\__/   \\  |   \\/|   \\/         \n" +
                            "           /  /     \\  \\    /  /           |  |      |             \n" +
                            "           |  |     |  |    |  |           |  |      |             \n" +
                            "           |  |     |  |    |  |  ____     |  |      |             \n" +
                            "           |  |     |  |    |  | |____|    |  |      |             \n" +
                            "           |  |     |  |    |  |           |  |      |             \n" +
                            "           |  |     |  |    |  |           |  |      |             \n" +
                            "           |  |     |  |    |  |           |  |      |             \n" +
                            "           \\  \\___/  /     \\  \\___/\\\\___/  |_/      |_/            \n" +
                            "            \\_______/       \\_______\\___|___/                    \n" +
                            "                             _     _ _______ _______ _______ _______ \n" +
                            "                            | | _ | ||  ___  \\\\  ___\\\\  ___\\\\  ___  \\\n" +
                            "                            | || || ||_/  / / \\ \\__| \\ \\__| \\ \\_/  /\n" +
                            "                            | || || |    / /   \\ \\    \\ \\    \\   __/ \n" +
                            "                            | || || |   / /     \\ \\___ \\ \\___ \\ |    \n" +
                            "                            |_||_||_|  /_/       \\____\\\\____\\\\_|    \n" +
            "");
            
            System.out.println("Loading Operating System...  \n" +
"                      =====================================\n" +
"                               ███ 50% ██████████    ");
            
             System.out.println("\n\n-");
            System.out.println("-----");
            System.out.println("----------");
            System.out.println("----------------\n\n");
            
            System.out.println(" \nWelcome to Güindous!\n" +
"                      =====================================\n" +
"                               ███ 100% ██████████\n" +
"                               \n" +
"                       Please enter your username and password:");
            Utilidades.leerString("\n\tNombre de usuario:") ;
            Utilidades.leerString("\n\tContraseña") ;
            
            this.arrancado = true ;
        }
        
        
        
        /**
         * Método que muestra por pantalla un mensaje y pone arrancado en false.
         */
        public void apagar(){
            
            if (!Utilidades.secuenciaSalida("\n¿De verdad quieres apagar el sistema?")) 
            {
                System.out.println(" Shutting Down Güindous...\n" +
"                      =====================================\n" +
"                               ███ 50% ██████████\n" +
"                               \n" +
"                          Saving System Settings...\n" +
"                      =====================================\n" +
"                               ███ 75% ██████████\n" +
"                               \n" +
"                        Closing System Processes...\n" +
"                      =====================================\n" +
"                               ███ 90% ██████████\n" +
"                               \n" +
"                    Goodbye, Thanks for using Güindous Computer!\n" +
"                      =====================================\n" +
"                               ███ 100% ██████████\n");
                System.out.println(" \n\n\t\t\t\t_     _ _______ _______ \n" +
"                            | | _ | ||  ___  \\\\  ___\\\n" +
"                            | || || ||_/  / / \\ \\__|\n" +
"                            | || || |    / /   \\ \\   \n" +
"                            | || || |   / /     \\ \\__\n" +
"                            |_||_||_|  /_/       \\___|");
            
                this.arrancado = false ;
            }
        }
        
        
        // ---------- MÉTODOS ABSTRACTOS ------------
        
        /**
         * Método abstracto. Se utiliza para dibujar.
         */
        abstract public void dibujar() ;

}
