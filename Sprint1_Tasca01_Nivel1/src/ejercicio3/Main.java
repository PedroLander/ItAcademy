package ejercicio3;

public class Main {
    public static void main(String[] args){
        //Instanciamos el método estático que devuelve la dirección en memoria de la clase.
        System.out.println(Main.class.getAnnotations());

        //Creamos un objeto de la clase y buscamos la dirección en memoria de la clase que
        // instancia y comprobamos que no ha cambiado.
        Main e3 = new Main();
        System.out.println(e3.getClass().getAnnotations());

        //La dirección del objeto es otra.
        System.out.println(e3);

    }
}
