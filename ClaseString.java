/*En java string no existe como un tipo primitivo (int, double...) sino que existe como clase
 *Para almacenar una cadena de caracteres seria igual que cualquier tipo de dato:
 *				
 *				String mi_nombre = "Jesús" //la S de String siempre en mayuscula
 *
 *Al no ser string un tipo de dato primitivo, mi_nombre sería un OBJETO de la clase string
 *Tambien podría ser una instancia de la clase string o un ejemplar de dicha clase
 *Instaciar una clase es darle un nombre a un objeto
 *
 *La clase String tiene sus correspondientes metodos: para medir longitud, posicion 
 *de una letra...
 *
 *						length() 			devuelve la longitud de la cadena
 *						charAt(numero)		devuelve la posicion de un caracter(empieza a contar desde 0)
 *						substring(x,y)		extra de una cadena de caractere los caracteres que queramos. 
 *						equals(cadena)		compara cadenas (devuelve true o false) Tiene en cuenta may y min
 *						equalsIgnoreCase	compara cadenas ignorando may y min*/

package primerosPasos;

public class ClaseString {

	public static void main(String[] args) {
		
String nombre = "Jesús de kuilandia";
		
		//mostrar nombre
		System.out.println("Tu nombre es: " + nombre);
		
		//longitud de nombre
		System.out.println("Mi nombre tiene " + nombre.length()+ " letras");
		
		//primera letra de nombre
		System.out.println("La primera letra de " + nombre +" es: " + nombre.charAt(0));
		
		//para mostrar la ultima letra del nombre:		
		int ultima_letra;		
		ultima_letra = nombre.length(); //calculamos su longitud
		
		System.out.println("La ultima letra es la: " + nombre.charAt(ultima_letra-1));
		//longitud - 1 = ultima letra
		
		//alternativa		
		System.out.println("La ultima letra es la: " + nombre.charAt(nombre.length()-1));
		//calculamos directamente longitud - 1, asi mostramos la ultima letra
		
	
		
		//mostrar desde un caracter incluido hasta otro sin incluir, concatenar.
		String frase = "Hoy es un estupendo día para aprender a programar en Java";
		
		//queremos mostrar aprender a programar en java
		//en frase.substring incluimos el primer datos es 
		//el primer caracter que queremos mostrar
		//y el segundo dato es el caracter hasta donde queremos mostrar SIN incluir 
		String frase_resumen = frase.substring(10,11); //muestra "e"
		
		System.out.println(frase_resumen);
		
		//tambien podemos crear una frase extrayendo datos de otra y concatenando, ejemplo
		
		String nueva_frase = frase.substring(0, 29) + "ir a kuilandia y " + 
		frase.substring(29, 57);
		
		System.out.println(nueva_frase); //hoy es un estupendo dia para ir a kuilandia. 
		
		
		//comparar cadenas:
		String alumno1, alumno2;
		
		alumno1 = "Jesús";
		alumno2 = "jesús";
		
		System.out.println(alumno1.equals(alumno2)); //distingue may y min
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2)); //no distingue may y min
		
		System.out.println(frase.substring(20,57));
	}

}
