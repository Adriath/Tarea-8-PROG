
package maestre.ordenadores.app;

import maestre.ordenadores.modelo.Ordenador;
import maestre.ordenadores.modelo.Portatil;
import maestre.ordenadores.modelo.Sobremesa;
import utilidades.Utilidades;

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
    
    
    // ------------------------------------------------------------
    // -------------------- MÉTODO MAIN ---------------------------
    // ------------------------------------------------------------
    
    
    /**
     * Método main de la clase Parte1App
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        
        char opcion ;

        boolean validador = false ;

        Ordenador[] lista = new Ordenador[6] ;

        Portatil portatil1 = new Portatil((byte)15, "ej38jj3o8jf", "HP", "Pavilion", (byte)8, "Intel i5 4800U", (byte)2, "HDD", false) ;
        Portatil portatil2 = new Portatil((byte)17, "jñol83m8mñas", "MSI", "Firefly", (byte)16, "Intel i7 9800H", (byte)6, "SSD", false) ;
        Portatil portatil3 = new Portatil((byte)14, "ajañj-34j3lk8", "Chromebook", "Pixel", (byte)2, "Tensor", (byte)2, "SSD", false) ;

        Sobremesa sobremesa1 = new Sobremesa("Gygabyte", "ATI Radeon 7500", "añsoejo8787ñl", "Medion", "Capsule", (byte)6, "AMD Tyzon", (byte)4, "SSD", false) ;
        Sobremesa sobremesa2 = new Sobremesa("IBM", "NVidia GTX 4800", "jñaolj8ki3jijim3", "Microsoft", "Norface", (byte)16, "AMD Tyzon", (byte)10, "SSD", false) ;
        Sobremesa sobremesa3 = new Sobremesa("Gygabyte", "placa de tostadora", "jja83mnh88hn233", "Taurus", "Xtreme", (byte)1, "KillerPatient", (byte)1, "HDD", false) ;

        lista[0] = portatil1 ;
        lista[1] = portatil2 ;
        lista[2] = portatil3 ;
        lista[3] = sobremesa1 ;
        lista[4] = sobremesa2 ;
        lista[5] = sobremesa3 ;

        System.out.println(Utilidades.coloreaCadena("\n¡BIENVENIDO/A A LA APLICACIÓN DE GESTIÓN DE ORDENADORES!", Utilidades.amarillo)) ;
        System.out.println(Utilidades.coloreaCadena("--------------------------------------------------------\n", Utilidades.amarillo)) ;
        
        System.out.println("A continuación vas a visualizar las características y las posiciones de los distintos ordenadores.");
        System.out.println("Podrás interactuar con estos datos a través del menú. Cuando necesites ver las posiciones utiliza la opción LISTAR.\n") ;
        
        listar(lista) ;

        do{
            
            menu() ;
            
            opcion = Character.toLowerCase(Utilidades.leerCaracter("\nIntroduce la opción que deseas ejecutar:")) ;

            switch (opcion){

                case 'a': // LISTAR

                    listar(lista) ;
                    break ;

                case 'b': // LISTAR PORTÁTILES

                    listarPortatiles(lista) ;
                    break ;
                    
                case 'c': // LISTAR SOBREMESA
                    
                    listarSobremesa(lista) ;
                    break ;
                    
                case 'd': // ENCENDER
                    
                    int posicion = Utilidades.leerEntero("\nElige la posición del ordenador que quieres encender:") ;
                    encender(lista, posicion) ;
                    break ;
                    
                case 'e': // APAGAR
                    
                    posicion = Utilidades.leerEntero("\nElige la posición del ordenador que quieres apagar:") ;
                    apagar(lista, posicion) ;
                    break ;
                    
                case 'f': // DIBUJAR
                    
                    posicion = Utilidades.leerEntero("\nElige la posición del ordenador que quieres dibujar:") ;
                    dibujar(lista, posicion) ;
                    break ;
                    
                case 'g': // CARGAR
                    
                    int minutos = Utilidades.leerEntero("\n¿Cuántos minutos de autonomía quieres añadir a la carga?") ;
                    cargar(lista, minutos) ;
                    break ;
                    
                case 'h': // DESCARGAR
                    
                    minutos = Utilidades.leerEntero("\n¿Cuántos minutos de autonomía quieres quitar a la carga?") ;
                    descargar(lista, minutos) ;
                    break ;
                    
                case 'i': // SALIR
                    
                    validador = !( Utilidades.secuenciaSalida("\n¿De verdad quieres salir de la aplicación?") ) ;
                    break ;
                    
                default:
                    
                    System.out.println(Utilidades.coloreaCadena("\nTienes que seleccionar una opción válida.\n", Utilidades.rojo)) ;
                    break ;
            }

        } while (!validador);
    
        
        System.out.println(Utilidades.coloreaCadena("\n--------------------------------------------------------", Utilidades.amarillo)) ;
        System.out.println(Utilidades.coloreaCadena("¡GRACIAS POR UTILIZAR LA APLICACIÓN DE GESTIÓN DE ORDENADORES!\n", Utilidades.amarillo)) ;
    }
    
    
    // ------------------- OTROS MÉTODOS ------------------------
    
    
    /**
     * Método privado que muestra el menú de la aplicación.
     */
    private static void menu(){
        
        System.out.println("\n\t" + Utilidades.coloreaCadena("--------------------------------------", Utilidades.cyan));
        System.out.println("\t" + Utilidades.coloreaCadena("---------------- MENÚ ----------------", Utilidades.cyan));
        System.out.println("\t" + Utilidades.coloreaCadena("--------------------------------------\n", Utilidades.cyan));
        
        System.out.println(Utilidades.coloreaCadena("\ta. Listar todos los ordenadores mezclados (portátiles y sobremesa).", Utilidades.cyan)) ;
        System.out.println(Utilidades.coloreaCadena("\tb. Listar sólo los portátiles.", Utilidades.cyan)) ;
        System.out.println(Utilidades.coloreaCadena("\tc. Listar sólo los ordenadores de sobremesa.", Utilidades.cyan)) ;
        System.out.println(Utilidades.coloreaCadena("\td. Encender un ordenador.", Utilidades.cyan)) ;
        System.out.println(Utilidades.coloreaCadena("\te. Apagar un ordenador.", Utilidades.cyan)) ;
        System.out.println(Utilidades.coloreaCadena("\tf. Dibujar un ordenador.", Utilidades.cyan)) ;
        System.out.println(Utilidades.coloreaCadena("\tg. Cargar portátiles.", Utilidades.cyan)) ;
        System.out.println(Utilidades.coloreaCadena("\th. Descargar portátiles.\n", Utilidades.cyan)) ;
        System.out.println(Utilidades.coloreaCadena("\ti. Salir.\n", Utilidades.cyan)) ;
        
    }
    
    
    /**
     * Método que lista los objetos de tipo Ordenador y los muestra por pantalla.
     * 
     * @param lista Array de tipo Ordenador.
     */
    private static void listar(Ordenador[] lista){
        
        for (int i = 0; i < lista.length; i++) 
        {
            System.out.println(Utilidades.coloreaCadena("\n // Ordenador " + (i + 1) + " //", Utilidades.verde));
            System.out.println(lista[i].toString()); ;
        }
    }
    
    
    /**
     * Método que lista los objetos de tipo Portatil y los muestra por pantalla.
     * 
     * @param lista Array de tipo Ordenador.
     */
    private static void listarPortatiles(Ordenador[] lista){
        
        int contador = 1 ;
        
        System.out.println(Utilidades.coloreaCadena("\n // Lista de portátiles " + "//", Utilidades.verde));
        
        for (int i = 0; i < lista.length; i++) 
        {
            if (lista[i] instanceof Portatil) 
            {
                System.out.println(Utilidades.coloreaCadena("\nPortátil " + contador, Utilidades.verde));
                System.out.println(lista[i].toString()); ;
                
                contador++ ;
            }
        }
    }
    
    
    /**
     * Método que lista los objetos de tipo Sobremesa y los muestra por pantalla.
     * 
     * @param lista Array de tipo Ordenador.
     */
    private static void listarSobremesa(Ordenador[] lista){
        
        int contador = 1 ;
        
        System.out.println(Utilidades.coloreaCadena("\n // Lista de ordenadores de sobremesa " + "//", Utilidades.verde));
        
         for (int i = 0; i < lista.length; i++) 
        {
            if (lista[i] instanceof Sobremesa) 
            {
                System.out.println(Utilidades.coloreaCadena("\nOrdenador de sobremesa " + contador, Utilidades.verde));
                System.out.println(lista[i].toString()); ;
                
                contador++ ;
            }
        }
    }
    
    
    /**
     * Método que enciende un ordenador contenido en la lista (array).
     * 
     * @param lista Array de tipo Ordenador.
     * @param posicion Posición en la lista del ordenador que queremos arrancar.
     */
    private static void encender(Ordenador[] lista, int posicion){
        
        int i = 0;
        boolean validador = false ;
        
        // Comprobamos en primer lugar que la posición pasada por parámetro sea compatible con el array.
        
        do
        { 
            if (( posicion > 0 ) && ( posicion <= lista.length) ) 
                // Si la posición escogida es mayor que 0 y menor a la longitud del array...
            {
                i = posicion - 1 ; // ...trata i como un valor menos a la posición para igualar la percepción humana a las posiciones del lenguaje...
                validador = true ; // ...y sal del bucle para continuar.
            }
            else
                // Si el valor no era permitido avisa del rango por pantalla y vuelve a pedir el valor.
            {
                System.out.println(Utilidades.coloreaCadena("\nLa posición elegida no puede ser menor que 1 ni mayor que " + lista.length + ".\n", Utilidades.rojo)) ;
                posicion = Utilidades.leerEnteroConLimiteDeDigitos("\nIntroduce la posición de nuevo: ", lista.length) ;
            }
            
        } while (!validador);
        
        // Si hemos llegado hasta aquí es porque el valor es válido. Nos encontramos con dos opciones:
        
        if (lista[i].isArrancado())
            // Si el ordenador ya está arrancado avisará por pantalla.
        {
            System.out.println(Utilidades.coloreaCadena("\n/ ERROR /", Utilidades.rojo)) ;
            System.out.println("El ordenador " + posicion + " ya está arrancado.\n") ;
        }
        else
            // Si el ordenador no está arrancado lo arrancará y avisará por pantalla.
        {
            lista[i].arrancar() ;
            System.out.println(Utilidades.coloreaCadena("\nEL ORDENADOR " + posicion + " HA SIDO ARRANCADO CON ÉXITO.\n", Utilidades.verde)) ;
        }
    }
    
    
     /**
     * Método que apaga un ordenador contenido en la lista (array).
     * 
     * @param lista Array de tipo Ordenador.
     * @param posicion Posición en la lista del ordenador que queremos arrancar.
     */
    private static void apagar(Ordenador[] lista, int posicion){
        
        int i = 0;
        boolean validador = false ;
        
        // Comprobamos en primer lugar que la posición pasada por parámetro sea compatible con el array.
        
        do
        { 
            if (( posicion > 0 ) && ( posicion <= lista.length) ) 
                // Si la posición escogida es mayor que 0 y menor a la longitud del array...
            {
                i = posicion - 1 ; // ...trata i como un valor menos a la posición para igualar la percepción humana a las posiciones del lenguaje...
                validador = true ; // ...y sal del bucle para continuar.
            }
            else
                // Si el valor no era permitido avisa del rango por pantalla y vuelve a pedir el valor.
            {
                System.out.println(Utilidades.coloreaCadena("\nLa posición elegida no puede ser menor que 1 ni mayor que " + lista.length + ".\n", Utilidades.rojo)) ;
                posicion = Utilidades.leerEnteroConLimiteDeDigitos("\nIntroduce la posición de nuevo: ", lista.length) ;
            }
            
        } while (!validador);
        
        // Si hemos llegado hasta aquí es porque el valor es válido. Nos encontramos con dos opciones:
        
        if (!( lista[i].isArrancado() ))
            // Si el ordenador ya está apagado avisará por pantalla.
        {
            System.out.println(Utilidades.coloreaCadena("\n/ ERROR /", Utilidades.rojo)) ;
            System.out.println("El ordenador " + posicion + " ya está apagado.\n") ;
        }
        else
            // Si el ordenador no está arrancado lo arrancará y avisará por pantalla.
        {
            lista[i].apagar();
            System.out.println(Utilidades.coloreaCadena("\nEL ORDENADOR " + posicion + " HA SIDO APAGADO CON ÉXITO.\n", Utilidades.verde)) ;
        }
    }
    
    /**
     * Método que muestra por pantalla las características de un ordenador 
     * contenido en una posición de un array y dibuja un gráfico basado en su 
     * memoria RAM y número de núcleos.
     * 
     * @param lista Array de tipo Ordenador.
     * @param posicion Posición en la lista del ordenador que queremos dibujar.
     */
    private static void dibujar(Ordenador[] lista, int posicion){
        
        int i = 0;
        boolean validador = false ;
        
        // Comprobamos en primer lugar que la posición pasada por parámetro sea compatible con el array.
        
        do
        { 
            if (( posicion > 0 ) && ( posicion <= lista.length) ) 
                // Si la posición escogida es mayor que 0 y menor a la longitud del array...
            {
                i = posicion - 1 ; // ...trata i como un valor menos a la posición para igualar la percepción humana a las posiciones del lenguaje...
                validador = true ; // ...y sal del bucle para continuar.
            }
            else
                // Si el valor no era permitido avisa del rango por pantalla y vuelve a pedir el valor.
            {
                System.out.println(Utilidades.coloreaCadena("\nLa posición elegida no puede ser menor que 1 ni mayor que " + lista.length + ".\n", Utilidades.rojo)) ;
                posicion = Utilidades.leerEnteroConLimiteDeDigitos("\nIntroduce la posición de nuevo: ", lista.length) ;
            }
            
        } while (!validador);
        
        System.out.println(Utilidades.coloreaCadena("\nCaracterísticas del ordenador " + posicion, Utilidades.cyan)) ;
        lista[i].dibujar() ; // Muestra sus datos y dibuja el gráfico.
    }
    
    
    
    /**
     * Método que carga la batería de todos los portátiles contenidos en la 
     * lista (array) de ordenadores. Mostrará por pantalla la autonomía total de 
     * cada uno de ellos tras la carga.
     * 
     * @param lista Array de tipo Ordenador.
     * @param minutos Minutos que se quieren añadir a la autonomía de la batería.
     */
    private static void cargar(Ordenador[] lista, int minutos){
        
        short autonomia ;
        
        Portatil[] listaPortatil =  new Portatil[lista.length] ;
        
        System.out.println(Utilidades.coloreaCadena("\nLAS BATERÍAS HAN SIDO CARGADAS CON ÉXITO.", Utilidades.verde)) ;
        
        for (int i = 0; i < lista.length; i++) {
            
            if (lista[i] instanceof Portatil){
                
                listaPortatil[i] = (Portatil)lista[i] ;

                if (listaPortatil[i] != null)
                {
                    autonomia = listaPortatil[i].cargar(minutos) ;
                    System.out.println(Utilidades.coloreaCadena("\nLa autonomía del portátil " + (i + 1) + " es de " + autonomia + " minutos.", Utilidades.cyan)) ;
                }
            }
        }

        System.out.print("\n");
    }
    
    
    
    /**
     * Método que descarga la batería de todos los portátiles contenidos en la 
     * lista (array) de ordenadores. Mostrará por pantalla la autonomía total de 
     * cada uno de ellos tras la descarga.
     * 
     * @param lista Array de tipo Ordenador.
     * @param minutos Minutos que se quieren quitar a la autonomía de la batería.
     */
    private static void descargar(Ordenador[] lista, int minutos){
        
        short autonomia ;
        
        Portatil[] listaPortatil =  new Portatil[lista.length] ;
        
        System.out.println(Utilidades.coloreaCadena("\nLAS BATERÍAS HAN SIDO DESCARGADAS CON ÉXITO.", Utilidades.verde)) ;
        
        for (int i = 0; i < lista.length; i++) {
            
            if (lista[i] instanceof Portatil){
                
                listaPortatil[i] = (Portatil)lista[i] ;

                if (listaPortatil[i] != null)
                {
                    autonomia = listaPortatil[i].descargar(minutos) ;
                    System.out.println(Utilidades.coloreaCadena("\nLa autonomía del portátil " + (i + 1) + " es de " + autonomia + " minutos.", Utilidades.cyan)) ;
                }
            }
        }

        System.out.print("\n");
    }
}

