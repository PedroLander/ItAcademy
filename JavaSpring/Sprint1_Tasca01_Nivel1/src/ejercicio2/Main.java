package ejercicio2;

public class Main {
    public static void main(String[] args){
        //El método 'static' se puede utilizar sin crear un objeto
        Main.metodo1();

        //El método 'no-static' se utiliza mediante un objeto de la clase
        Main e2 = new Main();
        e2.metodo2();
    }
    private static void metodo1(){
        System.out.println("Método 'static'");
    }
    private void metodo2(){
        System.out.println("Método 'no-static'");
    }

}