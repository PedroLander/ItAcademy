package ejercicio4;

public class HappyException extends Exception{
	String argum1;
	public HappyException(String word){
		this.argum1 = word;
	}
	public String mostrar_argum() {
		return this.argum1;
	}
}
