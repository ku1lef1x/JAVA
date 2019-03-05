/*Ejemplo adivinar numero aleatorio*/

package primerosPasos;

import java.util.*;

public class Bucle_WhileII {

	public static void main(String[] args) {
		
		//generamos numero aleatorio entre 0 y 100. Math.random();
		//random muestra numero entra 0 y 1
		//lo multiplicamos por 100 para ganar dos cifras (ej 0,22 = 22) y lo hacemos int
		//ya que random devuelve un double
		
		int aleatorio = (int)(Math.random() * 100);				
		
		Scanner entrada = new Scanner (System.in);
		
		int numero = 0;
		
		int intentos = 0;
		
		while (numero != aleatorio) {
			
			intentos++;
			
			System.out.println("Introduce un numero:");
			
			numero = entrada.nextInt();					
			
			if (numero < aleatorio) System.out.println("El numero que buscamos es mayor");
			
			else if (numero > aleatorio) System.out.println("El numero que buscamos es menor");
			
		}
		
		System.out.println("El numero es correcto!!!!. Has necesitado " + intentos +" intentos");
		

	}

}
