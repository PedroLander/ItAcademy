package ejercicio7;

public class Amphibian {
	public int posicion = 0;
    public int potencia = 1;
    public void moverse (){
        this.posicion += this.potencia;
    }
    public void crecer (){
        this.potencia +=1;
    }
}