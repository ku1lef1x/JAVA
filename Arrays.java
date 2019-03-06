/*Los arrays son estructuras de datos que contienen una coleccion de valores del mismo tipo. 
 *Sirven para almacenar valores que normalmente tienen alguna relacion entre si
 *Cuando en lugar de una variable tenemos que almacenar varias con una relacion entre ellas se usan los arrays o matrices
 *
 * Su sintaxis es:
 * 
 *  int [] array = new int [10]; //donde [10] serían los elementos que contiene la lista o array
 *  
 *  Podemos declarar la matriz e iniciarla en la misma linea o hacerlo por separado. 
 *  
 *  
 *  //declaracion e iniciacion separada
 *  
 *  int [] mi_array = new int [5];
 *  
 *  mi_array[0]=15;
 *  mi_array[1]=25;
 *  mi_array[2]= 8;
 *  mi_array[3]=-7;
 *  mi_array[4]=92;
 *  
 *  //declaracion e inciciacion en la misma linea
 *  
 *  int [] mi_array = {15,25,8,-7,92};
 * */


package primerosPasos;

public class Arrays {

	public static void main(String[] args) {
		
		int [] array = new int [5];			//declaracion
		
		array[0] =  5;						//iniciacion
		array[1] = 38;						//iniciacion
		array[2] = 15;						//iniciacion
		array[3] = 92;						//iniciacion	
		array[4] = 71;						//iniciacion //indice 4 posicion 5
		
		System.out.println(array[0]);		//mostrara la posicion 1
		System.out.println(array[1]);		//mostrara la posicion 2
		System.out.println(array[2]);		//mostrara la posicion 3
		System.out.println(array[3]);		//mostrara la posicion 4
		System.out.println(array[4]);		//mostrara la posicion 5
		System.out.println("");				//hace un salto de linea
		
		for (int i = 0; i<array.length; i++) {
			
			System.out.print(array[i] + ", ");			//recorremos la matriz o array y en cada iteracion lo vamos mostrando
		}
		
		System.out.println("");							//hacemos un salto de linea
		
		int [] matriz = {5, 38, 15, 92, 71};			//declaracion e iniciacion implicita
		
		for (int i = 0; i<matriz.length; i++) {
			
			if (i==(matriz.length-1)) System.out.print(matriz[i]);		//recorremos el array y en cada iteracion lo vamos mostrando
			else System.out.print(matriz[i] + " ,");					//para que no muestre coma al final del ultimo elemento			
		}
				
	}

}
