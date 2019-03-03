/*En este ejemplo usaremos la clase JOptionPane con su metodo showInputDialog()
 *Esta clase pertenece al paquete javax.swing por tanto debemos importarlo
 */

package primerosPasos;
import javax.swing.*;							//importamos el paquete


public class EntradaDeDatosII {

	public static void main(String[] args) {
		
		//creamos variable nombre usuario. En ella se almacena lo que escribamos en la ventana creada por JOptionPane
		
		/*showInputDialog SIEMPRE devuelve un string, por tanto tenemos que convertir los datos que no queramos como string.
		Para pasar a int, por ejemplo, un string, necesiamos el metodo estatico parseInt() de la clase Integer. 
		como es estatico ---> Integer.parseInt()*/
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor:");
		
		int edad_usuario = Integer.parseInt(edad);			//convertimos el string edad en un int, en la variable edad_usuario
		
		System.out.println("Hola, " + nombre_usuario + ". El año que viene tendras " + (edad_usuario+1) + " años.");

	}

}
