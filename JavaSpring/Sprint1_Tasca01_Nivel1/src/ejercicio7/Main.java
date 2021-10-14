package ejercicio7;

public class Main {
    public static void main(String[] args){
    	Amphibian sapo = new Amphibian();
        Amphibian rana = (Amphibian) new Frog();
        
        System.out.println(String.format(
        		"Potencia del sapo: %s", sapo.potencia));
        System.out.println(String.format(
        		"Potencia de la rana: %s", rana.potencia));
        
        // El método "crecer" de la subclase "Rana" sobreescribe 
        //el de la clase base "Amphibian".
        sapo.crecer();
        rana.crecer();
        
        System.out.println(String.format(
        		"Potencia del sapo tras crecer: %s", sapo.potencia));
        System.out.println(String.format(
        		"Potencia de la rana tras crecer: %s", rana.potencia));
        
    }
}