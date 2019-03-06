/*Es un bucle determinado, es decir, sabemos las veces que se repetira el codigo de su interior. 
 * 
 * Su sintaxis es:
 * 
 * for (inicio bucle, condicion, contador bucle){
 * 
 * 		codigo
 * 		codigo
 * 		codigo
 * }
 * 
 * 
 * Primero iniciara en i=0; comprueba que sea menor que 10, si es asi entra a ejecutar el codigo de su interior.
 * Una vez ejecutado, incrementa la i, y pasa a valer 1. Vuelve a comprobar que sea menor que 10, se cumple y ejecuta.
 * Asi sucesivamente hasta que llegamos a i=10, donde ya no se cumple la condicion y no se ejecutaria el codigo del interior
 * del bucle for, pasando al resto del codigo fuera del bucle*/

package primerosPasos;

import javax.swing.JOptionPane;

public class Bucle_For {

	public static void main(String[] args) {
		//iniciamos el bucle i= 0;
		//mientras i es menor que 10
		//incrementa i cada vez que se ejecute el codigo
		for (int i = 0; i<10; i++) {					
			
			System.out.println("KUILANDIO!");
			
		}
		
		//evaluaremos si una direccion de correco electronico es correcta si tiene un @ o no
		
		boolean arroba = false;
		
		String mail = JOptionPane.showInputDialog("Introduce el mail");
		
		for (int i = 0; i<mail.length(); i++) {
			
			if(mail.charAt(i) == '@') arroba = true;
		}
		
		if (arroba == true) {
			System.out.println("El mail es correcto");
		}
		
		else System.out.println("El mail es incorrecto");
		
		
		

	}

}
