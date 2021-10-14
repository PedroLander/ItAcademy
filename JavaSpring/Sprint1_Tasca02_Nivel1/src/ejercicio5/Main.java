package ejercicio5;

public class Main {

	public static void main(String[] args) {
		/*Genera un n�mero aleatorio entre 0 y 1.5. Mientras ese n�mero sea menor
		 * que 1, la divisi�n producir� un error aritm�tico y se generar� otro 
		 * n�mero al azar.
		 */		
		int attempt = 0;
		double rand = Math.random()*1.5;
		while (true) {
			
			System.out.println(rand);

			try {
				if (100/(int)rand <= 100) {
					break;
				}
			}
			catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				rand = Math.random()*1.5;
			}
			finally {
				attempt += 1;
				System.out.println(String.format("Intento %s", attempt));
			}
		}
	}
}
