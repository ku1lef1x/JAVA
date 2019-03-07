/*Arrays bidimensionales, matrices (como las conocemos)
 * 
 * Declaramos una matriz de 4x5 y la rellenamos de forma manual para ver su fucionamiento*/


package primerosPasos;

public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		
		int [][] matriz = new int [4][5];
		
		matriz[0][0]=15;
		matriz[0][1]=21;
		matriz[0][2]=18;
		matriz[0][3]=90;
		matriz[0][4]=15;
		
		matriz[1][0]=10;
		matriz[1][1]=52;
		matriz[1][2]=17;
		matriz[1][3]=19;
		matriz[1][4]=70;
		
		matriz[2][0]=19;
		matriz[2][1]=20;
		matriz[2][2]=19;
		matriz[2][3]=17;
		matriz[2][4]=70;
		
		matriz[3][0]=92;
		matriz[3][1]=13;
		matriz[3][2]=13;
		matriz[3][3]=32;
		matriz[3][4]=41;			
		
		//para recorrerla usamos dos bucles for, uno para una dimension otro para la otra
		
		for (int i=0; i<4;i++) {							//dimension de 0-3 por eso i<4
			
			for (int j=0; j<5;j++) {						//dimension de 0-4 por eso j<5
				
				System.out.print(matriz[i][j] + ", ");
			}
			
			System.out.println(" ");
		}
		
		
		//piramide
		
		
		for(int i=0; i<10;i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(int i=10; i>0; i--){
			for (int j=0; j<i; j++) {
				System.out.print("*");				
			}
			System.out.println(" ");
		}
	}

}
