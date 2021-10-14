package ejercicio1;

public class Main {
    public Main(){
        System.out.println("Ejecución del constructor");
    }
    public static void main(String[] args){
        System.out.println("Ejecución del método main");
        Main e1 = new Main();
        e1.salida();
    }
    private void salida(){
        System.out.println("Ejecución del método salida");
    }
}