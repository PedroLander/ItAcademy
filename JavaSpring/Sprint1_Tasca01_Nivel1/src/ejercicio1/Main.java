package ejercicio1;

public class Main {
    public Main(){
        System.out.println("Ejecuci�n del constructor");
    }
    public static void main(String[] args){
        System.out.println("Ejecuci�n del m�todo main");
        Main e1 = new Main();
        e1.salida();
    }
    private void salida(){
        System.out.println("Ejecuci�n del m�todo salida");
    }
}