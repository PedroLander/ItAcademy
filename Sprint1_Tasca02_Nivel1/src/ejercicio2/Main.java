package ejercicio2;

public class Main {

	public static void main(String[] args) {
		Main m = null;
		try{
			System.out.println(m.getClass());
		}
		catch (NullPointerException ex1) {
			System.out.println(ex1.getMessage());
		}

	}

}