/*Los bucles de dividen en dos grupos:
 * 
 * a. Indeterminados: while / do-while
 * b. Determinados: for / for-each
 * 
 * Los bucles indeterminados son aquellos que repiten la linea de codigo un numero indeterminado de veces, es decir, hasta que ejecutemos
 * el programa no sabremos cuantas veces se va a repetir el codigo. 
 * 
 * Los bucles determinados son aquellos que sabemos sin necesidad de ejecutar el programa cuantas veces se va a ejecutar el 
 * codigo que continen
 * 
 * El bucle while se puede traducir por "mientras". 
 * La estructura del bucle while es: 
 * 
 * while (codicion) {
 * 
 * 			codigo a ejecutar si se cumple la condicion
 * 			ejecutara tantas veces como condicion = true
 * 			si la condicion de inicio es falsa nunca entrara en el bucle
 * 			si la condicon siempre es cierta entrariamos en un bucle infinito
 * 
 * }
 * 
 * Crearemos una contraseña, mientra el usuario no la acierte, la ventana de JOptionPane no dejará de salir. 
 * 
 * Crearemos otro ejemplo para acertar un numero aleatorio
 * 
 * */


package primerosPasos;

import javax.swing.JOptionPane;

public class Bucle_While {

	public static void main(String[] args) {
		
		String clave = "Jesús";									//clave acceso
		
		String pass = "";
		
		//comparamos clave con pass, mientras no coincidan hacer el codigo
		//entrara seguro porque de primeras la condicion se cumple
		//String.equals compara cadenas
		while (clave.contentEquals(pass) == false) {			
			
			pass = JOptionPane.showInputDialog("Introduce la contraseña");			
			if (clave.contentEquals(pass)==false) {
				
				System.out.println("Contraseña incorrecta");
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");

	}

}
