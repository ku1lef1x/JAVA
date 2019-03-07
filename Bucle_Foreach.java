/*Se implemento para facilitar el recorrido de matrices. Se puede traducir por "por cada"*/
/*Ejemplo rellenar matriz con numeros aleatorios y recorrerla con foreach*/


package primerosPasos;

import javax.swing.JOptionPane;

public class Bucle_Foreach {

	public static void main(String[] args) {
		
		//Creamos matriz que almacena paises
		
		String [] paises = new String [8];
		
		/*paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";*/
		
		//String [] paises = {"España", "México", "Colombia", "Peru", "Chile", "Argentina", "Ecuador", "Venezuela"};
		
		/*for (int i = 0; i<paises.length; i++) {
			
			System.out.println("Pais "+ (i+1) + " " + paises[i]);
		}*/
		
		//Recorremos con foreach
		
		/*for(String elemento:paises) {
			
			elemento = JOptionPane.showInputDialog("Introduce un pais");				//Mostrara todos los valores almacenados en la matriz 
		}*/
		
		for (int i=0; i<paises.length;i++) {
			
			paises[i] = JOptionPane.showInputDialog("Introduce el pais " + (i+1));
		}
		
		for (String elemento:paises) {
			
			System.out.println(elemento);
		}
		
		//rellenamos matriz d numeros aleatorios
		
		int [] matriz_aleatorios = new int [150];
		
		for (int i=0; i<matriz_aleatorios.length;i++) {
			
			/*Como Math.random es un doble transformamos a int, redondeamos y numero aleatorio*/
			matriz_aleatorios[i] = (int) Math.round(Math.random()*100);					
			
		}
		
		for (int numeros: matriz_aleatorios) {			//antes usabamos string pq recorriamos palabras, ahora usamos int
			
			System.out.print(numeros + " ");
		}
		
	}

}
