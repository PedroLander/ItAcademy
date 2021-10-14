package ejercicio4;

public class Main {

	public static void main(String[] args) {
		try {
			throw new HappyException("Ha ocurrido una excepción feliz");
		}
		catch(HappyException ex1) {
			System.out.println(ex1.mostrar_argum());
		}
		finally {
			System.out.println("Este mensaje se muestra siempre");
		}
	}

}
