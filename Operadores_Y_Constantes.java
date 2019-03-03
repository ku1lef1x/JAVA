/*CONSTANTES:
 * 		son como las variables, espacios de memoria reservados
 * 		pero con la diferencia de que las constantes, como su nombre indican, no varian
 * 		a lo largo de la ejecucion del programa. 
 * 		Son muy utiles cuando queremos hacer calculos que llevan algun elemento que
 * 		nunca debe cambiar, como por ejemplo el radio de una circunferencia, que lleva
 * 		pi y es un valor fijo
 * 
 * Para declarar una constante:
 * 
 * 		Se realizara igual que con las variables pero añadiendo el PREfijo
 * 		final. Ejemplo:
 * 
 * 		final double a_pulgadas; 			//declaramos
 * 		final double a_pulgadas = 2,54; 	//declaramos e iniciamos
 * 
 * 
 * OPERADORES:
 * 
 * 		aritmeticos (+, -, *, /)
 * 		
 * 		logicos = (<, >, <>, <=, >=, !=, ==, &&, ||)
 * 
 * 		incremento y decremento = (++, --, +=X, -=X)
 * 
 * 		concatenacion = (+)*/

package primerosPasos;

public class Operadores_Y_Constantes {

	public static void main(String[] args) {
			
		int a = 5; //declaracion e iniciacion 
		
		int b; //declaracion
		
		b = 7; //iniciacion;
		
		int c = b + a; //c = suma de a y b (12)
		
		c++; //(13)
		
		c+=6; //(19)
		
		//c-=6; //(13)
		
		System.out.println(c); //19
		
		c = b - a; //(2)
		
		System.out.println(c); //2
		
		double x = 3;
		double y = 5;
		double d = x/y;
		
		System.out.println(d); //0.6
		
		int variable = 5;
		
		variable = 7;
		
		final int constante = 5; //declaracion constante, no podemos modificar
		
		int resultado = variable * constante;//(35)
		
		System.out.println(resultado); //35
		
		
		//programa que cambia de m/cm a pulgadas
		
		final double apulgadas = 2.54; //cm en cada pulgada
		
		double cm = 6; //cuantas pulgadas son 6cm
		
		double cambio = cm/apulgadas;
		
		System.out.println("En " + cm + " cm hay " + cambio + " pulgadas");
		
		//declarar apulgadas como constante evita errores de cambios inintencionados...
		
		//se pueden declarar varias variables o constantes en la misma linea
		
		int variable1, variable2, variable3; //declaracion conjunta variables
		
		variable1 = 1;
		
		variable2 = 2;
		
		variable3 = 3;
		
		final int hola, adios; //declaracion conjunta constantes
		
		hola = 1;
		
		adios = 2;
		
		System.out.println(variable1 + variable2 + variable3);
		
		System.out.println(hola + adios);
	}

}
