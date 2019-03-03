/*Como estamos trabajando por defecto en el paquete java.lang podemos usar las clases String, Math, System... sin problema
 * pero si por ejemplo quisieramos utilizar la clase Scanner, no incluida en el paquete java.lang, tendriamos que hacer una importacion del
 * paquete java.util, que contiene la clase Scanner, y asi poder utilizarla. 
 * 
 * Esto se realiza con el metodo import(siempre debajo del paquete que estemos usando en este moment). Ej:
 * 
 * package X;
 * 
 * import java.util.*; 				
 * 
 * Si no sabemos a que paquete pertecene la clase que queremos usar, en este caso Scanner, vamos a la documentacion de Java
 * buscamos en todas las clases y localizamos la nuestra (Scanner), una vez localizada, pinchamos sobre ella y la web nos indicara
 * cual es el paquete al que pertenece 
 * 
 * Otra alternativa para importar los paquetes correctos seria irnos a los ajustes de Eclipse denominados Codigo Fuente (source)
 * En dicho ajuste buscamos la opcion Organizar importaciones (Organize Imports) y el IDE añade los paquetes necesarios.*/


package primerosPasos;

import java.util.Scanner;								//importada con el ajuste de source

//import java.util.Scanner;								//le pedimos que importe el paquete manualmente consultando docu.

public class ImportacionPaquetes {

	public static void main(String[] args) {
		
		String nombre;
		nombre = "Jesús";
		System.out.println(nombre);
		
		Scanner miObjeto;								//ahora podemos usar la clase Scanner ya que hemos importado el paquete java.util		

	}

}