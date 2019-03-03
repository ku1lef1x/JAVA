/*Usaremos el metodo System.out.printf("%1.2f", arg );
 * 
 *Este hara que el arg muestre tantos decimales como indiquemos en la x de 1.xf
 *en el ejemplo de 1.2f mostraria 2 decimales*/

package primerosPasos;

import java.util.Scanner;							//clase para scanner

import javax.swing.JOptionPane;						//clase para JOptionPane

public class FormateoResultados {

	public static void main(String[] args) {
		
		double x = 10000.0;
		
		System.out.println(x/3);						//nos muestra muchos decimales, podemos evitarlo usamos el metodo explicada al inicio
		
		System.out.printf("%1.2f", x/3);				//1.2f hace referencia a los decimales, si ponemos 1.4 mostraria 4 decimales.
		
		System.out.println();
		
		
		String num1 = JOptionPane.showInputDialog("Introduce un numero");
		
														//transformamos a double ya que queremos su raiz 		
		Double num2 = Double.parseDouble(num1);			//convertimos en double el string num1. 
		
		System.out.print("La raíz de " + num2 + " es ");
		
		System.out.printf("%1.4f", Math.sqrt(num2));	//con 4 decimales mostramos la raiz de num2
		
		System.out.println();
		
		//realizamos los mismos pasos pero ahora con la clase Scanner
		
		System.out.println("Introduce otro numero: ");
		
		Scanner entrada = new Scanner (System.in);		//creamos objeto de tipo Scanner para las entradas de consola
		
		String numero = entrada.nextLine();				//variable numero = entrada que hagamos por teclado
		
		Double numero2 = Double.parseDouble(numero);	//la entrada es un string, la transformamos a double para calculo raiz
		
		System.out.print("La raiz de " + numero + " es igual a ");
		System.out.printf("%1.3f", Math.sqrt(numero2));

	}

}
