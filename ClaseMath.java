/*Usaremos la clase Math con sus metodos:
 * 
 * 		Math.sqrt(num) 				raiz cuadrada
		Math.pow(base,exponente) 	potencia de un numero
		Math.round(decimal) 		redondeo de un numero
		Math.Pi 					constante de clase con el numero PI
		Math.sin(angulo)/Math.cos(angulo)/Math.tan(angulo)*/

package primerosPasos;

public class ClaseMath {

	public static void main(String[] args) {
		
				//metodo sqrt
		
				double raiz = Math.sqrt(9); //Si lo declaramos int dara error pq devuelve siempre un double
				
				System.out.println(raiz);
				
				//metodo pow
				
				double potencia = Math.pow(2,3);//Si la declaramos int tambien da error
				
				System.out.println(potencia);
				
				//metodo round
				
				double num1 = 5.85; //si numero es un double, resultado tiene que ser long
				
				long resultado = Math.round(num1);
				
				System.out.println(resultado); //redondea a 6
				
				float num2 = 5.85F; //si numero es un float, resultado tiene que ser int
				
				int resultado1 = Math.round(num2); //redondea a 6
				
				System.out.println(resultado1);
				
				/*imaginemos que resultado tiene que ser si o si int, y el numero es double
				en este caso habria que hacer una refundicion del int
				esta se hace poniendo delante del tipo de dato que vamos a obtener
				el tipo de dato al que queremos convertirlo
				por ejemplo, en este caso queremos que el long que devuelve Math.round 
				sea un int*/
				
				double num3 = 5.35;
				
				int resultado3 = (int)Math.round(num3);//se puede producir una perdida de info
				//ya que pasamos un long a int
				
				float num4 = 5.35F;
				
				byte resultado4 = (byte)Math.round(num4); //obligamos a que resultado4 sea un byte
						
				System.out.println(resultado3);
				System.out.println(resultado4);
				
				
				//Math.abs devuelve el valor absoluto de un double
				
				int c = (int) Math.abs(num3);
				System.out.println(c);

	}

}
