
package maestre.ordenadores.modelo;

import utilidades.Utilidades;

/**
 * 
 * @author Adrián Arjona
 */
public class Ordenador {
    
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

        public Ordenador() {
            // CONSTRUCTOR POR DEFECTO
            
            this.num_serie = "" ;
            this.marca = "" ;
            this.modelo = "" ;
            this.memoriaRam = 0 ;
            this.procesador = "" ;
            this.nucleos = 0 ;
            this.tipoDiscoDuro = "" ;
            this.arrancado = false ;
        }

        public Ordenador(String num_serie, String marca, String modelo, byte memoriaRam, String procesador, byte nucleos, String tipoDiscoDuro, boolean arrancado) {
            // CONSTRUCTOR CON PARÁMETROS
            
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
        
        
            public byte getMemoriaRam() {
                return memoriaRam;
            }

            public void setMemoriaRam(byte memoriaRam) {
                
                boolean validador = false ;
                
                do 
                {
                    this.memoriaRam = Utilidades.leerByteConLimiteDeDigitos("\nIntroduce la cantidad de GB: ", 3);
                    
                    if (this.memoriaRam <= 64) 
                    {
                        validador = true ;
                    }
                    else
                    {
                        System.out.println("\nLos ordenadores actuales no sobrepasan los 64 GB de RAM.") ;
                    }
                    
                } while (!validador);
            }
        
        
            // NÚMERO DE NÚCLEOS
            
            
            public byte getNucleos() {
                return nucleos;
            }

            public void setNucleos(byte nucleos) {
                this.nucleos = Utilidades.leerByteConLimiteDeDigitos("\nIntroduce el número de núcleos del procesador:", 2) ;
            }

            
            // NÚMERO DE SERIE
            
            
            public String getNum_serie() {
                return num_serie;
            }

            public void setNum_serie(String num_serie) {
                this.num_serie = Utilidades.leerStringConLimiteCaracteres("\nIntroduce el número de serie:", 20) ;
            }
            
            
            // MARCA

            
            public String getMarca() {
                return marca;
            }

            public void setMarca(String marca) {
                this.marca = marca;
            }
            
            
            // MODELO
            

            public String getModelo() {
                return modelo;
            }

            public void setModelo(String modelo) {
                this.modelo = modelo;
            }

            
            // DISCO DURO
            
            
            public String getTipoDiscoDuro() {
                return tipoDiscoDuro;
            }

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
            

            public String getProcesador() {
                return procesador;
            }

            public void setProcesador(String procesador) {
                this.procesador = procesador;
            }
            
            
            // ARRANCADO
            

            public boolean isArrancado() {
                return arrancado;
            }

            public void setArrancado(boolean arrancado) {
                this.arrancado = arrancado;
            }

}
