/*Realizaremos un programa que calculara el area de varias figuras geometricas, siendo el usuario quien elija por consola
 *la figura y con JOptionPane para las medidas*/

package primerosPasos;

//constructor para clase scanner
import java.util.Scanner;

//constructor para JOptionPane
import javax.swing.JOptionPane;

public class Condicional_Switch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		// \n realiza un salto de lina
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		
		int figura = entrada.nextInt();
		
		switch (figura) {
		
		case 1: 
			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado: "));
						
			//area cuadrado = lado elevado a 2 (math.pow)
			//esta ventana JOptionPane sale al minimizar el Eclipse, sino no se ve
			System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
			
			break;
			
		case 2:
			
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El área del rectángulo es: "+ base * altura);
			
			break;
			
		case 3:
			
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El área del triángulo es: "+ (base*altura)/2);
			
			break;
			
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));
			
			System.out.print("El área del círculo es ");				//imprimimos mensaje sin salto de linea
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));	//printf para mostras con dos decimales
			
			//mostramos la formula del circulo: pi por radio al cuadrado = Math.PI * (Math.pow(radio,2));
			
			break;
			
		default: 
			
			System.out.println("El numero introducido no corresponde a ninguna figura");
		}

	}

}
