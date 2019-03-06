package primerosPasos;
import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		
		//int resultado = 1;				//al ser int el resultado esta limitado, si pedimos un factorial muy alto dara un valor raro
		
		long resultado = 1L;				//al ser long hay que poner sufijo L, ahora podemos pedir factoriales mas altos
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero:"));
		
		for (int i = numero; i > 0; i--) {
			
			resultado = resultado * i;
		}
		
		System.out.println("El factorial de "+ numero  + " es " + resultado);

	}

}
