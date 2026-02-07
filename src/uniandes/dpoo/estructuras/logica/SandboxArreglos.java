package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	if (this.arregloEnteros == null) {
    		return null;
    	}
    	else {
			return this.arregloEnteros.clone();
		}
    }
    
    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	if (this.arregloCadenas == null) {
    		return null;
    	}
    	else {
			return this.arregloCadenas.clone();
		}
    }			

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {	
        return this.arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return this.arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int[] nuevoArreglo = new int[this.arregloEnteros.length + 1];
    	for(int i = 0; i < this.arregloEnteros.length; i++) {
    		nuevoArreglo[i] = this.arregloEnteros[i];
    	}
    	nuevoArreglo[nuevoArreglo.length- 1] = entero;
    	this.arregloEnteros = nuevoArreglo;
        	
    }
    	
    
    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[] nuevoArreglo = new String[this.arregloCadenas.length + 1];
    	for( int i = 0; i < this.arregloCadenas.length; i++) {
    		nuevoArreglo[i] = this.arregloCadenas[i];
    	}
    	nuevoArreglo[nuevoArreglo.length - 1] = cadena;
    	this.arregloCadenas = nuevoArreglo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int CuantosSeQuedan = 0;
    	for( int i = 0; i < this.arregloEnteros.length; i++) {
    		if (this.arregloEnteros[i] != valor) {
    			CuantosSeQuedan++;
    	    	}}
    	int j = 0;
    	int[] nuevoArreglo = new int[CuantosSeQuedan];
    	for(int i = 0; i < this.arregloEnteros.length; i++) {
    		if (this.arregloEnteros[i] != valor) {
    			nuevoArreglo[j] = this.arregloEnteros[i];
    			j++;
    		}}
    	this.arregloEnteros = nuevoArreglo;
    					   		
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    int cuantosSeQuedan = 0;
    for (int i = 0; i < this.arregloCadenas.length; i++) {
		if (!this.arregloCadenas[i].equals(cadena)) {
			cuantosSeQuedan++;
			}}		
    int j = 0;
    String[] nuevoArreglo = new String[cuantosSeQuedan];
    for (int i = 0; i < this.arregloCadenas.length; i++) {
    	if (!this.arregloCadenas[i].equals(cadena)) {
    		nuevoArreglo[j] = this.arregloCadenas[i];
    		j++;
    	}}
    this.arregloCadenas = nuevoArreglo;
    }
    
    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int n = this.arregloEnteros.length;
        
        // 1. AJUSTAR LA POSICIÓN: Si es negativa, va al inicio (0). 
        // Si es más grande que el tamaño, va al final (n).
        if (posicion < 0) {
            posicion = 0;
        } else if (posicion > n) {
            posicion = n;
        }

        // 2. CREAR UN ARREGLO NUEVO: Como no hay listas, necesitamos uno con tamaño n+1
        int[] nuevoArreglo = new int[n + 1];

        // 3. COPIAR LOS ELEMENTOS
        for (int i = 0; i < n + 1; i++) {
            if (i < posicion) {
                // Elementos antes de la inserción
                nuevoArreglo[i] = this.arregloEnteros[i];
            } else if (i == posicion) {
                // El nuevo elemento en su lugar
                nuevoArreglo[i] = entero;
            } else {
                // Elementos después de la inserción (se corren a la derecha)
                nuevoArreglo[i] = this.arregloEnteros[i - 1];
            }
        }

        // 4. REEMPLAZAR EL ARREGLO ORIGINAL
        this.arregloEnteros = nuevoArreglo;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    if (posicion >= 0 && posicion < this.arregloEnteros.length){
    int j = 0;
    int[] nuevoArreglo = new int[this.arregloEnteros.length - 1];
    for(int i = 0; i < this.arregloEnteros.length; i++) {
    	if (i != posicion) {
    		nuevoArreglo[j] = this.arregloEnteros[i];
    		j++;
    		}}
    this.arregloEnteros = nuevoArreglo;
    }}
    
    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
        int[] nuevo = new int[valores.length];
                
        for (int i = 0; i < valores.length; i++){
            nuevo[i] = (int) valores[i]; 
        }
        this.arregloEnteros = nuevo;
    }
    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
        String[] nuevo = new String[objetos.length];
        
        for (int i = 0; i < objetos.length; i++){
            
            if (objetos[i] != null){
                nuevo[i] = objetos[i].toString();
            	} 
            else{
                nuevo[i] = "";
            	}
        }
        this.arregloCadenas = nuevo;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
        for (int i = 0; i < this.arregloEnteros.length; i++) 
        {
           this.arregloEnteros[i] = Math.abs(this.arregloEnteros[i]);
        }
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
        int n = this.arregloEnteros.length;
        
        for (int i = 0; i < n - 1; i++){
        	
            for (int j = 0; j < n - i - 1; j++){
            	
                if (this.arregloEnteros[j] > this.arregloEnteros[j + 1]){
                    
                	int temporal = this.arregloEnteros[j];
                    this.arregloEnteros[j] = this.arregloEnteros[j + 1];
                    this.arregloEnteros[j + 1] = temporal;
                }
            }
        }
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
        int n = this.arregloCadenas.length;
        
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (this.arregloCadenas[j].compareTo(this.arregloCadenas[j + 1]) > 0) 
                {
                    String temporal = this.arregloCadenas[j];
                    this.arregloCadenas[j] = this.arregloCadenas[j + 1];
                    this.arregloCadenas[j + 1] = temporal;
                }
            }
        }
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {	
    	int conteo = 0;
    	for(int i = 0; i <this.arregloEnteros.length; i++){
    		if(this.arregloEnteros[i] == valor){
    			conteo++;
    		}}
    	return conteo;
    }	

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
        int conteo = 0;
        for(int i = 0; i < this.arregloCadenas.length; i++){
            if(this.arregloCadenas[i] != null && this.arregloCadenas[i].equalsIgnoreCase(cadena)){
                conteo++;
            }
        }
        return conteo;	
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int j = 0;
    	 int cuantasVeces = contarApariciones(valor);
    	 int[] posiciones = new int[cuantasVeces];
    	 for(int i=0; i < this.arregloEnteros.length; i++){
    		 if(this.arregloEnteros[i] == valor){
    			posiciones[j] = i;
    			j++;
    		 	}}
    	return posiciones;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
       
        if (this.arregloEnteros.length == 0) 
        {
            return new int[0]; 
        }

        int minimo = this.arregloEnteros[0];
        int maximo = this.arregloEnteros[0];

        
        for (int i = 1; i < this.arregloEnteros.length; i++) 
        {
            if (this.arregloEnteros[i] < minimo) 
            {
                minimo = this.arregloEnteros[i];
            }
            if (this.arregloEnteros[i] > maximo) 
            {
                maximo = this.arregloEnteros[i];
            }
        }

        int[] resultado = {minimo, maximo};
        return resultado;
    }
    
    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
        // 1. Creamos el mapa vacío
        HashMap<Integer, Integer> histograma = new HashMap<>();

        // 2. Recorremos nuestro arreglo de enteros
        for (int i = 0; i < this.arregloEnteros.length; i++) 
        {
            int numeroActual = this.arregloEnteros[i];

            // 3. Verificamos si ya habíamos visto este número antes
            if (histograma.containsKey(numeroActual)) 
            {
                // Si ya existe, obtenemos el conteo actual y le sumamos 1
                int conteoActual = histograma.get(numeroActual);
                histograma.put(numeroActual, conteoActual + 1);
            } 
            else 
            {
                // Si es la primera vez que lo vemos, lo registramos con 1
                histograma.put(numeroActual, 1);
            }
        }

        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
        
        // El mapa ya tiene: numero -> cuantas veces aparece
        HashMap<Integer, Integer> histograma = this.calcularHistograma();
        
        int repetidos = 0;

        for (int cantidad : histograma.values()) 
        {
            // 3. Si la cantidad es mayor a 1, significa que ese número está repetido
            if (cantidad > 1) 
            {
                repetidos++;
            }
        }

        return repetidos;
    }
    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
        if (this.arregloEnteros.length != otroArreglo.length){
            return false;
        }

        for (int i = 0; i < this.arregloEnteros.length; i++){
            // En cuanto encontremos UN solo número que no coincida...
            if (this.arregloEnteros[i] != otroArreglo[i]) 
            {
                return false;
            }
        }
        
        return true;
    }
    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
        
        if (this.arregloEnteros.length != otroArreglo.length) 
        {
            return false;
        }

        HashMap<Integer, Integer> conteoOriginal = this.calcularHistograma();

       
        HashMap<Integer, Integer> conteoOtro = new HashMap<>();
        for (int i = 0; i < otroArreglo.length; i++) 
        {
            int num = otroArreglo[i];
            conteoOtro.put(num, conteoOtro.getOrDefault(num, 0) + 1);
        }

        return conteoOriginal.equals(conteoOtro);
    }
    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
        
        this.arregloEnteros = new int[cantidad];

        
        for (int i = 0; i < cantidad; i++) 
        {
            
            int numeroAleatorio = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
            
            this.arregloEnteros[i] = numeroAleatorio;
        }
    }

}
