package ejercicio7;

public class Frog extends Amphibian {
    public void croar (){
        System.out.println("¡Croac, croac!");
    }
    public void moverse (){
        this.posicion += 2;
    }
}