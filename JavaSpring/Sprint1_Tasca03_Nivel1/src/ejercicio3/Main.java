package ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		Characters in_time = new Characters("Will Salas", "Sylvia Weis",
				"Rachel Salas","Henry Hamilton");


		
		  String[][] matrix = new String[3][3];
		  
		  for (int row = 0; row < 3; row++) {
			  for (int col = 0; col < 3 ; col++) {
			  matrix[row][col] = in_time.next();
			  }
		  System.out.println(matrix[0][2]);
		  System.out.println(matrix[0][3].length());
		  }
	}
}
