package ejercicio3;

public class Main {

	public static void main(String[] args) {
		String[] nombres = {"Julia", "Clara", "Andrés"};
		try {
		System.out.println(nombres[3]);
	}
		catch (ArrayIndexOutOfBoundsException ex1) {
			System.out.println(ex1.getMessage());
		}
	}
}
