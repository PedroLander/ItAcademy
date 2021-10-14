package ejercicio4;

public class Main {

    static final int ATRIB1 = 777;
    final int ATRIB2 = 456;

    public static void main(String[] args){
        // Al campo 'static' se puede acceder instanciando directamente la clase.
        System.out.println(Main.ATRIB1);

        // Para acceder al campo 'no-static' se utiliza un objeto que instancie la clase.
        Main e4 = new Main();
        System.out.println(e4.ATRIB2);
    }
}