/*Veremos los condicionales If y Else if. Sus estruturas son:
 * 
 * if (para una condicion):
 * 
 * if(condicion){
 * 
 * 			codigo si la condicion es true
 * }
 * 
 * else{
 * 
 * 			codigo si la condicion no es true
 * 
 * }
 * 
 * 
 * if (para varias condiciones):
 * 
 * 
 * if(condicion1){
 * 
 * 			codigo
 * }
 * 
 * else if (condicion2){
 * 
 * 			codigo
 * }
 * 
 * else if (condicion3){
 * 
 * 			codigo
 * }
 * 
 * else{
 * 
 * 			codigo
 * 
 * }
 * 
  * */

package primerosPasos;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class Condicional_If_ElseIF {

	public static void main(String[] args) {
		

		//Scanner entrada = new Scanner (System.in);
		
		//System.out.println("introduce tu edad:");
		
		//int edad = entrada.nextInt();
		
		String ed = JOptionPane.showInputDialog("Introduce tu edad");
		
		int edad = Integer.parseInt(ed);
		
		//para evaluar pocas condiciones:
		
		/*
		 * if(edad >= 18) { //si la condicion es true muestra el siguiente mensaje
		 * 
		 * System.out.println("Eres mayor de edad"); } 
		 * else { //si la condicion es false muestra este otro mensaje 
		 * 
		 * System.out.println("Eres menor de edad"); 
		 * }
		 */
		
		//para evaluar muchas condiciones:
		
		if (edad < 18) {
			
			System.out.println("Eres un adolescente");
		}
		
		else if (edad < 40) {
			
			System.out.println("Eres joven");
		}
		else if (edad < 65) {
			System.out.println("Eres maduro");			
		}
		else {
			System.out.println("Cuidate");
		}

	}

}
