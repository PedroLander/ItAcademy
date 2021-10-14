package ejercicio1;

public class Main {

	public static void main(String[] args) {
		try{
			System.out.println(4/0);
		}
		catch (ArithmeticException ex1) {
			System.out.println(ex1.getMessage());
		}
		finally {
			System.out.println("Ejecucion terminada");
		}

	}

}
