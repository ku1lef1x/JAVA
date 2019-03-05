/*Realizaremos con un bucle DoWhile un programa que calcule tu peso ideal. 
 * 
 * Se supone que la formula del peso ideal es para hombres: altura - 110 y para mujeres = altura - 120*/


package primerosPasos;

import javax.swing.JOptionPane;

public class Bucle_DoWhileII {

	public static void main(String[] args) {
		
		String genero = "";
		
		do {
			
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
			
			
		}while (genero.equalsIgnoreCase("H") == false && (genero.equalsIgnoreCase("M") == false));
		//comparamos genero (ignorando Mayusculas) con H y M, sino coincide con ninguna, es decir, ambos casos false
		//no salir del bucle
		//da igual que introduzcamos m/M o h/H
		//el operador && hace que las dos condiciones deban cumplirse 	
				
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm:"));
		//JOptionPane siempre devuelve un string por tanto lo pasamos a int
		//como es estatico necesita la clase a la que pertenece delante
		//sino fuera estatico, como Scanner, necesitaria un objeto
		
		int pesoIdeal=0;
		
		if(genero.equalsIgnoreCase("H")){					//== if(true){}
			
			pesoIdeal = altura - 110;
		}
		
		else if (genero.equalsIgnoreCase("M")) {			//== if(true){};
			
			pesoIdeal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es: " + pesoIdeal);		

	}

}
