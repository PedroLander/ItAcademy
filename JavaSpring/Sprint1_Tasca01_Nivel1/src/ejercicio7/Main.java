package ejercicio7;

public class Main {
    public static void main(String[] args){
    	
        Amphibian rana = (Amphibian) new Frog();

        System.out.println(rana.posicion);
        rana.moverse();
        System.out.println(rana.posicion);

    }
}