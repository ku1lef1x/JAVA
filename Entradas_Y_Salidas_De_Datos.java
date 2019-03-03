/*Hasta ahora, con el metodo System.out.println() hemos visto salidas de datos, es decir, mostrar informacion de datos que tenemos 
 * en nuestro programa. 
 * 
 * Ahora veremos como recibir informacion del exterior. Para recibir esta información, lo correcto es hacerlo a través de una IGU, que es
 * una Interfaz Grafica de Usuario, lo que sería algo parecido a un formulario. No obstante, para crear una IGU en Java es algo complejo, 
 * por tanto de momento cogeremos datos del exterior aprovechando dos clases.
 * 
 * Por un lado, la clase Scanner, que esta formada por los metodos:
 * - nextLine() 	para introducir texto
 * - nextInt()  	para introducir numeros
 * - nextDouble() 	para introducir decimales
 * 
 * Por otro lado, la clase JOptionPane, una clase mucho mas antigua. Esta clase nos crea una ventana de entrada parecida a un formulario
 * donde introduciremos la informacion que entrara en el programa. Está formada por un método estático que es: 
 * - showInputDialog() 			que es estatico quiere decir que tenemos que usar el nombre de la clase delante del metodo
 * 
 * por ejemplo: JOptionPane.showInputDialog()
 * Los metodos de la clase Scanner no son estaticos, por lo que podemos usarlos con un objeto perteneciente a la clase Scanner
 * delante de dicho metodo
 * 
 * Para construir el objeto usaremos los metodos constructores, estos tienen el mismo nombre que la clase a la que pertenecen
 * (en este caso Scanner). Dependiendo del modo en que usemos el constructor para el objeto, este objeto tendra unas caracteristicas u otras, y nos 
 * permitira realizar unas acciones u otras*/

package primerosPasos;

import java.util.Scanner;								//importamos el paquete que contiene la clase Scanner

public class Entradas_Y_Salidas_De_Datos {

	public static void main(String[] args) {
		
		//construimos el objeto
		
		Scanner entrada = new Scanner(System.in);		//instanciamos o ejemplarizamos una clase, es decir:
														//creamos un objeto de nombre entrada y de tipo la clase Scanner
														//= new Scanner(System.in) es decir de las entradas por consola
														//se usa el operador new y el constructor Scanner()
		
		System.out.println("Introduce tu nombre, por favor:");
		
		String nombre_usuario = entrada.nextLine();		//la consola se quedará esperando a que se introduzca el dato o entrada
														//dicha entrada, será un string y se almacena en nombre_usuario
														//nombre_usuario = objeto.metodo() en este caso nextLine() pq entrada = texto
		
		System.out.println("Ahora introduce tu edad, por favor:");
		
		int edad_usuario = entrada.nextInt();			//la consola se quedará esperando a que se introduzca el dato o entrada
														//dicha entrada, será un int y se almacena en edad_usuario
														//edad_usuario = objeto.metodo() en este caso nextInt() pq entrada = numero
		
		System.out.println("Tu nombre es " + nombre_usuario + " y tienes " + edad_usuario + " años.");
		System.out.println("El año que viene tendrás " + (edad_usuario +1) + " años.");
		
	}

}
