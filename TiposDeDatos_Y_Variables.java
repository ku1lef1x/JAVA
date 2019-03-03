/*Tipos de datos primitivos:
 * 
		 * Enteros ---> (int[4bytes], short[2bytes], long[8bytes,lleva sufijo L], byte[1byte, -128 a 127])   
		 * Coma flotante(decimales) ---> (float[pocos decimales, sufijo F], double[mas decimales])
		 * Caracteres ---> (char[van entre '  '])
		 * Booleanos ---> (true[verdadero], false[falso])
		 
Variables definicion: todo como c#
		tipo de dato + nombre:
		
		int salario;	 			//declaracion
		salario = 1000; 			//iniciacion
		int salario = 1000;			//declaracion e iniciacion
		

Los datos mas usados o genericos son: int, double, char y boolean. 

Si seleccionamos en la creacion de la clase podemos autocrear el main

Propiedades: caracteristicas de un objeto (ej, un coche azul)
Metodos: qué es capaz de hacer un objeto (ej, un coche arranca)

*		La consola tiene también sus metodos
*
*		A groso modo seria la consola (out), imprime[metodo] (print), la variable o datos (edad)*/

//iniciamos y usamos variables en este ejemplo

package primerosPasos;

public class TiposDeDatos_Y_Variables {

	public static void main(String[] args) {
		byte edad; //declarada
		
		edad = 35; //iniciamos
		
		byte edad2 = 27; //declaracion e iniciacion
		
		System.out.println(edad); //impresion por consola 35
				
		System.out.println(edad2); //impresion por consola edad2 27
		
		edad = 75; //cambiamos el valor a variable
		
		System.out.println(edad); //impresion por consola tras variar valor edad 75
	}

}
